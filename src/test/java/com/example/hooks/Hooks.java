package com.example.hooks;

import commons.GlobalConstants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Hooks {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static final Logger log = Logger.getLogger(Hooks.class.getName());

    @Before
    public static WebDriver openAndQuitBrowser() {

        String browser = System.getProperty("BROWSER");
        System.out.println("Browser name run by command line = " + browser);

        if (driver.get() == null) {
            try {
                if (browser == null) {
                    browser = System.getenv("BROWSER");
                    if (browser == null) {
                        browser = "chrome";
                    }
                }
                switch (browser) {
                    case "chrome":
                        driver.set(new ChromeDriver());
                        break;
                    case "safari":
                        driver.set(new SafariDriver());
                        break;
                    case "firefox":
                        driver.set(new FirefoxDriver());
                        break;
                    default:
                        driver.set(new ChromeDriver());
                        break;
                }
            } catch (UnreachableBrowserException e) {
                driver.set(new ChromeDriver());
            } catch (WebDriverException e) {
                driver.set(new ChromeDriver());
            }
            finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
            driver.get().get(GlobalConstants.DEV_ADMIN_URL);
            driver.get().manage().timeouts().implicitlyWait(GlobalConstants.getGlobalConstants().getLongTimeout(), TimeUnit.SECONDS);
            driver.get().manage().window().maximize();
            log.info("------------- Started the browser -------------");
        }
        return driver.get();
    }

    public static void close() {
        try {
            if (driver.get() != null) {
                openAndQuitBrowser().quit();
                log.info("------------- Closed the browser -------------");
            }
        } catch (UnreachableBrowserException e) {
            System.out.println("Can not close the browser");
        }
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            close();
        }
    }

}
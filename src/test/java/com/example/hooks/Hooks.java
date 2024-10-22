package com.example.hooks;

import commons.GlobalConstants;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Hooks {

    //private static WebDriver driver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static final Logger log = Logger.getLogger(Hooks.class.getName());

    @Before
    public static WebDriver openAndQuitBrowser() {
        // Run by Maven command line
        String browser = System.getProperty("BROWSER");
        System.out.println("Browser name run by command line = " + browser);

        // Check driver đã được khởi tạo hay chưa?
        if (driver.get() == null) {

            // Happy path case
            try {
                // Kiem tra BROWSER = null -> gan = chrome/ firefox (browser default for project)
                if (browser == null) {
                    // Get browser name from Environment Variable in OS
                    browser = System.getenv("BROWSER");
                    if (browser == null) {
                        // Set default browser
                        browser = "firefox";
                    }
                }
                switch (browser) {
                    case "chrome":
                        driver.set(new ChromeDriver());
                        break;
                    case "firefox":
                        driver.set(new FirefoxDriver());
                        break;
                    case "ie":
                        driver.set(new EdgeDriver());
                        break;
                    default:
                        driver.set(new ChromeDriver());
                        break;
                }
                // Browser crash/ stop
            }
            // Code này luôn luôn được chạy dù pass hay fail
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
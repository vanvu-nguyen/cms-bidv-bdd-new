package com.example.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;
import static org.junit.platform.launcher.LauncherConstants.DRY_RUN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")  // Path to your feature files (adjust this if needed)
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.stepDefinitions")  // Package for step definitions
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME, value = "false")  // Enable parallel execution
/*@ConfigurationParameter(key = PARALLEL_CONFIG_STRATEGY_PROPERTY_NAME, value = "scenarios")*/
@ConfigurationParameter(key = DRY_RUN_PROPERTY_NAME, value = "false")
public class TestRunner {
}

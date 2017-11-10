package com.globant.automation.bootcamp.webdriver;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.openqa.grid.internal.utils.configuration.StandaloneConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.LogManager;

enum Context {

  INSTANCE;

  private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

  WebDriver getDriver() {
    return DRIVERS_PER_THREAD.get();
  }

  WebDriver init(Browser browser) throws MalformedURLException {
    terminate(); // Just in case we have an existing driver running in the same thread
    browser.initialize();
    URL url = new URL(System.getProperty("SELENIUM_URL", "http://127.0.0.1:4444/wd/hub"));
    WebDriver driver = new RemoteWebDriver(url, browser.getCapabilities());
    DRIVERS_PER_THREAD.set(driver);
    return driver;
  }

  void terminate() {
    WebDriver driver = getDriver();
    if (driver != null) {
      getDriver().quit();
    }
    DRIVERS_PER_THREAD.remove();
  }

  Context() {
    StandaloneConfiguration configuration = new StandaloneConfiguration();
    SeleniumServer server = new SeleniumServer(configuration);
    // Turn off verbose logging from Selenium Server...(default is ON)
    ((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.OFF);
    LogManager.getLogManager().getLogger("").setLevel(java.util.logging.Level.OFF);
    server.boot();
    // Register a hook in the JVM to shut down the Selenium server cleanly before terminating
    Runtime.getRuntime().addShutdownHook(new Thread(server::stop));
  }

}
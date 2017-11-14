package com.bootcamp.framework.runner;

import com.bootcamp.framework.logging.Logging;
import com.bootcamp.framework.selenium.Selenium;
import com.bootcamp.framework.web.Browser;
import com.bootcamp.framework.web.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.ParameterizedType;

import static java.lang.String.format;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Generic (not JUnit/TestNG specific) class that all test runners inherit from.
 * <p>
 * Contains common code that initializes the first page object instance just by extending this parameterized class.
 * <p>
 * Contains methdos setUp and tearDown that must be called from sub-classes.
 *
 * @author Juan Krzemien
 */
public abstract class GenericWebAutomationTest<T extends PageObjectBase> implements Logging {

  static {
    Runtime.getRuntime().addShutdownHook(new Thread(Selenium.SERVER::stop));
  }

  private T startingPage;

  /**
   * Calculates the value of parameter type "T" of this WebAutomationJUnitSuite instance.
   * <p>
   * Uses reflection to do so.
   *
   * @return parameter type "T" of this WebAutomationJUnitSuite instance
   */
  @SuppressWarnings("unchecked")
  private Class<T> getParameterizedType() {
    return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }

  @SuppressWarnings("unchecked")
  protected T getStartingPage() {
    return startingPage;
  }

  public void setUp(Browser browser) {
    // Create the driver to inject into Page Object...
    WebDriver driver = new RemoteWebDriver(browser.getCapabilities());
    driver.manage().timeouts().implicitlyWait(1, SECONDS);
    driver.manage().window().maximize();

    // Instantiate Page Object calculated from parameterized type...
    // This is equal to: new PageObjectType(driver);
    Class<T> pageObjectType = getParameterizedType();
    try {
      getLogger().debug(format("Creating instance of [%s] with browser [%s]...", pageObjectType.getSimpleName(), browser));
      this.startingPage = pageObjectType.getConstructor(WebDriver.class).newInstance(driver);
    } catch (Exception e) {
      getLogger().error(format("Could not instantiate Page Object [%s]...", pageObjectType.getName()), e);
    }

        /*
         * This way, we do not expose WebDriver instance to tests.
         * We provide them with the first Page Object they need already initialized.
         */
  }

  public void tearDown() {
    getLogger().debug("Tearing down browser...");
    if (startingPage != null) {
      startingPage.dispose();
    }
  }

}

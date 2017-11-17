package com.globant.automation.bootcamp.webdriver.web;

import com.globant.automation.bootcamp.logging.Logging;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.String.format;

public enum Browser implements Initializable, HasCapabilities, Logging {

  CHROME {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        new Browser.MyChromeDriverManager().setup();
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.chrome();
    }
  },
  FIREFOX {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        new Browser.MyFirefoxDriverManager().setup();
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.firefox();
    }
  },
  IE {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        new Browser.MyIEDriverManager().arch32().setup(); // Arch64 is known to misbehave...
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.internetExplorer();
    }
  },
  EDGE {
    @Override
    public void initialize() {
      INITIALIZED.computeIfAbsent(ordinal(), n -> {
        new Browser.MyEdgeDriverManager().setup();
        return true;
      });
    }

    @Override
    public Capabilities getCapabilities() {
      return DesiredCapabilities.edge();
    }
  };

  private static final Map<Integer, Boolean> INITIALIZED = new ConcurrentHashMap<>();

  Browser() {
    getLogger().info(format("Initializing configuration for device [%s]...", name()));
  }


  // Following are classes meant to FIX Thread Safety issue in WebDriverManager library
  private static class MyChromeDriverManager extends ChromeDriverManager {

    @Override
    public void setup(Architecture architecture, String version) {
      String driverVersion = getDriverVersion();
      if (!driverVersion.equalsIgnoreCase(DriverVersion.LATEST.name()) || version.equals(DriverVersion.NOT_SPECIFIED.name())) {
        version = driverVersion;
      }
      manage(architecture, version);
    }

  }

  private static class MyIEDriverManager extends InternetExplorerDriverManager {

    @Override
    public void setup(Architecture architecture, String version) {
      String driverVersion = getDriverVersion();
      if (!driverVersion.equalsIgnoreCase(DriverVersion.LATEST.name()) || version.equals(DriverVersion.NOT_SPECIFIED.name())) {
        version = driverVersion;
      }
      manage(architecture, version);
    }

  }

  private static class MyFirefoxDriverManager extends FirefoxDriverManager {

    @Override
    public void setup(Architecture architecture, String version) {
      String driverVersion = getDriverVersion();
      if (!driverVersion.equalsIgnoreCase(DriverVersion.LATEST.name()) || version.equals(DriverVersion.NOT_SPECIFIED.name())) {
        version = driverVersion;
      }
      manage(architecture, version);
    }

  }

  private static class MyEdgeDriverManager extends EdgeDriverManager {

    @Override
    public void setup(Architecture architecture, String version) {
      String driverVersion = getDriverVersion();
      if (!driverVersion.equalsIgnoreCase(DriverVersion.LATEST.name()) || version.equals(DriverVersion.NOT_SPECIFIED.name())) {
        version = driverVersion;
      }
      manage(architecture, version);
    }

  }

}



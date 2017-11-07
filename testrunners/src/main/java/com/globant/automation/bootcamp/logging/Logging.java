package com.globant.automation.bootcamp.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implement this interface in any class to enable logging in it.
 * Thank you Java 8!
 *
 * @author Juan Krzemien
 */
public interface Logging {

  default Logger getLogger() {
    return LoggerFactory.getLogger(getClass());
  }

  /*default PrintStream getLogger() {
    return System.out;
  }*/

}

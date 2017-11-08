package com.globant.automation.bootcamp.runners.testng;

import com.globant.automation.bootcamp.logging.Logging;
import org.testng.annotations.Test;

import java.util.Random;

import static java.lang.String.format;
import static java.lang.Thread.currentThread;
import static org.testng.Assert.assertEquals;

/**
 * DEMO test suite to show how TestNG reuses *same* class instance for every test method.
 * <p>
 * This causes issues if you do not keep an eye on class's state (thread safety).
 * <p>
 * TestNG parallel options should be parallel="methods"...which, is the *only true* concurrent/parallel option it has at method test level.
 * <p>
 * You can play around with other parallel="..." options in XML file. You will see that Thread ID/Name changes accordingly.
 * <p>
 * Run this suite (from companion testng.xml file) *several* times and you will see it fail from time to time.
 *
 * @author Juan Krzemien
 */
public class Threading implements Logging {

  private static final String ERR_MESSAGE = "A is not what I set!";
  private boolean a;

  public Threading() {
    getLogger().info(format("IN CONSTRUCTOR: Class instance: %s Thread ID: %s Thread Name: %s ", this.hashCode(), currentThread().getId(), currentThread().getName()));
  }

  @Test
  public void test1() {
    boolean b = new Random().nextBoolean();
    a = b;
    assertEquals(a, b, ERR_MESSAGE);
  }

  @Test
  public void test2() {
    boolean b = new Random().nextBoolean();
    a = b;
    assertEquals(a, b, ERR_MESSAGE);
  }

  @Test
  public void test3() {
    boolean b = new Random().nextBoolean();
    a = b;
    assertEquals(a, b, ERR_MESSAGE);
  }

  @Test
  public void test4() {
    boolean b = new Random().nextBoolean();
    a = b;
    assertEquals(a, b, ERR_MESSAGE);
  }

}

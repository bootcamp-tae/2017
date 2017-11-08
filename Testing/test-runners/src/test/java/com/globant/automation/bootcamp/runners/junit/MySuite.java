package com.globant.automation.bootcamp.runners.junit;

import org.junit.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class MySuite {

    @BeforeClass
    public static void daSetUp() {
        System.out.println("Hey! I'm running this just ONCE!");
    }

    @AfterClass
    public static void daTearDown() {
        System.out.println("Hey! I'm running this just ONCE at the end!");
    }

    @Before
    public void setUp() {
        System.out.println("Hey! I'm running before each test!");
        Assume.assumeFalse(false);
    }

    @After
    public void tearDown() {
        System.out.println("Hey! I'm running after each test!");
    }

    @Test
    public void test1() {
        assertThat("These 2 things are equals", "mama", containsString("pa"));
    }

    @Test
    public void test2() {
        assertThat("These 2 things are equals", "mama", containsString("pa"));
    }

    @Test
    public void test3() {
        assertThat("These 2 things are equals", "mama", containsString("pa"));
    }


}

# TAE BootCamp MDQ 2017

## GitHub BootCamp account

    Url: https://github.com/bootcamp-tae/2017
    Username: bootcamp-tae
    Password: bootcamp2017

## Globant Guest Wireless Network Access

### Within Chill Out:

    SSID: Globers Chill    
    Password: gl0b4ntgu3st

### Within Auditorium:

    SSID: Globers    
    Password: globersaudi


## Software Requirements

You are *advised* to have the following software already installed in your computer by the time the BootCamp starts:   

* [JDK 8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)

    * Define environment variable **JAVA_HOME** as JDK installation path

* [Maven 3](http://maven.apache.org/download.cgi)

    * Set _<Maven_path>/bin_ folder in environment variable **PATH**

* [Git](https://git-scm.com/downloads)

    * Make sure to configure your personal information in it:
                                      
       ```bash
       git config --global user.name “FirstName LastName”
       git config --global user.email “Your Email”
       git config --global push.default simple
       ```
       
    * Clone this repository to your own computer
    
        ```bash
        git clone https://github.com/bootcamp-tae/2017.git
        ```

## Agenda Core Topics

* Testing Concepts

    * Test Cases
    * Test Plan

* Version Control Systems - **Git**

* Maven and [Maven Central Repository](https://search.maven.org/)

* Test Runners

    * [JUnit 4.x official documentation](http://junit.org/junit4/) | [JUnit 5 official documentation](http://junit.org/junit5/)
    * [TestNG official documentation](http://testng.org/doc/documentation-main.html) 
        
* Data Driven Testing
* Test Driven Development

### Web UI Testing

* [WebDriver](https://www.w3.org/TR/webdriver/) 

    * Architecture
    * [Selenium](http://www.seleniumhq.org/docs/) ([Download](http://www.seleniumhq.org/download/))    
    * Locators

* Good Practices

    * Synchronization
    * Page Object pattern
    * Asserts and data validation (soft assertions)
    * Logging

### API / Service Testing

* [HTTP](https://tools.ietf.org/html/rfc2616) verbs, codes and flows
* Objects (un)marshalling
* HTTP clients
    * [RestEasy](http://resteasy.jboss.org/)
    * [Retrofit](http://square.github.io/retrofit/)
* Authorization / Authentication
* Good Practices

### Mobile Automated Testing

* [Appium](http://appium.io/) 
* [Android SDK](https://developer.android.com/studio/index.html#downloads)
* Android ADB
* Emulators: x86 [Genymotion](https://www.genymotion.com/fun-zone/)
* iOS Simulator (if available)

### Continuous Integration

* [Jenkins](https://jenkins.io/)

### Distributed testing

* [Selenium Grid](http://www.seleniumhq.org/download/)
* [Selenium Extras](https://github.com/groupon/Selenium-Grid-Extras)

### Other testing types

* BDD & Gherkin syntax based automated tests

    * [JBehave](http://jbehave.org/reference/latest/) / [Selenium related](http://jbehave.org/reference/web/stable/using-selenium.html)
    
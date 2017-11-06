# TAE BootCamp MDQ 2017

## GitHub BootCamp account

* Url: https://github.com/bootcamp-tae/2017
* Username: bootcamp-tae
* Password: bootcamp2017

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

* Within Globant offices, in order to access internet from Maven, it *may* be required to define a Maven file called _[HOME]/.m2/settings.xml_ with the following content:

```xml
<settings>
    <proxies>
        <proxy>
            <id>globant-proxy</id>
            <active>true</active>
            <protocol>http</protocol>
            <host>proxy.corp.globant.com</host>
            <port>3128</port>
            <username></username>
            <password></password>
            <nonProxyHosts>127.0.0.1</nonProxyHosts>
        </proxy>
    </proxies>
</settings>
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
    * [Selenium](http://www.seleniumhq.org/docs/)    
    * Locators

* Good Practices

    * Synchronization
    * Page Object pattern
    * Asserts and data validation (soft assertions)
    * Logging

### API / Service Testing

* HTTP verbs, codes and flows
* Objects (un)marshalling
* HTTP clients
    * [RestEasy](http://resteasy.jboss.org/)
    * [Retrofit](http://square.github.io/retrofit/)
* Authorization & Authentication
* Good Practices

### Mobile Automated Testing

* [Appium](http://appium.io/) 
* Android SDK
* Android ADB
* Emulators
* iOS Simulator (if available)

### Continuous Integration

* [Jenkins](https://jenkins.io/)

### Distributed testing

* Selenium Grid

### Other testing types

* BDD & Gherkin syntax based automated tests

    * [JBehave](http://jbehave.org/reference/latest/) / [Selenium related](http://jbehave.org/reference/web/stable/using-selenium.html)
    
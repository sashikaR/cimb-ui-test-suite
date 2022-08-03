# CIMB UI Test Automation Framework

This automation framework has developed using Serenity BDD, Cucumber and Selenium frameworks. 
## The prerequisite

1. Java 11
2. Maven 3

### The project directory structure
The project is build using Maven, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
             check_on_cimb_deals.feature
```
## Executing the tests
To run the this project, you can either just run the `CucumberTestSuite` test runner class, or run either `mvn verify` or `mvn clean install` from the command line.

### Test Report
Test report will be generated after the test-run in `<project-dir>/target/site/serenity/index.html`
# designPatterns

## Project Structure

```
+-- designPatterns
   +-- src
       +-- test
           +-- java
               +-- leftoutpatterns
                   +-- BuilderPattern.java
                   +-- FacadePattern.java
                   +-- SingletonPattern.java
               +-- pages 
                  +-- HomePage.java
                  +-- PaymentPage.java
               +-- testscipts 
                   +-- RootTest.java
                   +-- TicketBookingTest.java
                   +-- TotalPriceTest.java
               +-- utilities
                   +-- BrowserDriverFactory.java
                   +-- GetConfigProps.java
                   +-- WebActions.java
           +-- resources 
               +-- config.properties 
   +-- pom.xml
   +-- testng.xml
```

- ### Design Patterns used in this project are as follows
    - Page Object Model. 
    - Factory Design Pattern.
    - [Singleton Design Pattern](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/leftoutpatterns/SingletonPattern.java) - Explicit simple example to understand the concept. 

- ### [pages package](https://github.com/AST-LW-TV/designPatterns/tree/main/designPatterns/src/test/java/pages)
    - [HomePage Class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/pages/HomePage.java) - Home page components.
    - [PaymentPage class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/pages/PaymentPage.java) - Payment page components.
  
- ### [utilities package](https://github.com/AST-LW-TV/designPatterns/tree/main/designPatterns/src/test/java/utilities) 
    - [BrowserDriverFactory Class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/utilities/BrowserDriverFactory.java) - Implements the **Factory Driver Design Pattern**.
    - [WebActions Class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/utilities/WebActions.java) - **CommonActions Pattern** in Page Object Model.
    - [GetConfigProps Class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/utilities/GetConfigProps.java) - Implements the static method *getValue* to get the config properties from [config file](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/resources/config.properties).

- ### [testscripts package](https://github.com/AST-LW-TV/designPatterns/tree/main/designPatterns/src/test/java/testscripts)
    - [RootTest Class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/testscripts/RootTest.java) - It is *Base* class used to set up preconditions.
    - Derived Classes from Root Class      
      - [TicketBookingTest Class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/testscripts/TicketBookingTest.java) - Test to verify No.Of passengers for the trip.
      - [TotalPriceTest Class](https://github.com/AST-LW-TV/designPatterns/blob/main/designPatterns/src/test/java/testscripts/TotalPriceTest.java) - Test to verify the total price with actual specified value.
  
- To run execute the test cases, use the following command 
```
mvn -P designPatterns test
```
> OutComes -> 1 Test Pass and 1 Test Fail
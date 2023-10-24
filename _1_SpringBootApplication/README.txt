What is Spring?
    Spring is a VERY popular FRAMEWORK for building Java applications. It provides a large number of helper classes and annotations.

What is the problem with Spring?
    The problem with Spring is that it is VERY DIFFICULT to build applications with it. In order to even get started you need to answer questions like...
        Q: Which JAR dependencies do I need?
        Q: How do I set up configuration (xml or Java?)
        Q: How do I install the server? (Tomcat? JBoss? etc.)

This is where Spring Boot comes into play, and is a lifesaver, it does the following...
    -Makes it easier to get started with Spring development.
    -Minimizes the amount of manual configuration, as exclaimed above.
        -Performs autoconfiguration based on the props file and JAr classpath.
    -Helps resolve dependency conflicts (Marven or Gradle)
    -Provies an embedded HTTP server so you can get started quickly.
        -Tomcat, Jetty, Undertow (These are all HTTP servers)

Spring Boot uses Spring behind the scenes and Spring Boot simply makes it easier to use Spring.

The "Spring Initializer" is used to...     (https://start.spring.io/)
    -Quickly create a starter Spring Boot project.
    -Select your dependencies
    -Creates a Maven or Gradle project that you can DOWNLOAD, and then IMPORT into your IDE (IntelliJ, Netbeans, Eclipse, etc)
    -The Spring Initializer can be found at (https://start.spring.io/)

-The "Spring Boot Embedded Server"...
    -Comes with Spring Boot, and provides an embedded HTTP server so you can get started quickly. NO NEED TO INSTALL A SERVER SEPARATELY.
        - Tomcat, Getty, Undertow, etc.

-Because of this, we can run our Spring Boot Apps as a standalone, since it includes an embedded server. This means we can run our Spring Boot application from our IDE/Command Line.

-For now, the development process is as follows...
    -Configure our project using the Spring Boot Initializer USING MAVEN.
    -Download the zip file.
    -Unzip the file and import the Maven project into the IDE.

-We have, as an example, a Spring Boot Maven project already brought into this file directory, it is named "mySpringBootApp"

-If we run the application, and go to where the application is being hosted (localhost:8080), we will see that an error appears. This is because we don't have any code to run.
-This is where "REST Controllers" come into play. REST Controllers are used to populate/do something on your Spring Application.

-Creating a REST Controller would look something like this...

    @RestController
    public class HelloWorldRestController {

    @GetMapping("/") // This is the same concept as calling an HTTP GET request using Node.js/Express.js in JavaScript.
    public String sayHello() {
        return "Hello World!";
     }
    }
    
-Visit the official spring website "spring.io" for a lot of answers to your questions and documentation.

-----END OF SECTION-----


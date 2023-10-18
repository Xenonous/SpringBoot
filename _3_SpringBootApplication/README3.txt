As we know, Spring groups many dependencies together into larger "Super Dependencies".
    -To view a list of your project dependencies, you can go to "View -> Tool Windows -> Maven"
    -This will allow you to see the smaller components/dependencies of larger dependencies.
    -For example, this projects dependency hierarchy looks like this...

        "org.springframework.boot:spring-boot-starter-web:3.1.4" (this is the super dependency.)
            "org.springframework.boot:spring-boot-starter"
            "org.springframework.boot:spring-boot-starter-json"
            "org.springframework.boot:spring-boot-starter-tomcat"
            "org.springframework:spring-web"
            "org.springframework:spring-webmvc"

------------------------------------------------------------
As you may have noticed, whenever you make a change to your code, you need to rerun the application in order for it to take effect on the server.
Remember, this used to be the case when we were learning Node.js and Express.js, but "nodemon" saved us and allowed for the server to automatically update in real-time whenever a change was detected in the code.
We have a similar solution to that but for Spring Boot. It's called the "spring-boot-devtools"

What is "spring-boot-devtools"?
    -It is a way to automatically restart your application when any changes are detected in the code, much like "nodemon" for Express.js / Node.js

How do we add "spring-boot-devtools" to our project?
    -For most IDEs, Spring DevTools is automatically supported, so all we need to do is add it as a dependency in our "pom.xml" file.

        <dependency>
            <groupId>org.springframework.boot</groupId>
        	<artifactId>spring-boot-devtools</artifactId>
        </dependency>

    -However for IntelliJ, Spring DevTools IS NOT automatically supported, so a few extra steps are needed.
        -We need to enable the following "File -> Settings -> Build, Execution, and Deployment -> Compiler -> Build Project Auto"
        -We also need to enable the following "File -> Settings -> Advanced Settings -> Allow auto-make to start..."

------------------------------------------------------------
The "Spring Boot Actuator" is used to expose endpoints (REST/HTTP REQUESTS) to manage and monitor your application.
Just like with the previous functionality, we need to add this one via a dependency. We can easily get DevOps functionality out-of-the-box.
    -The following is the dependency needed to add this functionality to our web application...

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

    -Now you can try it. When using any actuator endpoints you need to first specify "/actuator".
    -One example of an endpoint created by this dependency is the health endpoint.
        -The health endpoint ("/health"), checks the status of your application. Try it! (localhost:PORT/actuator/health)

    -Another example is the "/info" endpoint. It's typically empty unlike the health endpoint, but can be configured via the "application.properties" file we visited earlier.
    -The following is how you configure this (and any other) endpoints. Think of this as basically enabling them.
        "management.endpoints.web.exposure.include=health,info"
        "management.info.env.enabled=true" , this will now include the "info" endpoint to the application, try it!
    - NOTE: If you wanted to include ALL ENDPOINTS ACROSS HTTP, you could use the "*" syntax instead of listing individual actuator endpoints.

    -Now the endpoint will be empty unless you add information to it, which can be done (and will be done) in the "application.properties" file.

    -The following are some other Actuator endpoints.
        -"/auditevents", Audit events for your application
        -"/beans", List of all beans registered with your Spring application context
        -"/mappings" Lists all "@RequestMappings" paths.

        MANY MORE. SEE (https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html) for the full list.
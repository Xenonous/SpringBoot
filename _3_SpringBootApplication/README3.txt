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

As you may have noticed, whenever you make a change to your code, you need to rerun the application in order for it to take effect on the server.
Remember, this used to be the case when we were learning Node.js and Express.js, but "nodemon" saved us and allowed for the server to automatically update in real-time whenever a change was detected in the code.
We have a similar solution to that but for Spring Boot. It's called the "spring-boot-devtools"

What is "spring-boot-devtools"?
    -It is a way to automatically restart your application when any changes are detected in the code, much like "nodemon" for Express.js / Node.js

How do we add "spring-boot-devtools" to our project?
    -For most IDEs, Spring DevTools is automatically supported, so all we need to do is add it as a dependency in our "pom.xml" file.
    -However for IntelliJ, Spring DevTools IS NOT automatically supported, so a few extra steps are needed.
        -We need to enable the following "File -> Settings -> Build, Execution, and Deployment -> Compiler -> Build Project Auto"
        -We also need to enable the following "File -> Settings -> Advanced Settings -> Allow auto-make to start..."

During development, we spend a good deal of our time in our IDE. However, at times, we may want to work outside the IDE on our web application.
One approach to doing this is to run our web application through the command line.
There are two ways of doing this...

    METHOD 1: Use "java -jar NAME-OF-JAR-FILE"
        Step 1: Use the terminal and go to your web applications directory using the "ls" and "cd" commands.
        Step 2: Package the directory into a JAR file. To do this, all you need to do is type "mvnw package"
        Step 3: The JAR file will be created and is stored in the "target" directory. Find the JAR file in the target directory like so...
            "cd /target", this will take us to the target directory where the JAR file is stored.
             "ls *.jar", this will show us all the JAR files in our current directory.
        Step 4: Run the JAR file. "java -jar NAME-OF-JAR-FILE"

        NOTE: This method is fairly annoying when your "JAVA_HOME" PATH isnt set correctly or your using different Java JDKs.

    METHOD 2: Use Spring Boot Maven Plugin. "mvnw spring-boot:run"
        Step 1: Use the terminal and go to your web applications directory using the "ls" and "cd" commands.
        Step 2: Use the following command "./mvn spring-boot:run"

--------------------------------------------------------------------
Additionally, as we've done before, we can define variables in our "application.properties" file and transfer them to our RESTController for further use.
The steps to take to do this process are as follows...
    1. Create our variables in the "application.properties" file.

        "coach.name=Chad"
        "team.name=The Giga Chads"

    2. Now we can access these variables by using the "@Value" annotation. (This is done in our Java files)

        @RestController
        public class MyRestController {

            @Value("${coach.name}")
            private String coachName;

            @Value("${team.name}")
            private String teamName;

        }

--------------------------------------------------------------------
There are over a THOUSAND properties you can use with Spring Boot in the "application.properties" file.
These Spring Boot properties are all grouped into the following categories...
    -CORE
        -Manages stuff like the logging levels. Examples include...
            1. "logging.level.org.springframework=DEBUG"
            2. "logging.level.org.hibernate=TRACE"
            3. "logging.level.com.luv2code=INFO"

    -WEB
        -Manages stuff relating to the server.
            1. "server.port=3000"
            2. "server.servlet.context-path=/MY-APP"
                -USING THESE TWO TOGETHER WILL MAKE THE URL FOR VISITING YOUR WEB APPLICATION "localhost:3000/MY-APP"
            3. "server.servlet.session.timeout=15min"
                -DEFAULT IS 30min

    -Security
        -Manages all things security in your Spring Boot web application.
            1. "spring.security.user.name = Chad"
            2. "spring.security.user.password = 9877"

    -Data
        -Manages all things related to Data. Includes any setup of JDBCs including login to the database.
            1. "spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce"
            2. "spring.datasource.username=scott"
            3. "spring.datasource.password=myPassword"

    -Actuator
        -Manages pre-built endpoints to include with your web application.
            1. "management.endpoints.web.exposure.include=*"
            2. "management.endpoints.web.exposure.exclude = beans,mapping"
            3. "management.endpoints.web.base-path=/actuator"
                -This is if you want to change the keyword used instead of ".../actuator/..."

    -Integration
    -DevTools
    -Testing

All the most commonly used Spring Boot application properties can be found at...

https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties.security


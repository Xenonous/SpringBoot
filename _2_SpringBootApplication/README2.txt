In this section, we will learn the basics of Maven, we will...
    1. View the dependencies in the Maven "pom.xml" file that's included with every Spring Boot project.
    2. Go over the Spring Boot basics for Maven.

What is Maven?
    -Maven is a Project Management Tool.
    -Maven's most popular use is for build management and dependencies.

What Problems does Maven solve?
    -When we build our project, we may need additional JAR files like "Spring", "Hibernate", "Commons Logging", "JSON", etc.
        -One approach to this is to download EACH of the JAR files from each of their respective websites.
        -From there, you can manually add these JAR files to your build path / classpath, again, manually.
    -Maven automates this process and makes it far easier. All you do is tell Maven the projects (dependencies) you are working with, such as "Spring", "Hibernate", etc.
        -From there, Maven will automatically find and download the required JAR files for you, so you dont need to do it manually.
        -Keep in mind, you wouldn't even need to add these JAR files to path manually either, Maven does this as well.

Where/What is the Maven configuration file?
    -The "pom.xml" is the configuration file for Maven based projects.

What is the "Standard Directory Structure?"
    -The "Standard Directory Structure?" is a standard for how files should be organized in a Spring development environment.
    -See the "SpringStandardDirectoryStructure.png" image for more information, the following are the important file location to mention.
        "src/main/java" - This is where your Java source code should be written.
        "src/main/resources" - This is where your properties/config files should be that are written by your application.
        "src/main/webapp" - This is where your Java Server Pages (JSP), Images, CSS, HTML files should be located.
        "src/test" - This is where you should run your unit testing.
        "target" - This is where your destination directory for compiled code is stored, Maven handles this automatically.

What does the "POM.XML" file contain?
    -Project metadata (name, version, output file type, etc)
    -List of project dependencies
    -Any additional plugins
    (See the "pom.xml" file for this Spring Boot Application for an example.)

What does Group ID, Artifact ID, and Version ID mean when you're setting up your Spring Boot project via the Initializer?
    "groupId" - Name of your COMPANY, ORGANIZATION, GROUP. Usual the REVERSE of your web applications domain name.
    "artifactID" - Name of the project.
    "versionID" - A specific release for the project. A version ID that includes "SNAPSHOT" is a version currently under development.
    -These three in action are sometimes abbreviated GAV (group, artifact, version.)

    (See the "ProjectCoordinates.png" image for a visual rundown of this concept.)
    (SEE THE "pom.xml" FILE FOR AN EXAMPLE OF ALL THREE OF THESE BEING USED.)


When setting up a dependency manually, you only NEED to include the GroupID and the ArtifactID in the pom file. VersionID is optional, but SHOULD still be included.

Finally, we have our "src/main/resources" directory. This is home to the "application.properties" file, that is typically empty but can be filled with useful Spring Boot commands.
    -Such a command includes...
        -"server.port = 3000", which will set the port to whatever you want. Remember, by default, the port the web application is ran on is 8080

    The resource directory also includes the "static" directory. These include files such as...
        -HTML files
        -CSS files-
        -JavaScript files
        -Image files, etc.

    And lastly, the resource directory also includes the "templates" directory, which we will go over at a later time.

-----END OF SECTION-----
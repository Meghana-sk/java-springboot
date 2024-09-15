## Java Development Environment
- JDK 17 needed for springboot 3
- To check JDK version on mac, use command `/usr/libexec/java_home -V`

## Springboot overview
### Spring
- Spring very powerful framework for building java applications
- Provides large set of helper classes and annotations

### The problem ??
- Building traditional spring application is hard.
    - Which JAR dependencies do I need?
    - How do I set up configuration(xml or Java)?
    - How do I install server? (Tomcat, JBoss etc)

### Springboot solution
- Make it easier to get started with spring development
- Minimise the amount of manual configuration
- Perform auto-configuration based on props files and JAR classpath
- Provide embedded HTTP server so you can get started wuickly
    - Embedded Tomcat, Jetty, Undertow..

### Springboot and Spring
- Sprint boot uses Spring behind the scenes
- Spring boot simply makes it easier to use Spring

### Spring initialiser
- Quickly create a starter Spring boot project
    https://start.spring.io/
- Select dependencies
- Creates Maven/Gradle project and import into IDE

### Spring boot embedded server
- Embedded HTTP server like Tomcat, Jetty, Undertow
- No need to install a server separately
- mycoolapp.jar includes application code and includes a server

### Running spring boot apps
- Spring boot apps can be run standalone(includes embedded server)
- Run spring boot app from IDE or command line
    `java -jar mycoolapp.jar`

### Deploying spring boot apps
- Spring boot can also be deployed in tradiitonal way
- Deploy WAR file to external server. Tomcat, JBoss, WebSphere
etc.

### Springboot FAQ
Q. Does spring boot replace Spring MVC, Spring Rest etc?
- No. Instead Springboot actually uses those technologiees

Q. Does springboot run code faster than regular spring code?
- No, behind the scenes, spring boot uses same code of spring framework. Springboot makes easier to get started with minimal configurations

### Spring initialiser
Maven:
- When building Java project, you may need additional JAR files. example spring, hibernate, commons logging, JSON etc
- One approach is to download JAR files from each project web site
- Manually add JAR files to your build path/ classpath
- However, if you tell Maven dependencies and will make them available JAR files during compile/run. - MAVEB is a helper

### Development process
1. Configure project using initialiser http://start.spring.io . select maven project, in Java language, give group name, artifact name, packaging will be JAR, dependencies as springweb
2. Download zip file
3. Unzip the file
4. Import project into IDE

- When you run the app on intellij, you get the following logs in terminal
```
Starting MycoolappApplication using Java 22.0.1 with PID 1660 
MycoolappApplication   : No active profile set, falling back to 1 default profile: "default"
 : Tomcat initialized with port 8080 (http) +05:30  INFO 1660 --- [mycoolapp] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
[mycoolapp] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.28]
2024-09-08T15:08:01.705+05:30  INFO 1660 --- [mycoolapp] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-09-08T15:08:01.705+05:30  INFO 1660 --- [mycoolapp] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 396 ms
2024-09-08T15:08:01.857+05:30  INFO 1660 --- [mycoolapp] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2024-09-08T15:08:01.862+05:30  INFO 1660 --- [mycoolapp] [           main] c.m.s.d.mycoolapp.MycoolappApplication   : Started MycoolappApplication in 0.877 seconds (process running for 1.106)
```












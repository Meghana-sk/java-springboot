## Springboot project structure

| Directory          | Description                               |
| ------------------ | ----------------------------------------- |
| src/main/java      | Java source code                          |
| src/main/resources | Properties/ config files used by your app |
| src/test/java      | Unit testing source code                  |

### Maven wrapper files

- File `mvnw` - Maven wrapper files allow you to run a Maven project
  - No need to have Maven installed or present on your path
  - If correct version of Maven is not your computer,
    - Automatically downloads correct version and runs Maven
  - two files - `mvnmd.cmd` is for windows and `mvnw.sh` is for linux
  - `./mvnw clean compile test`
- If Maven is already installed, then these files can be ignored or deleted and use `mvn clean compile test`

### Maven POM file

- Contains info entered on spring initialzr website
- It has dependencies - spring boot starters
- Spring boot maven plugins - used to package executable jar or war archive `./mvnw package` and `mvnw spring-boot:run`

### Application properties

- by default, Springboot will load properties from `resource/application.propeties` file.
- `application.properties` will be created by Spring initializr empty at the beginning. You can add spring boot properties
  - `server.port=8585`
  - own custom properties `team.name=Dumbeldore`
- Read data from application.properties. We can read this `team.name` or make use in REST controller by making use of injection.

```Java
    @RestController
    public class FunRestController{
        @Value("${team.name}")
        private String teamName;

        @Value("${team.size}")
        private int teamSize;
    }
```

- Here `@Value` injection of the property is done to `teamName`

### Static content

- By default, Spring Boot will load static resources from "/static" directory.

  - Examples - HTML files, CSS, Javascript, images etc
    If you place these in static directory, springboot automatically loads into your application

- NOTE/WARNING:
  - Do not use src/main/webapp directory if your application is packaged as a JAR. Although this is a standard Maven directory, it works only with WAR packging. It is silently ignored by most build tools if you generate a JAR.

### Templates

- Springboot includes auto-configuration for following template engines
  - FreeMarker
  - Thymeleaf - popular template engine
  - Mustache

### Unit Tests

- Sprinboot unit test class created by Spring Initializr in `src/test/`

### Springboot starters

#### Problem

- Building a spring application is really Hard! what dependencies needed.
- How do we figure out what dependencies should be in pom file

#### Solution

Springboot starters

- A curated list of Maven dependencies
- A collection of dependencies grouped together
- Tested and verified by the Spring development team
- Makes it much easier for the developer to get started with Spring
- Reduces the amount of Maven configuration
- There are 30+ starters
- To check starters go to `View > Tool Windows > Maven > Dependencies` in Intellij IDE

Springboot starter psrent

- Springboot provides a starter parent which is a special starter that provides Maven defaults in pom.xml

```Xml
    <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.3.3</version>
		<relativePath/> <!-- lookup parent from repository -->
    </parent>

```
- The following Maven defaults are defined in starter parent
    - Default compiler level
    - UTF-8 source encoding
    - Others...
- To override a default, set as a property 
```Xml
    <properties>
		<java.version>22</java.version>
	</properties>
```
- For the spring-boot-starter-* dependencies, no need to list version.
- Default configuration of springboot plugin provided
```Xml
    <plugin>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-maven-plugin</artifactId>
	</plugin>
```

#### Benefits of Starter parent
- Default Maven configuration: Java version, UTF-encoding etc
- Dependency management
    - Use version of aprent only
    - `spring-boot-starter-* dependencies inherit version from parent
- Deafult configuration of Spring Boot plugin


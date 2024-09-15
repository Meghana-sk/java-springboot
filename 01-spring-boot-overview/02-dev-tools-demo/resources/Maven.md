## Spring Boot and Maven
- When you generate projects using Spring Initializr http://start.spring.io , it can generate a Maven project for you
- Basics of Maven
    - Viewing dependencies in Maven pom.xml file
    - Spring Bot starters for Maven

### What is Maven
- Maven is a project management tool
- Most popular use of Maven is for build management and dependencies

### What problems does Maven solve?
- When building your Java project, you may need additional JAR files - Spring, Hibernate, JSON etc
- One approach is to download the JAR files from each project website and manually add them to build path / class path

### Maven solution
- Tell Maven the projects you are working with(dependencies) - spring, hibernate
- Maven will go out and download JAR files for projects for you and will make them available during compile/run
- Maven is like a friendly helper

### Maven - How it works
- Maven reads project config file
- Maven checks local repo(your computer if it is already residing- local cache)
- Otherwise downloads from Maven Central Repository(remote/ internet)
- Then it helps to builds and runs

### Building and Running
- When you build and run your aoo, Maven handles class/build path for you
- Based on config file, Maven will add JAR files accordingly

### Maven directory structure

### Advantages of Maven
- Dependency management
    - Maven will find JAR files for you
    - No more missing JARs
- Building and Running your project
- Standard directory structure

### Maven key concepts
1. POM file - pom.xml
    - Project object model file
    - Configuration file for your project
    - Located in the root of your Maven project
    #### POM file structure
    1. Project meta deta - project name, version, output file type: JAR,WAR
    2. Dependencies - List of projects we depend on Spring, hibernate etc
    3. Plugins - Additional custom tasks to run: Generate JUnit test reports etc

2. Project coordinates
- These uniquely identify a project
- Groupid - name of company, group or org(use reverse domain: com.meghana), artifactid - name of project, version - (if project under development use - SNAPSHOT eg: 1.0 - SNAPSHOT)
- Dependency coordinates referred as `GAV`

### How to find dependency coordinates
1. Option 1 - visit project page(spring.io, hibernate.org)
2. Option 2 - Visit https://central.sonatype.com 



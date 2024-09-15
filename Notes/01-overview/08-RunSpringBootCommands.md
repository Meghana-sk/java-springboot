### Run from command line
- When running from command line, no need to have IDE open/running
- Since we using Spring Boot, the server is embedded in our JAR file. No need to have separate server installed/running
- Spring boot apps are self contained
- Option 1 -  `java -jar mycoolapp.jar`
- Option 2 - `mvnw spring-boot:run`
If Maven is already installed, then delete mvnw files and just run `mvn clean compile test`

- Package the app using `mvnw package`

### Injecting custom application properties
#### Problem
- We always need app to be configurable without hardcoding any value
- You need to read app configuration from a properties file
- By default, Spring Boot reads information from a standard properties file located at `src/main/resources/application.properties`
- Custom properties can be defined in this file and spring boot app can access properties using `@Value`

```
// application.properties
coach.name=Meghana
team.name=voyage
```

```Java
    @RestController
    public class FunRestController(){
        @Value("${coach.name}")
        private string coachName;

        @Value("${team.name}")
        private string teamName;
    }
```
- Spring Boot has 1000+ properties
- The properties are roughly grouped into following categories
    - Core
    - Web
    - Security
    - Data
    - Actuator
    - Integration
    - Devtools
    - Testing

- Example of **Core** properties for logging
    ```
    logging.level.org.springframework=DEBUG
    logging.level.org.hibernate=TRACE
    logging.level.org.mycoolapp=INFO
    ```
- Different logging levels
    - TRACE
    - DEBUG
    - INFO
    - WARN
    - ERROR
    - FATAL
    - OFF
- You can give a file name where all lpgs should be saved.
    ```
    # log levels for security mapping
    logging.level.org.springframework=DEBUG
    logging.level.org.hibernate=TRACE
    logging.level.org.mycoolapp=INFO

    # log file names
    logging.file.name=myapp.log
    logging.file.path=c:/myapps/demo
    ```
- Example of **Web** properties
    ```
    # http sever port
    server.port=7080

    # context path of application
    server.servlet.context-path=/myinfo

    #default http session time out - minutes(m)
    server.servlet.session.timeout=15m
    ```
    - When you set context path, every requests will be prefixed with /myinfo. If you do not provide this, then you get 404 not found. For example you have `/workout` request mapping, then simply `localhost:8080/myinfo/workout` should be used and `localhost:8080/workout` will fail with 404 status.
- Example of **Actuators** properties
    ```
    management.endpoints.web.exposure.include= mappings, threaddump
    management.endpoints.web.exposure.exclude=health, info
    # custom base path for actuator
    management.endpoints.web.base-path=/myactuator
    ```

- Example of **Security** properties
    ```
    #default user name
    spring.security.user.name=admin
    #default user password
    spring.security.user.password=topsecret
    ```
- Example of **Data** properties
    ```
    #JDC URL of database
    spring.datasource.url=jdbc:mysql://localhost:3306/products

    # Login username of database
    spring.datasource.username=meghana

    # Login password of database
    spring.datasource.passowrd=home
    ```

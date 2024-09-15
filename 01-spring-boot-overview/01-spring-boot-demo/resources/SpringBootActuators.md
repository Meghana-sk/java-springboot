### Spring Boot Actuators
- How can I monitor and manage my application?
- How can I check application health?
- How can I access application metrics?
 
#### Solution is Spring Boot Actuators
- Exposes endpoints to monitor and manage your application
- You easily get DevOps functionality out-of-the-box
- Simply add the dependency to your POM file
- REST endpoints are automaticallly added to your application
- Adding the dependency to POM file
```Xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
- Actuator automatically exposes endpoints for metrics out-of-the-box
- Endpoints are prefix with: `/actuator`

`/health` - health information about your application. Used to check app is up or down. 
```
/actuator/health
{
  "status": "UP"
}
```

#### Exposing endpoints
- By default, `/health` is exposed.
- The `/info` endpoint can provide information about your application
-To `/expose`, in `src/main/resources/application.properties` , add `management.endpoints.web.exposure.include=health, info` and `management.info.env.enabled=true`
- Now if you run the app in route `/actuator/info` you get empty json object. To customise, you can add the following to `application.properties` file
```
info.app.name=My super app
info.app.description=A crazy app
info.app.version=1.0.0
```
```json
{
  "app": {
    "name": "My super app",
    "description": "A crazy app",
    "version": "1.0.0"
  }
}
```

| Name          | Description                               |
| ------------------ | ----------------------------------------- |
| /auditevents      | Audit events for your application                          |
| /beans | List of all beans registered in the Spring application context |
| /mappings      | List of all @RequestMappingPaths                  |

- `management.endpoints.web.exposure.include=*` exposes all actuator endpoints

#### Get a list of beans
- Access `/actuator/beans` , but what about security? We have some locking mechanism for this. This gives all Spring beans registered with your application - Spring Boot internal beans and also your custom beans for your app which helps in debugging your application

#### Endpoints
 `/threaddump` - Gives list of all threads running in your application. Useful for analyzing and profiling your application performance


 ### Securing spring boot actuator endpoints
 - Add spring security to project and endpoints are secured.
 - `/health` is still available, you can disable if you want
 - Once you add security starter, when you access `/actuator/beans`, spring security will prompt for login. Default user name is user and password will be in console where the application is being run
 - We can override user name and password in application.properties
 ```
 spring.security.user.name=meghana
 spring.security.user.password=win
 ```

 #### Exclude endpoints
 ```
 management.endpoints.web.exposure.exclude=health,info`
 ```
 



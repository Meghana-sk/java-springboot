### Dependency injection
- The dependency inversion principle
- The client delegates to another object the responsibility of providing its dependencies

#### Injection types
- There are multiple types of injection with Spring
- Two recommended types of injection
    - Constructor injection
    - Setter injection

which one to use?
- Construcor injection
    - Use when you have required dependencies
    - Recommended by spring.io
- Setter injection
    - Use when you have optional dependencies
    - If dependency is not provided, your app can provide reasonable default logic

#### Spring auto wiring
- For dependency injection, spring can use autowiring
- Spring will look for a class that matches
    matches by type: class or interface
- Spring will inject it automatically, hence it is called autowiring

#### Constructor injection steps
1. Define depedency interface and class
2. Create Demo REST controller
3. Create a constructor in your class for injections
4. Add @GetMapping for /workouts

#### @Component
- It marks the class as Spring bean. Spring bean is just a regular Java class that is managed by Spring
- It also makes the bean available for dependency injection

#### Component scanning
- `@SpringBootApplication` is composed of following annotations
    - `@EnableAutoConfiguration`
    - `@ComponentScan` - Enables component scanning of current package. Also recursively scans sub-packages
    - `@Configuration` - able to register extra beans with @Bean or import other configuration classes
- By default, Spring boot will not component scan packages which are outside main spring boot application class and subpackages
- If you want other packages to scan, then provide scanBasePackages in annotation `@SpringBootApplication(scanBasePackages={"com.meghanask.springcoredemp","edu.sci.tech"})`

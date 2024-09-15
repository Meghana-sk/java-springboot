### Devtools
- When running springboot application, if you make changes to source code, then you have to manually restart your application
- So `spring-boot-devtools` will resolve the above issue.
    - Automatically restarts your application when code is updated
    - Add dependency in pom.xml
    - No additional code
    ```Xml
    <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-devtools</artifactId>
	</dependency>
    ```
- To add this in Intellij, `Settings > Preferences > Build , Execution , Deployment > Compiler > check build project automatically`
- Also `Settings > Preferences > Advance Settings > Check allow auto-make to start even if developed application is still running`

### Inversion of Control(IoC)
- The approach of outsourcing the construction and management of objects
- Scenario - Say we have my app and we call getDailyWorkout method to cricketCoach 
.
- Here app should be configurable such that coach should be changeable based on sport.

Solution -  My app gives a coach object to Object factory creates/configures different coaches based on coach object.

#### Spring container
- Primary functions
    - Create and manage objects(Inversion of control)
    - Inject object dependencies(Dependency injection)

#### Configuring spring container
- XML configuration file(legacy) - will not follow
- Java annotations(modern)
- Java source code(mdern)
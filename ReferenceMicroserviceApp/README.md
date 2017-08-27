# ReferenceMicroserviceApp

Hi there! I'm a readme file that's a work in progress, so don't mind my current formatting!

# Installing
1. Make sure you have Java 8 SDK, Eclipse, and a Git client installed.<br />
2. In Eclipse, click `help` then click `Eclipse Marketplace`. Search for `STS` and install the spring tools.<br />
3. In Eclipse, click `help` then click `Eclipse Marketplace`. Search for `Buildship Gradle` and install it<br />
4. refresh gradle by right-clicking on the project, then click gradle->refresh gradle project . This may take a few minutes to refresh as there's a lot to download!<br />
5. Now run `Application.java` as a Spring Boot Application and open your browser to `http://localhost:38080`.


# Notes
Use SLF4J for logging.
   

# TODO
Check out the `Issues` for todos.



Tango_Microservices as requested by Mark Zietara - August 25th 2017


Antonio:
a) added Swagger
	http://localhost:8080/swagger-ui.html

b) added Spring Boot Actuator - https://github.com/spring-projects/spring-boot/tree/master/spring-boot-actuator
   endpoints.sensitive=false in application.properties (to enable all features)
	Features:
	- Endpoints: /health
	- Metrics: /metrics
	- Audit
	- Process Monitoring
	
c) Added Lombok - https://projectlombok.org/
	Simplify creation of data objects (creates setters/getters automaticaly)
	
	
TODO
d) Circuit Breaker
https://github.com/Netflix/Hystrix/wiki/Dashboard
e) Security
	Mutual SSL?
f) Secrets
g) Configuration manager
h) Database connectors and console (h2?)
i) Messaging (RabbitMQ?)
j) Cache and Session (Redis? Gemfire?)
k) Service Registry (Eureka) - https://github.com/spring-cloud-samples/eureka
l) bean validations (JSR-303)





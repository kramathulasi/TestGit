								Java Microservices Development
==========================================================================================================
1. Monolythic Draw backs

2. Microservices Architecture & why

3. Service Registry (Discovery Service)

4. Admin Server

5. Zipkin Server

6. APIs Development(Backend micro services)

7. Interservice communication(Feign Client)

8. API Gateway(Routing and Filters)

9. Cloud config Server

Application can be developed in 2 ways

1. Monolithic Architecture

2. Microservices Architecture

1)  Monolithic Architecture: 
===================================
It is a software design pattern where all components of a system are integrated into a single, unified Application.

Challenges:
------------
- Tight coupling 

- Maintenance Complexity

- Deployment Risks

- Scalability Issues


2. Microservices Architecture:
======================================
- It is not a frameowrk, technology, language and API

- It is an architectural design pattern

- It is an universal pattern, and anyone can use this architecture to develop the applications 

Advantages with Microservices:
----------------------------------
1. Loosely coupled

2. Burden reduced on servers

3. Easy maintaince

4. No single point of failure

5. Technology independent

6. Quick deliverables

Challenges With Microservices:
---------------------------------
1. Bounded context

	Identifying how many microservices we need to develop for one application 
		and deciding which functionality we need to add in which microservice.
 
2. Repeated configurations

	In several microservices we need to write same configurations like datasource, kafka, smtp, redis...

3. visibility

	In microservice architecture we might not get chance to work with all apis in the application.


Microservices Architecture:
====================================
- There is no fixed architecture for microservices development

- We can customize microservices architecture according to our project requirement

- As part of microservices architectire we are going to use below components(All the below components are not manadatory)

1. Service Registry

2. Admin Server

3. Zipkin Server

4. Config Server

5. Kafka Server

6. Redis Server

7. FeignClient

8. API Gateway

Service Registry:
=========================
- Service registry is used to maintain all apis information like name, status, url and health at one place.

- It is also called as Service Discovery

- We can use "Eureka Server" as service registry. It is provided by spring cloud library.

- It will provide user interface to get apis information

Steps to Develop Service Registry:
----------------------------------------
1. Create springboot application with below dependency 

		-Eureka Server (spring-cloud-starter-netflix-eureka-server)

2. Configure @EnableEurekaServer annotation in boot start class(@SpringBootApplication) 

3. Configure below properties in application properties or yml file

server.port=8761

#Disable the Eureka client to act as a server only. This service will not be display under instances
eureka.client.register-with-eureka=false

Note-1: If the service registry project port is "8761" then clients can discover service-registry and will register automatically with service-registry

Note-2: If service-registry project running on any other port number then we have to register clients with service registry manually

4. Once the application started, we can access Eureka Dashboard using below url

	http://localhost:8761/


Admin Server:
========================
- It is used to monitor and manage all the apis at one place.

- It provides user interface to access all apis actuator endpoints at one place

Ex:
    Health checks

	Config properties

	url mappings

	beans loaded

	change log levels

	thread dumps

	heap dumps
	
Steps to Develop Spring Admin Server:
----------------------------------------
- Create boot application with "admin-server" dependency
	(select it while creating the project)

- Configure @EnableAdminServer annotation at start class

- Change Port Number (Optional) Ex: server.port = 1111

- Run the boot application 

- Access the application url in browser 

	http://localhost:1111/


ZipKin Server:
=========================
- It is used for distributed tracing of our requests

Ex:
1. how much time taking to process one request

2. which microservice taking more time to process

3. how many services involved in one request processing

- It provides user interface to access apis execution details

Steps to work with Zipkin server:
-----------------------------
1. Download the zipkin jar file from internet

	URL: https://zipkin.io/pages/quickstart.html

Java: Download jar file and open command prompt

2. Run Zipkin jar file
	
	$ java -jar <jar-nam> 

3. Zipkin Server runs on Port number is 9411

4. Access the Zipkin Server dashboard

	URL: http://localhost:9411/


Config Server:
===========================
- It is used to seperate application code and application properties

- It is used to externalize config props of our application

- It makes our application loosely coupled with properties file or yml file

Feignclient:
=======================
- It is used for interservice communication

- If one api communicate with another api with in the same application 

	then it is called as interservice communication

API Gateway
========================
- It acts as entry point for all backend apis

- It acts mediator between frontend app and backend apis

- In API Gateway we will write filters + routings

	Filter: we can perform pre-process and post process

	Routings: to forward request to particular backend api


Welcome Service Microservice Devlopment: Service registration with all servers
============================================================================
1. Create spring boot application with below dependencies

	-Eureka Discovery client
		spring-cloud-starter-netflix-eureka-client

	-Admin client
		spring-boot-admin-starter-client

	-Zipkin 
		micrometer-tracing-bridge-brave
		zipkin-reporter-brave
	
	-Web MVC // REST API's
		spring-boot-starter-web

	-Spring DevTools //Auto restart for small changes
		spring-boot-devtools

	- Actuators  // Health checkups
		spring-boot-starter-actuator

2. Configure @EnableDiscoveryClient annotation at boot start class 

3. Create Restcontroller with required method 

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage()
	{
		return ResponseEntity.ok("Welcome to Spring Cloud");
	}
}

4. Configure below properites in application.properties file

spring.application.name=04-Welcome-Service
server.port=8081

#URL of Eureka Server. This is optional now as eureka server running on port 8761
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/

#URL of the Admin Server
spring.boot.admin.client.url=http://localhost:1111/

#All Endpoints to be enabled
management.endpoints.web.exposure.include=*

Manual Registry with Eureka:
==============================
If the Eureka server is not running on port 8761 then we need to 
register Welcome Service manually by adding the below property in application.properties file

eureka.client.service-url.defaultZone=http://localhost:9080/eureka/

5. Run the application and check in eureka Dashboard (welcome service instance should be displayed in eureka dashboard)
	
6. Check Admin Server dashboard (welcome service should be displayed) we can access application details here.

Ex: Beans, loggers, heap dump, thread dump, metrics, mappings etc....

7. Send request to API method

	http://localhost:8081/welcome
	
8. Check Zipkin server UI and click on Run Query button

	It will display trace=id with details.


Steps to Develop Greet API: Feign Client for Inter microservices communication
==============================================================================
Interservice communication will be done using below 3 ways.

1. Rest Template: 
-----------------
- RestTemplate is a synchronous REST client which performs HTTP requests using a simple template-style API. 
- We can also state that RestTemplate class is a synchronous client and is designed to call REST services.

@Configuration
public class EmployeeConfig {
 
    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
 
    @Bean
    public RestTemplate restTemplateBean() {
        return new RestTemplate();
    }
 
}

@Service
public class EmployeeService {
 
    @Autowired
    private EmployeeRepo employeeRepo;
 
    @Autowired
    private ModelMapper mapper;
 
    @Autowired
    private RestTemplate restTemplate;
 
    public EmployeeResponse getEmployeeById(int id) {
 
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
 
        AddressResponse addressResponse = restTemplate.getForObject("http://localhost:8081/address-service/address/{id}", AddressResponse.class, id);
        employeeResponse.setAddressResponse(addressResponse);
 
        return employeeResponse;
    }
 
}

2. Web client:
---------------
- WebClient is an interface illustrating the main entry point for performing web requests. 
- It is also known as the reactive web client which is introduced in Spring 5. 
- This new client is a reactive, non-blocking solution that works over the HTTP/1.1 protocol. 
- We can also say that it is a replacement for the classic RestTemplate. 
- It is a part of spring-webflux library and also offers support for both synchronous and asynchronous operations
- This can be used for external provider
pom.xml
------
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>

Application.properties
-------------------
# Set Your Context Path Here
server.servlet.context-path=/employee-service
addressservice.base.url=http://localhost:8081/address-service

- After adding the library create Bean for WebClient in the configuration file like below

@Configuration
public class EmployeeConfig {
 
    @Value("${addressservice.base.url}")
    private String addressBaseUrl;
 
    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
 
    @Bean
    public WebClient webClient() {
        return WebClient.builder().baseUrl(addressBaseUrl).build();
    }
 
}

@Service
public class EmployeeService {
    @Autowired
    private WebClient webClient;

    public EmployeeResponse getEmployeeById(int id) {
 
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
 
        // Using WebClient
        AddressResponse addressResponse = webClient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
        employeeResponse.setAddressResponse(addressResponse);
 
        return employeeResponse;
    }
}


3. Feign Client:
==================
- My provider(Same project/internal) is running in multiple servers/urls then we should go ahead Feign client. It uses the Load balancing to get the service name.
- Communication is recomended via name of the service

- Add below dependency to the pom.xml file.
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

- After adding the library annotate the main Application file with this @EnableFeignClients annotation like below
@SpringBootApplication
@EnableFeignClients
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

Create an Interface and annotate it with @FeignClient and declare your calling methods like below

@FeignClient(name = "giveYourServiceName", url = "provideYourUrlHere", path = "provideYourContextPathHere")
public interface AddressClient {

    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("id") int id);

}

@Service
public class EmployeeService {

    // Spring will create the implementation
    // for this class
    // and will inject the bean here (proxy)
    @Autowired
    private AddressClient addressClient;
/	/ More Code Here
    public EmployeeResponse getEmployeeById(int id) {
    
        // More Code Here

        // Using FeignClient
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse.getBody());

        return employeeResponse;
    }
}

--------------------------------------------------------------
1. Create spring boot application with below dependencies -> Greet Application

	-Eureka Discovery client
		spring-cloud-starter-netflix-eureka-client

	-Admin client
		spring-boot-admin-starter-client

	-Zipkin 
		micrometer-tracing-bridge-brave
		zipkin-reporter-brave
	
	-Web MVC // REST API's
		spring-boot-starter-web

	-Spring DevTools //Auto restart for small changes
		spring-boot-devtools

	- Actuators  // Health checkups
		spring-boot-starter-actuator
		
	- FeignClient //Inter service communication
		spring-cloud-starter-openfeign

2. Configure @EnableDiscoveryClient and annotation at boot start class 

3. Create Restcontroller with required method 

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMessage()
	{
		return ResponseEntity.ok("Good Morning");
	}
}

4. Configure below properites in application.properties file

spring.application.name=04-Welcome-Service
server.port=9091

#URL of Eureka Server. This is optional now as eureka server running on port 8761
#eureka.client.service-url.defaultZone=http://localhost:8761/eureka/

#URL of the Admin Server
spring.boot.admin.client.url=http://localhost:1111/

#All Endpoints to be enabled
management.endpoints.web.exposure.include=*

Manual Registry with Eureka:
==============================
If the Eureka server is not running on port 8761 then we need to 
register Welcome Service manually by adding the below property in application.properties file
eureka.client.service-url.defaultZone=http://localhost:9080/eureka/

5. Create FeignClient interface to communicate with welcome service

@FeignClient(name="04-WELCOME-SERVICE") // Application from Eureka server of welcome service
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String getMessage();

}


5. Run the application and check in eureka Dashboard (welcome service instance should be displayed in eureka dashboard)
	
6. Check Admin Server dashboard (welcome service should be displayed) we can access application details here.

Ex: Beans, loggers, heap dump, thread dump, metrics, mappings etc....

7. Send request to API method

	http://localhost:8081/welcome
	
8. Check Zipkin server UI and click on Run Query button

	It will display trace=id with details.

Load Balancing:
====================
- If we run our application in one server then burden will be increased on that server.

1. Single Server should handle all the load

2. Burden on server

3. Response delay

4. Server can crash

5. Single point of failure

To overcome above problems we will run our application in multiple
servers so that we can distribute the requests to multiple servers

-> Load Balancer is used to distribute requests to multiple servers

- We have below advantages with load balancer
 
	1. Less burden on server
	
	2. Quick responses to clients
	
	3. No single point of failure
	
-----------------------------------	
Steps to Implement Load Balancer
------------------------------------

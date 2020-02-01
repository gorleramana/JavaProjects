/**
 * 
 */
package org.javabrains.spring.practice;

/**
 * @author RamanaGorle
 *
 *         Spring is one of the most widely used Java EE framework. Spring
 *         framework core concepts are “Dependency Injection” and “Aspect
 *         Oriented Programming”.
 * 
 *         Because of Spring Frameworks layered architecture, you can use what
 *         you need and leave which you don’t. Spring Framework enables POJO
 *         (Plain Old Java Object) Programming which in turn enables continuous
 *         integration and testability. JDBC is simplified due to Dependency
 *         Injection and Inversion of Control. It is open-source and has no
 *         vendor lock-in.
 */
public class SpringFeatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Following are some of the major features of Spring Framework :
		 * 
		 * Lightweight: Spring is lightweight when it comes to size and transparency.
		 * 
		 * Inversion of control (IOC): The objects give their dependencies instead of
		 * creating or looking for dependent objects. This is called Inversion Of
		 * Control.
		 * 
		 * Aspect oriented Programming (AOP): Aspect oriented programming in Spring
		 * supports cohesive development by separating application business logic from
		 * system services.
		 * 
		 * Container: Spring Framework creates and manages the life cycle and
		 * configuration of the application objects.
		 * 
		 * MVC Framework: Spring Framework’s MVC web application framework is highly
		 * configurable. Other frameworks can also be used easily instead of Spring MVC
		 * Framework.
		 * 
		 * Transaction Management: Generic abstraction layer for transaction management
		 * is provided by the Spring Framework. Spring’s transaction support can be also
		 * used in container less environments.
		 * 
		 * JDBC Exception Handling: The JDBC abstraction layer of the Spring offers an
		 * exception hierarchy, which simplifies the error handling strategy.
		 */

		/**
		 * There are around 20 modules which are generalized into Core Container, Data
		 * Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation
		 * and Test.
		 * 
		 * Spring Core Container – This layer is basically the core of Spring Framework.
		 * It contains the following modules : Spring Core Spring Bean SpEL (Spring
		 * Expression Language) Spring Context
		 * 
		 * Data Access/Integration – This layer provides support to interact with the
		 * database. It contains the following modules : JDBC (Java DataBase
		 * Connectivity) ORM (Object Relational Mapping) OXM (Object XML Mappers) JMS
		 * (Java Messaging Service) Transaction
		 * 
		 * Web – This layer provides support to create web application. It contains the
		 * following modules : Web Web – MVC Web – Socket Web – Portlet
		 * 
		 * Aspect Oriented Programming (AOP) – In this layer you can use Advices,
		 * Pointcuts etc., to decouple the code.
		 * 
		 * Instrumentation – This layer provides support to class instrumentation and
		 * classloader implementations.
		 * 
		 * Test – This layer provides support to testing with JUnit and TestNG.
		 * 
		 * Few Miscellaneous modules are given below:
		 * 
		 * Messaging – This module provides support for STOMP. It also supports an
		 * annotation programming model that is used for routing and processing STOMP
		 * messages from WebSocket clients.
		 * 
		 * Aspects – This module provides support to integration with AspectJ.
		 */

		/**
		 * Spring Ioc Container:
		 * 
		 * At the core of the Spring Framework, lies the Spring container. The container
		 * creates the object, wires them together, configures them and manages their
		 * complete life cycle. The Spring container makes use of Dependency Injection
		 * to manage the components that make up an application. The container receives
		 * instructions for which objects to instantiate, configure, and assemble by
		 * reading the configuration metadata provided. This metadata can be provided
		 * either by XML, Java annotations or Java code.
		 */

		/**
		 * Dependency Injections:
		 * 
		 * In Dependency Injection, you do not have to create your objects but have to
		 * describe how they should be created. You don’t connect your components and
		 * services together in the code directly, but describe which services are
		 * needed by which components in the configuration file. The IoC container will
		 * wire them up together.
		 */

		/**
		 * Spring 5 brought a massive update to Spring framework. Some of the new
		 * features in Spring 5 are:
		 * 
		 * Spring 5 runs on Java 8+ and supports Java EE 7. So we can use lambda
		 * expressions and Servlet 4.0 features. It’s good to see Spring trying to
		 * support the latest versions.
		 * 
		 * Spring Framework 5.0 comes with its own Commons Logging bridge; spring-jcl
		 * instead of standard Commons Logging.
		 * 
		 * Support for providing spring components information through index file
		 * “META-INF/spring.components” rather than classpath scanning.
		 * 
		 * Spring WebFlux brings reactive programming to the Spring Framework.
		 * 
		 * Spring 5 also supports Kotlin programming now. This is a huge step towards
		 * supporting functional programming, just as Java is also moving towards
		 * functional programming.
		 * 
		 * Support for JUnit 5 and parallel testing execution in the Spring TestContext
		 * Framework.
		 */
	}

}

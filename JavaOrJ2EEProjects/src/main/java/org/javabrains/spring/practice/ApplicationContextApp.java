/**
 * 
 */
package org.javabrains.spring.practice;

import org.javabrains.spring.beans.practice.BeanAutowiring;
import org.javabrains.spring.beans.practice.ConstructorInjection;
import org.javabrains.spring.beans.practice.InitializingCollections;
import org.javabrains.spring.beans.practice.InjectingObjects;
import org.javabrains.spring.beans.practice.InnerBeans;
import org.javabrains.spring.beans.practice.SetterInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RamanaGorle
 *
 */
public class ApplicationContextApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/**
		 * setter injection
		 */
		SetterInjection setterInjection = (SetterInjection) context.getBean("triangle");
		setterInjection.draw();
		System.out.println("is Triangle1");
		/**
		 * constructor injection
		 */
		System.out.println();
		ConstructorInjection constructorInjection = (ConstructorInjection) context.getBean("triangle2");
		constructorInjection.draw();
		System.out.println("is Triangle2");
		/**
		 * Injecting objects
		 */
		System.out.println();
		InjectingObjects injectingObjects = (InjectingObjects) context.getBean("triangle3");
		injectingObjects.draw();
		System.out.println("is Triangle3");
		/**
		 * Inner Beans
		 */
		System.out.println();
		// InnerBeans innerBeans = (InnerBeans) context.getBean("triangle4");
		// OR
		// InnerBeans innerBeans = (InnerBeans) context.getBean("triangle4-alias");
		// OR
		InnerBeans innerBeans = (InnerBeans) context.getBean("triangle4-name");
		innerBeans.draw();
		System.out.println("is Triangle4");
		/**
		 * Initializing collections
		 */
		System.out.println();
		InitializingCollections initializingCollections = (InitializingCollections) context.getBean("triangle5");
		initializingCollections.draw();
		System.out.println("is Triangle5");
		/**
		 * There are different ways through which we can autowire a spring bean.
		 * 
		 * autowire byName – For this type of autowiring, setter method is used for
		 * dependency injection. Also the variable name should be same in the class
		 * where we will inject the dependency and in the spring bean configuration
		 * file.
		 * 
		 * autowire byType – For this type of autowiring, class type is used. So there
		 * should be only one bean configured for this type in the spring bean
		 * configuration file.
		 * 
		 * autowire by constructor – This is almost similar to autowire byType, the only
		 * difference is that constructor is used to inject the dependency.
		 * 
		 * autowire by autodetect – If you are on Spring 3.0 or older versions, this is
		 * one of the autowire options available. This option was used for autowire by
		 * constructor or byType, as determined by Spring container. Since we already
		 * have so many options, this option is deprecated. I will not cover this option
		 * in this tutorial.
		 * 
		 * @Autowired annotation – We can use Spring @Autowired annotation for spring
		 *            bean autowiring. @Autowired annotation can be applied on variables
		 *            and methods for autowiring byType. We can also use @Autowired
		 *            annotation on constructor for constructor based spring autowiring.
		 * 
		 *            For @Autowired annotation to work, we also need to enable
		 *            annotation based configuration in spring bean configuration file.
		 *            This can be done by context:annotation-config element or by
		 *            defining a bean of type
		 *            org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.
		 * 
		 * @Qualifier annotation – This annotation is used to avoid conflicts in bean
		 *            mapping and we need to provide the bean name that will be used for
		 *            autowiring. This way we can avoid issues where multiple beans are
		 *            defined for same type. This annotation usually works with
		 *            the @Autowired annotation. For constructors with multiple
		 *            arguments, we can use this annotation with the argument names in
		 *            the method.
		 * 
		 *            By default spring bean autowiring is turned off. Spring bean
		 *            autowire default value is “default” that means no autowiring is to
		 *            be performed. autowire value “no” also have the same behavior.
		 */
		System.out.println();
		BeanAutowiring beanAutowiring = (BeanAutowiring) context.getBean("triangle6");
		beanAutowiring.draw();
		System.out.println("is Triangle6");
		/**
		 * Resource leak happens when a program doesn't release the resources it has
		 * acquired. ... So we explicitly call close() methods to free up resources .
		 * NOTE : Garbage collection in java can only mange memory resources
		 */
		((ClassPathXmlApplicationContext) context).close();
	}

}

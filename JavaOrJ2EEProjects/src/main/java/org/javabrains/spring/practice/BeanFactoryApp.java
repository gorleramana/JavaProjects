/**
 * 
 */
package org.javabrains.spring.practice;

import org.javabrains.spring.beans.practice.SetterInjection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author RamanaGorle
 *
 *         This is the simplest container providing basic support for Dependency
 *         Injection and defined by the
 *         org.springframework.beans.factory.BeanFactory interface. The
 *         BeanFactory and related interfaces, such as BeanFactoryAware,
 *         InitializingBean, DisposableBean, are still present in Spring for the
 *         purposes of backward compatibility with the large number of
 *         third-party frameworks that integrate with Spring
 */
public class BeanFactoryApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * BeanFactory:
		 * 
		 * It uses Lazy initialization
		 * 
		 * It explicitly provides a resource object using the syntax
		 * 
		 * It doesn’t supports internationalization
		 * 
		 * It doesn’t supports annotation based dependency
		 */
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		SetterInjection setterInjection = (SetterInjection) beanFactory.getBean("triangle");
		setterInjection.draw();
	}

}
package com.sonal.hellospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// ApplicationContext
		// BeanFactory

		// Resource res = new ClassPathResource("spring.xml");
		// BeanFactory factory = new XmlBeanFactory(res);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Object obj = context.getBean("id1");
		WelcomeBean wb = (WelcomeBean) obj;
		wb.show();

	}
}

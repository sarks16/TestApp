package com.sonal.helloworld;

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

		// Resource res = new ClassPathResource("springabc.xml");
		// BeanFactory factory = new XmlBeanFactory(res);

		ApplicationContext context = new ClassPathXmlApplicationContext("springabc.xml");

		// Object obj = context.getBean("id1");
		// WelcomeBean wb = (WelcomeBean) obj;
		
		WelcomeBean wb = (WelcomeBean) context.getBean("id1");

		wb.show();

	}
}

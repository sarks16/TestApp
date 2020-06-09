package com.sonal.springannotation1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sonal.springannotation1")
public class AppConfig {

	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public Processor getProcessor() { return new Snapdragon(); // return
	 * new MediaTek(); }
	 */

}

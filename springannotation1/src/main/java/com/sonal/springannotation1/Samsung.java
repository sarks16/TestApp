package com.sonal.springannotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier("snapdragon")
	Processor processor;

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void config() {
		System.out.println("8GB | 32 MP | 5000 mAh");
		System.out.println("Processor: " + processor.process());
	}

}

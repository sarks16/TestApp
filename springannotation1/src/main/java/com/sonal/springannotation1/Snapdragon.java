package com.sonal.springannotation1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements Processor {

	public String process() {
		return "Snapdragon";
	}

}

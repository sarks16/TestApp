package com.sonal.springannotation1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements Processor {

	public String process() {
		return "MediaTek";
	}

}

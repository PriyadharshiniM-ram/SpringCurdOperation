package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("e")
public class Elephant implements Animal {

	@Override
	public void sound() {
		System.out.println("trumpet...");
		
	}

}

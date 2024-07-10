package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("r")
public class Rat  implements Animal{

	@Override
	public void sound() {
		System.out.println("squeaks");
		
	}

}

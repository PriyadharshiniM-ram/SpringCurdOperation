package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	
	@Autowired
	@Qualifier("e")
	private Animal a1;
	
	
	@Autowired
	@Qualifier("r")
	private Animal a2;
	
	public void getAnimalSound() {
		a1.sound();
		a2.sound();
	}
	

}

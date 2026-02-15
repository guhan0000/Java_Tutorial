package com.java8;

import java.time.LocalDateTime;

public interface JavaEightInterface {
	
	default void greet() {
		System.out.println("Hi Default Method inside an Interface");
	}
	static LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}

}

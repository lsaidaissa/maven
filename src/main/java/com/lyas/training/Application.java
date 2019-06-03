package com.lyas.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
	
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for (String greeting: greetings) {
			System.out.println("greeting : "+greeting);
		}
		
	}
	
	public Application() {
		System.out.println("inside application");
	}
	
	public static void main(String[] args) {
		System.out.println("starting application");
		Application application = new Application();
		application.greet();
	}
	
}
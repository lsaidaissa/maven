package com.lyas.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words) {
		return (words == null || words.isEmpty()) ? 0 : StringUtils.split(words, " ").length;
	}
	
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
		int count = application.countWords("I have four words");
		System.out.println("count : "+count);
	}
	
}
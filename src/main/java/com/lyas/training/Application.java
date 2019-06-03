package com.lyas.training;

public class Application {
	
	public Application() {
		System.out.println("inside application");
	}
	
	public static void main(String[] args) {
		System.out.println("starting application");
		Application application = new Application();
	}
	
}
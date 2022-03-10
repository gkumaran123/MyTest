package com.pack.threading;

public class Main {
public static void main(String[] args) {
	ThreadExample thread1 = new ThreadExample();
	thread1.setName("My Thread1");
	thread1.start();
	
	ThreadExample thread2 = new ThreadExample();
	thread2.setName("My Thread2");
	thread2.start();
	
	
	
}
}

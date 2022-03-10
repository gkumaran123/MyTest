package com.pack.threading;

import java.util.HashMap;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hi I am Implements Runnable thread");
		
	}

	public static void main(String[] args) {
		RunnableThread runnable = new RunnableThread();
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		Thread thread4 = new Thread(runnable);
		thread4.start();
	}
	
	HashMap<Integer, String> empoyee = new HashMap<>();
	
}

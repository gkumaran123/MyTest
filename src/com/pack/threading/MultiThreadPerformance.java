package com.pack.threading;

public class MultiThreadPerformance {
	public static void main(String[] args) {
		FirstThread thread1 = new FirstThread(1);
		FirstThread thread2 = new FirstThread(2);
		thread1.start();
		thread2.start();
	}

}


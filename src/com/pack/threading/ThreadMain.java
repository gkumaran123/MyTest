package com.pack.threading;

public class ThreadMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<=10000;i++) {
			System.out.println("I am main Thread "+ i + Thread.currentThread().getName());
			//Thread.sleep(1000);
			
		}
		
		ThreadPools runnable = new ThreadPools();
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
	}

}



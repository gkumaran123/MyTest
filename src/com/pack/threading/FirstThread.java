package com.pack.threading;

public class FirstThread extends Thread{
	
	int threadNumber;
	public FirstThread(int i) {
		this.threadNumber = i ;
	}

	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println(i +" Printing from thread"+threadNumber);
			try {
				sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}
}

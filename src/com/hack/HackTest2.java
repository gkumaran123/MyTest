package com.hack;


abstract class Teacher{
	private void show() {
		System.out.println("Teacher");
	}
}
public class HackTest2  extends Teacher{
	protected void show() {
		System.out.println("student");
	}
	
	public static void main(String[] args) {
		Teacher teacher = new HackTest2();
		//teacher.show();
	}

}

package com.pack.Java8;


interface Lambda{
	 void calculate();
	 //void find();
}
public class LambdaTest {
	public static void main(String[] args) {
		
		Lambda lambda = () -> System.out.println("inside calculate");
		lambda.calculate();
	}
}

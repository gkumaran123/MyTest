package com.codility;
import java.util.*;
import java.util.stream.*;
public class EvenNumbers
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please Enter the Starting Range");
	int start = sc.nextInt();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Please Enter the Ending Range");
	int end = sc2.nextInt();
	
	List<Integer> numberList = new ArrayList<>();
	for(int i= start;i<=end;i++){
	    numberList.add(i);
	}
	
	List<Integer> evenNumbers =numberList.stream().filter(number -> (number%2==0)).collect(Collectors.toList());
	evenNumbers.forEach(even->System.out.println(","+even));
	}
	
}

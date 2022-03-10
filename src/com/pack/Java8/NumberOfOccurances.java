package com.pack.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfOccurances {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int x=0;
		Double sum = list.stream()
				  .collect(Collectors.averagingInt(Integer::intValue));
		
		System.out.println(sum);
		
	}

}

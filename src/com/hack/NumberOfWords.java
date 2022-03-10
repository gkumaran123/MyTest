package com.hack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfWords {
	
	public static void main(String[] args) {
		String word = " India is the better country";
		Map<String, Integer> StringMap = new HashMap<>();
		List<String> listOfWords = Arrays.asList(word.split(" "));
		for(String s :listOfWords) {
			for(String s1 :listOfWords) {
				if(s.equalsIgnoreCase(s1)) {
					StringMap.put(s, count++)
				}
			}
		}
	}

}

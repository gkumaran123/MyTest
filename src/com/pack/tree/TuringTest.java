package com.pack.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class TuringTest {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();
		collection.add("a");
		collection.add("b");
		collection.forEach(System.out::println);
	}

}

package com.hack;

import java.util.ArrayList;

public class Hacktest1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Alice");
		list.add(Boolean.TRUE);
		list.add(1,"Bob");
		list.remove("true");
		list.add(1,"Mike");
		list.add(4,"Tara");
		System.out.println(list);
	}

}

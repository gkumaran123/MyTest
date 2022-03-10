package com.pack;

public class Main {
public static void main(String[] args) {
	Triangle triangleA = new Triangle(5, 10, 3, 5, 9);
	Triangle triangleB = new Triangle(10, 20, 3, 5, 9);
	double areaOfTrianlgeA = triangleA.findArea();
	System.out.println(areaOfTrianlgeA);
	double areaOfTrianlgeB = triangleB.findArea();
	System.out.println(areaOfTrianlgeB);
	
	Square s = new Square(4);
	Shapes shapes = Square::getArea;
	System.out.println(shapes.getArea(s));
}
}

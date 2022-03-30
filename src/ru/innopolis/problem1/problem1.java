// your solution here
//fix all the errors including package errors
package com.company;

import java.util.*;

public interface Shape {
   float perimeter(){}
}

public class Rectangle implements Shape {
	private int height;
	private int width;
@Override
 public float perimeter() {
	 return 2 * (height + width);
 }
}

public class Sqaure implements Shape {
	private int side;
 @Override
 public float perimeter() {
 	return 4 * side;
 }
}

public class Circle implements Shape {
	private int radius;
 @Override
 public float perimeter() {
	 return 2 * 3.14 * radius;
 }
}

public class ShapeFactory {
 //use getShape method to get object of type shape
	public Shape getShape(String shapeType){
 		if(shapeType == null){
 			return null;
 		} else if (shapeType == "Circle") {
			return Circle();
		} else if (shapeType == "Square") {
			return Square();
		} else if (shapeType == "Rectangle") {
			return Rectangle();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		
	}
}

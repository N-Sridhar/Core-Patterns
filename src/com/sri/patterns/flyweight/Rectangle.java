package com.sri.patterns.flyweight;

public class Rectangle extends Shape {

	private String label;

	public Rectangle() {
		label = "Rectangle";
	}

	@Override
	public void draw(int length, int breath, String fillStyle) {
		System.out.println("Drawing a " + label + " with length " + length + " and breath " + breath
				+ " with fillStyle " + fillStyle);
	}

}

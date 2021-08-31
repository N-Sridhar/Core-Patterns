package com.sri.patterns.flyweight;

public class PaintApp {
	public void render(int numOfShapes) {
		Shape shape = null;

		for (int i = 1; i <= numOfShapes; i++) {
			if (i % 2 == 0) {
				shape = ShapeFactory.getShape("circle");
				shape.draw(i, "Red", "White");
			} else {
				shape = ShapeFactory.getShape("rectangle");
				shape.draw(i, i + i, "Dotted");
			}
		}
	}
}

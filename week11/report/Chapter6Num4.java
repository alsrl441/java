// ========================= base 패키지 =========================

package base;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

// ========================= derived 패키지 =========================

package derived;

import base.Shape;

class Circle {
	public void draw() {
		System.out.println("Circle");
	}
}

// ========================= app 패키지 =========================

package app;

import base.Shape;
import derived.Circle;

public class GraphicEditer {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}
}

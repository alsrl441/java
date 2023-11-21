// ========================= etc 패키지 =========================

package etc;

class Calc{
	private int x, y;

	public Calc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int sum() {
		return x + y;
	}
}

// ========================= main 패키지 =========================

package main;

import etc.Calc;

public class MainApp {
	public static void main(String[] args) {
		Calc c = new Calc(10, 20);
		System.out.println(c.sum());
	}
}

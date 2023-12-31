// ================== (1) ===================
package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter12Num05 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Chapter12Num05() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private int gridWidth = this.getWidth() / 10;
		private int gridHeight = this.getHeight() / 10;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 1; i < 10; i++) {
				g.drawLine(0, (this.getHeight() / 10) * i, this.getWidth(), (this.getHeight() / 10) * i);
				g.drawLine((this.getWidth() / 10) * i, 0, (this.getWidth() / 10) * i, this.getHeight());
			}
		}
	}

	public static void main(String[] args) {
		new Chapter12Num05();
	}

}


// ==================== (2) ===================
package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter12Num05 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Chapter12Num05() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w = this.getWidth();
			int h = this.getHeight();
			int[] x = { w / 2, 0, w / 2, w }; // 위 왼쪽 아래 오른쪽
			int[] y = { 0, h / 2, h, h / 2 };
			int xSpace = (int) this.getWidth() / 30;
			int ySpace = (int) this.getHeight() / 30;
			g.drawPolygon(x, y, 4);
			for (int i = 1; i < 10; i++) {
				y[0] += ySpace;
				x[1] += xSpace;
				y[2] -= ySpace;
				x[3] -= xSpace;
				g.drawPolygon(x, y, 4);
			}
		}
	}

	public static void main(String[] args) {
		new Chapter12Num05();
	}

}

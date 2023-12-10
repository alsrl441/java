package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter12Num05 extends JFrame {
	private MyPanel panel = new MyPanel();
	private ImageIcon icon = new ImageIcon("images/apple.jpg");
	private Image image = icon.getImage();
	private int width = image.getWidth(this);
	private int height = image.getHeight(this);

	public Chapter12Num05() {
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public MyPanel() {
			setFocusable(true);
			requestFocus();

			addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char key = e.getKeyChar();
					if (key == '+') {
						width = (int) (width * 1.1);
						height = (int) (height * 1.1);
					} else if (key == '-') {
						width = (int) (width * 0.9);
						height = (int) (height * 0.9);
					}
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 10, 10, width, height, this);
		}
	}

	public static void main(String[] args) {
		new Chapter12Num05();
	}

}

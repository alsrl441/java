package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter10Num02 extends JFrame {
	public Chapter10Num02() {
		setTitle("드래깅 동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		Container c = getContentPane();
		c.setBackground(Color.green);
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.yellow);
			}
		});
		c.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.green);
			}
		});
	}
	public static void main(String[] args) {
		new Chapter10Num02();
	}
}

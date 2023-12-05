package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter10Num04 extends JFrame {
	public Chapter10Num04() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		JLabel la = new JLabel("Love Java");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		la.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel label = (JLabel)e.getSource();
					StringBuffer text = new StringBuffer(label.getText());
					text = text.append(text.substring(0, 1));
					label.setText(text.deleteCharAt(0).toString());
				}
//				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//					JLabel label = (JLabel)e.getSource();
//					StringBuffer text = new StringBuffer(label.getText());
//					text = text.append(text.substring(0, 8));
//					label.setText(text.delete(0, 8).toString());
//				}
			}
		});
		la.setFocusable(true);
		la.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new Chapter10Num04();
	}
}

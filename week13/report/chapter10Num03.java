package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter10Num03 extends JFrame {
	public Chapter10Num03() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		JLabel la = new JLabel("Love Java");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		la.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT){
					JLabel label = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(label.getText());
					label.setText(text.reverse().toString());
				}
			}
		});
		la.setFocusable(true);
		la.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new Chapter10Num03();
	}
}

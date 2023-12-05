package practice;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Chapter09Num02 extends JFrame {
	Chapter09Num02() {
		setTitle("BorderLayout Practice");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout(5,7));
		
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Chapter09Num02();
	}
}

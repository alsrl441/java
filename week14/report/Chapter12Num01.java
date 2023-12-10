// ======================== (1) =======================
package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter12Num01 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Chapter12Num01() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private JButton btn = new JButton("Hide/Show");
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image image = icon.getImage();
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(btn);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new Chapter12Num01();
	}

}

// ======================== (2) =======================

package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise extends JFrame {
	private MyPanel panel = new MyPanel();

	public Exercise() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private JButton btn = new JButton("Hide/Show");
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image image = icon.getImage();

		public MyPanel() {
			setLayout(new FlowLayout());
			add(btn);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (image == null)
						image = icon.getImage();
					else
						image = null;
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new Exercise();
	}

}

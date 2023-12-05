package practice;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Chapter09Num08 extends JFrame implements ActionListener{
	String[] str = {"CE", "계산", "+", "-", "x", "%"};
	JTextField tf1, tf2;
	String numStr="";

	public Chapter09Num08() {
		setTitle("계산기프레임");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		JPanel pn = new JPanel();
		JPanel ps = new JPanel();
		JPanel pc = new JPanel();

		pn.setBackground(Color.LIGHT_GRAY);
		ps.setBackground(Color.LIGHT_GRAY);
		pc.setLayout(new GridLayout(4, 4, 5, 5));

		JLabel label1 = new JLabel("수식입력");
		tf1 = new JTextField(10);
		pn.add(label1);
		pn.add(tf1);

		JLabel label2 = new JLabel("계산결과");
		tf2 = new JTextField(10);
		ps.add(label2);
		ps.add(tf2);

		for (int i = 0; i < 16; i++) {
			JButton b = new JButton();
			if (i < 10) {
				b.setText(i + ""); // 문자열. Integer.toString(i);
				b.setBackground(Color.WHITE); // 0~10까지
			} else {
				b.setText(str[i - 10]); // ce, 계산
				b.setBackground(Color.WHITE);
			}
			if (i > 11)
				b.setBackground(Color.WHITE); // 연산기호
			pc.add(b);
			b.addActionListener(this);
		}
		c.add(pc);
		c.add(pn, BorderLayout.NORTH);
		c.add(ps, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Chapter09Num08();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		
		if(str.equals("CE")) {
			numStr="";
			tf1.setText(numStr);
			tf2.setText("");
		}else if(str.equals("계산")) {
			StringTokenizer st=new StringTokenizer(numStr, "+-x%", true);
			int num1=Integer.parseInt(st.nextToken());
			String op=st.nextToken();
			int num2=Integer.parseInt(st.nextToken());
			switch(op) {
			case "+" : tf2.setText(num1+num2+""); break;
			case "-" : tf2.setText(num1-num2+""); break;
			case "x" : tf2.setText(num1*num2+""); break;
			case "%" : tf2.setText(num1/num2+""); break;
				default: tf2.setText("오류"); break;
			}
			numStr="";
			tf1.setText(numStr);
		}else {
			numStr+=str;
			tf1.setText(numStr);
					}
		}
}

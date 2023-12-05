package practice;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

class Chapter10Num06 extends JFrame{
    Chapter10Num06(){
        setTitle("클릭 연습용 프로그램");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("c");
        label.setSize(10, 10);
        label.setLocation(100, 100);
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int x = (int)(Math.random() * 400);
                int y = (int)(Math.random() * 500);
                label.setLocation(x, y);
            }
        });
        c.add(label);
        setSize(500, 600);
        setVisible(true);
    }
    public static void main(String args[]){
        new Chapter10Num06();
    }
}

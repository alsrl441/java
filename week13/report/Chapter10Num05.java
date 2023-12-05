package practice;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

class Chapter10Num05 extends JFrame{
    int size = 10;
    Chapter10Num05(){
        setTitle("+,-로 폰트 크기 조절");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, size));
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ADD || e.getKeyCode()==KeyEvent.VK_EQUALS){
                    size += 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                }
                else if(e.getKeyCode()==KeyEvent.VK_MINUS) {
                    size -= 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                }
            }
        });
        c.add(label);
        c.setFocusable(true);
        c.requestFocus();
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String args[]){
        new Chapter10Num05();
    }
}

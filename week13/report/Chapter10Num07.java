package practice;

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.*;

class Chapter10Num07. extends JFrame{
    int size = 10;
    Chapter10Num07.(){
        setTitle("마우스 휠을 굴려 폰트 크기 조절");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, size));
        label.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                int n = e.getWheelRotation();
                if(n < 0){
                    if(size - 5 > 0){
                        size -= 5;
                        label.setFont(new Font("Arial", Font.PLAIN, size ));
                    }
                }
                else{
                    size += 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size + 5));
                }
            }
        });
        c.add(label);
        setSize(500, 600);
        setVisible(true);
    }
    public static void main(String args[]){
        new Chapter10Num07.();
    }
}

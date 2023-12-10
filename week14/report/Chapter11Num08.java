package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chapter11Num08 extends JFrame {
    JRadioButton radioButtons[] = new JRadioButton[2];
    ImageIcon imageIcons[] = {new ImageIcon("images/Facebook.png"), new ImageIcon("images/google.png"), new ImageIcon("images/naver.png")};
    JLabel imageLabel = new JLabel(imageIcons[0]);
    int selectIndex = 0;
    Chapter11Num08(){

        setTitle("Image Gallary Practice Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());

        radioButtons[0] = new JRadioButton("left");
        radioButtons[0].setSelected(true);
        radioButtons[1] = new JRadioButton("Right");

        top.add(radioButtons[0]);
        top.add(radioButtons[1]);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButtons[0]);
        group.add(radioButtons[1]);

        c.add(top, BorderLayout.NORTH);
        c.add(imageLabel, BorderLayout.CENTER);

        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(radioButtons[0].isSelected()){
                    selectIndex++;
                    if(selectIndex > 2){
                        selectIndex = 0;
                    }
                }
                else{
                    selectIndex--;
                    if(selectIndex < 0){
                        selectIndex = imageIcons.length - 1;
                    }
                }
                imageLabel.setIcon(imageIcons[selectIndex]);

            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[]){
        new Chapter11Num08();
    }
}

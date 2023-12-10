package practice;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter11Num05 extends JFrame {
    Chapter11Num05(){
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JSlider slider = new JSlider(100, 200, 120); // min. max. init value
        JLabel label = new JLabel("120");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider temp = (JSlider) e.getSource();
                label.setText(Integer.toString(temp.getValue()));
            }
        });
        c.add(slider);
        c.add(label);

        setSize(300, 200);
        setVisible(true);
    }


    public static void main(String args[]){
        new Chapter11Num05();
    }
}

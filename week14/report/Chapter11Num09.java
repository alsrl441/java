package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chapter11Num09 extends JFrame {
    JButton btn[] = new JButton[3];
    ImageIcon imageIcons[] = {new ImageIcon("images/scissor.png"), new ImageIcon("images/rock.png"), new ImageIcon("images/paper.png")};
    JLabel userLabel = new JLabel("me");
    JLabel computerLabel = new JLabel("com");
    int user, computer;
    JLabel result = new JLabel();
    Chapter11Num09(){

        setTitle("가위 바위 보 게임");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());

        for(int i = 0; i < 3; i++){
            btn[i] = new JButton(imageIcons[i]);
            btn[i].addActionListener(new game(i));
            top.add(btn[i]);
        }
        top.setBackground(Color.gray);
        c.add(top, BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        center.add(userLabel);
        center.add(computerLabel);
        result.setForeground(Color.RED);
        center.add(result);
        center.setBackground(Color.YELLOW);
        c.add(center, BorderLayout.CENTER);

        setSize(1000,800);
        setVisible(true);
    }

    class game implements ActionListener{
        int index;
        game(int i){
            index = i;
        }
        public void actionPerformed(ActionEvent e){
            user = index;
            computer = (int)(Math.random()*3);
            userLabel.setIcon(imageIcons[user]);
            computerLabel.setIcon(imageIcons[computer]);

            if(user == computer){
                result.setText("SAME!!");
            }
            else if(user - computer == -2 || user - computer == 1){
                result.setText("ME !!");
            }else{
                result.setText("COM !!");
            }
        }
    }

    public static void main(String args[]){
        new Chapter11Num09();
    }
}

package chattingapplication;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    Server(){
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setSize(450,60);
        p1.setLayout(null);
        add(p1);
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("dada.jpg"));
        Image I2=I1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel back=new JLabel(I3);
        back.setBounds(5,20,25,25);
        p1.add(back);


        
        setSize(450, 700);
        setLocation(200,50);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Server();
    }
}

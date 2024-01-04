import javax.swing.*;
//import java.awt.event.*;

public class Swing extends JFrame {

    Swing() {
        setLayout(null);
        setTitle("Student Details");

        JLabel j1 = new JLabel("Roll No.");
        setBounds(30, 0, 400, 30);
        add(j1);

        JLabel j2 = new JLabel("Name");
        add(j2);

        JLabel j3 = new JLabel("Percentage");
        add(j3);

        JButton b1 = new JButton("Display");
        add(b1);

        JButton b2 = new JButton("Clear");
        add(b2);

        setVisible(true);
        setSize(500, 500);
        //setLocation(200, 200);
    }

    public static void main(String[] args) {
        new Swing();
    }
}
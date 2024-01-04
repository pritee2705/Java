import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class ExGridLayout {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("GridLayout Example");

        // Set the layout manager to GridLayout with 3 rows and 3 columns
        //ExGridLayout gridLayout = new ExGridLayout(3, 3);
        frame.setLayout(new GridLayout(3,3));

        // Create and add buttons to the frame
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            frame.add(button);
        }

        // Set the default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

import javax.swing.*;

public class ComboBoxExample {
    JFrame f;

    ComboBoxExample() {
        f = new JFrame("Select The Subject");
        String country[] = { "Select Subject", "OS", "CN-II", "WT", "DS", "JAVA", "TCS",
                "Python", "Blockchain Tecnology" };
        JComboBox cb = new JComboBox(country);
        cb.setBounds(150, 150, 400, 30);
        f.add(cb);
        f.setLayout(null);
        f.setSize(800, 800);
        f.setLocation(250, 20);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
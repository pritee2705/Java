import javax.swing.*;
public class menu extends JFrame{
    menu(){
       setLayout(null);
        setTitle("Java AWT Example");
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 400, 30);
        add(mb);
        JMenu menu = new JMenu("File");
        menu.setBounds(0, 0, 400, 30);
        JMenuItem m1 = new JMenuItem("New");
        JMenuItem m2 = new JMenuItem("Open");
        JMenuItem m3 = new JMenuItem("Save");
        JMenu m4 = new JMenu("Show About");
        JMenuItem m5 = new JMenuItem("Exit");
        JMenu menu1 = new JMenu("Edit");
        JMenu menu2 = new JMenu("About");
        mb.add(menu);
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);
        m4.add(m5);
        mb.add(menu1);
        mb.add(menu2);
        setSize(400, 400);
        setLocation(200, 200);
        setVisible(true);
    }
    public static void main(String args[]){
        new menu();
    }
}
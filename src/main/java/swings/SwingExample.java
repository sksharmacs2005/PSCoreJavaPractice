package swings;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {

        JFrame frame=new JFrame("This is the JFrame");

        JButton button=new JButton("Add");
        button.setBounds(150,200,200,50);
        frame.add(button);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

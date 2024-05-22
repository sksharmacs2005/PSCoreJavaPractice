package swings;

import javax.swing.*;

public class MyJFrame extends JFrame {
    public MyJFrame() {
        setTitle("Swing JFrame Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}

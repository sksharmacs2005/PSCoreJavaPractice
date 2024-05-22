package swings;

import javax.swing.*;
import java.awt.*;

public class Buutons {
    public static void main(String[] args) {

        Frame frame=new Frame("Add three buttons");

        Button b1=new Button("OK");
        b1.setBounds(100, 50, 50, 50);
        frame.add(b1);

        Button b2=new Button("SUBMIT");
        b2.setBounds(100, 101, 50, 50);
        frame.add(b2);


        Button b3=new Button("CANCEL");
        b3.setBounds(100, 150, 50, 50);
        frame.add(b3);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}

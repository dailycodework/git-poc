package com.pvd.domain;

import javax.swing.*;
import java.awt.*;

public class TextAreaTest extends JFrame {

    public TextAreaTest(){
        this. setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());



        JTextArea textArea = new JTextArea(20, 50);
        JTextField textField = new JTextField("This is the text for testing", 40);
        JTextField newTextFied = new JTextField("Another Field");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(textArea);
        panel.add(textField);



        this.add(panel);
        this.add(panel);
        this.setVisible(true);

    }


}

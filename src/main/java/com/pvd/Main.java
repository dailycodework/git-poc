package com.pvd;

import com.pvd.domain.TextAreaTest;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextAreaTest :: new);
    }
}

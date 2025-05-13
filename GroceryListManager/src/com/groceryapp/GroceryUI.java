
package com.groceryapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GroceryUI extends JFrame {
    public GroceryUI() {
        setTitle("Grocery List Manager");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel label = new JLabel("Grocery List Manager", JLabel.CENTER);
        add(label);
        setVisible(true);
    }
}

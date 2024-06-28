//an application that uses five radio buttons to let you choose which kind of pet is displayed
package com.mycompany.assign2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class Assign2 extends JFrame {
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private ButtonGroup buttonGroup;
    private JLabel imageLabel;
    private JLabel selectionLabel;

    public Assign2() {
        setTitle("Radio button demo"); // Set the title
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        radioButton1 = new JRadioButton("bird");
        radioButton2 = new JRadioButton("pig");
        radioButton3 = new JRadioButton("cat");
        radioButton4 = new JRadioButton("dog");
        radioButton5 = new JRadioButton("monkey");

        // Group the radio buttons
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        buttonGroup.add(radioButton5);

        // Create a panel and set its layout to BoxLayout for vertical alignment
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(radioButton4);
        panel.add(radioButton5);

        // Create a label for displaying images
        imageLabel = new JLabel();
        panel.add(imageLabel);

        // Create a label for displaying the selected image name
        selectionLabel = new JLabel("You have selected a ");
        panel.add(selectionLabel);

        // Add panel to the frame
        add(panel);

        // Add action listeners to radio buttons
        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\denis\\Downloads\\bird.jpg"));
                selectionLabel.setText("you have selected a bird");
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\denis\\Downloads\\pig.jpg"));
                selectionLabel.setText("you have selected a pig");
            }
        });
        radioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\denis\\Downloads\\cat.jpg"));
                selectionLabel.setText("you have selected a cat");
            }
        });
        radioButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\denis\\Downloads\\dog.jpg"));
                selectionLabel.setText("you have selected a dog");
            }
        });
        radioButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(new ImageIcon("C:\\Users\\denis\\Downloads\\monkey.jpg"));
                selectionLabel.setText("you have selected a monkey");
            }
        });

        // Set font and color for selectionLabel
        selectionLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Example font size and style
        selectionLabel.setForeground(Color.RED);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of Assign2 (which is a JFrame with radio buttons)
        new Assign2();
    }
}

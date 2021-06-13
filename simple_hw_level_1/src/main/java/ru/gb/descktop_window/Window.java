package ru.gb.descktop_window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{

    public Window(){

        super.setVisible(true);

        setTitle("Test Window");
        setLocation(650, 250);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton btn1 = new JButton("EXIT");
        add(btn1, BorderLayout.SOUTH);
        btn1.setBackground(Color.blue);
        btn1.setForeground(Color.WHITE);

        Exit exit = new Exit();
        btn1.addActionListener(exit);

        JButton btn3 = new JButton("NULL");
        panel.add(btn3);
        add(panel, BorderLayout.NORTH);

        JTextField field = new JTextField();
        Font font = new Font("TimesRoman", Font.BOLD, 35);
        field.setBackground(Color.lightGray);
        add(field, BorderLayout.CENTER);
        field.setForeground(Color.WHITE);
        field.setFont(font);
        field.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Введенный текст: " + field.getText());
            }
        });
        setVisible(true);
    }

}

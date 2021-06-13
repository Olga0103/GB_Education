package ru.gb.descktop_window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exit implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e)    {
        System.exit(0);
    }

}
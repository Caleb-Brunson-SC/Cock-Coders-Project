package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import backEnd.*;

public class ViewQuestion implements ActionListener {
    private final LMSFacade facade;
    JFrame frame1;
    JLabel l1;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;


    ViewQuestion(LMSFacade facade) {
        this.facade = facade;
        frame1 = new JFrame();
        l1 = new JLabel();
        l1.setText("Question: ");
        l1.setBounds(100,50,300,30);

        r1 = new JRadioButton("A) ");
        r2 = new JRadioButton("B) ");
        r3 = new JRadioButton("C) ");
        r4 = new JRadioButton("D) ");
        r1.setBounds(100,100,100,30);    
        r2.setBounds(100,130,100,30);
        r3.setBounds(100,160,100,30);
        r4.setBounds(100,190,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        frame1.add(l1);
        frame1.add(r1);
        frame1.add(r2);
        frame1.add(r3);
        frame1.add(r4);

        frame1.setSize(500,500);
        frame1.setLayout(null);    
        frame1.setVisible(true);  
    } 

    public void actionPerformed(ActionEvent e) {
        
    }
}
    

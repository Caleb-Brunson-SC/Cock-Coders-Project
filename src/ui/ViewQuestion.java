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

    ViewQuestion(LMSFacade facade) {
        this.facade = facade;
        frame1 = new JFrame();
        JRadioButton r1 = new JRadioButton("A) ");
        JRadioButton r2 = new JRadioButton("B) ");
        JRadioButton r3 = new JRadioButton("C) ");
        JRadioButton r4 = new JRadioButton("D) ");
        r1.setBounds(75,100,100,30);    
        r2.setBounds(75,100,100,30);
        r3.setBounds(75,100,100,30);
        r4.setBounds(75,100,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        frame1.add(r1);
        frame1.add(r2);
        frame1.add(r3);
        frame1.add(r4);

        frame1.setSize(300,300);
        frame1.setLayout(null);    
        frame1.setVisible(true);  
    } 

    public void actionPerformed(ActionEvent e) {
        
    }
}
    

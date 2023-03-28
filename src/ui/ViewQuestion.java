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
    ArrayList<JPanel> pages;
    JTabbedPane tabbedPane;

    ViewQuestion(LMSFacade facade) {
        this.facade = facade;
        frame1 = new JFrame();
        l1 = new JLabel();
        pages = new ArrayList<JPanel>();
        tabbedPane = new JTabbedPane();

        for (int i = 1; i <= 5; i++) { // 5 for now
            JPanel page = new JPanel();
            JLabel question = new JLabel();
            JRadioButton a1 = new JRadioButton();
            JRadioButton a2 = new JRadioButton();
            JRadioButton a3 = new JRadioButton();
            JRadioButton a4 = new JRadioButton();
            question.setText("Question " + i + ": ");
            a1.setText("A) ");
            a2.setText("B) ");
            a3.setText("C) ");
            a4.setText("D) ");
            ButtonGroup bg = new ButtonGroup();
            bg.add(a1);
            bg.add(a2);
            bg.add(a3);
            bg.add(a4);
            page.setLayout(null);
            question.setBounds(100, 50, 300, 30);
            a1.setBounds(100, 100, 300, 30);
            a2.setBounds(100, 130, 300, 30);
            a3.setBounds(100, 160, 300, 30);
            a4.setBounds(100, 190, 300, 30);
            page.add(question);
            page.add(a1);
            page.add(a2);
            page.add(a3);
            page.add(a4);
            pages.add(page);
            tabbedPane.add("Question " + i, page);
        }
        tabbedPane.setBounds(0, 0, 500, 500);
        frame1.add(tabbedPane);

        frame1.setSize(500, 500);
        frame1.setLayout(null);
        frame1.setVisible(true); 
    } 

    public void actionPerformed(ActionEvent e) {
        
    }
}
    

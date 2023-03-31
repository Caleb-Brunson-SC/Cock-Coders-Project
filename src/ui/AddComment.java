package ui;
import java.util.ArrayList;
import backEnd.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AddComment implements ActionListener{
  private final LMSFacade facade;
  JFrame frame1;
  JButton submitButton;
  JTextArea commentField;

  AddComment(LMSFacade facade){
    this.facade = facade;    
    frame1 = new JFrame();
    submitButton = new JButton();
    commentField = new JTextArea();
    frame1.setLayout(null);
    commentField.setLineWrap(true);
    

    submitButton.setText("Submit");

    submitButton.setBounds(350, 200, 100, 30);
    commentField.setBounds(50, 50, 400, 150);

    frame1.add(submitButton);
    frame1.add(commentField);
    
    frame1.setVisible(true);
    frame1.setSize(500, 300);
    frame1.setLayout(null);
  }
  public void actionPerformed(ActionEvent e) {

  }
}
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
  JButton viewTopic;
  ArrayList<Comment> comments;
  int commentIndex = 0;

  AddComment(LMSFacade facade){
    this.facade = facade;    
    frame1 = new JFrame();
    frame1.setLayout(null);

    for (int i = 0; i < comments.size(); i++) {
      JLabel authorLabel = new JLabel();
      JLabel contentLabel = new JLabel();
      JLabel dateLabel = new JLabel();
      JButton viewReplies = new JButton();
      JSeparator separator = new JSeparator();
      // JLabel 


      authorLabel.setText("UserName"); // Course name
      dateLabel.setText("Date"); // Teacher name
      contentLabel.setText("Comment content"); // Course description
      viewReplies.setText("Topics: ");

      authorLabel.setFont(new Font(authorLabel.getFont().getName(), Font.BOLD, authorLabel.getFont().getSize()));

      authorLabel.setBounds(50, 50, 100, 20);
      dateLabel.setBounds(150, 50, 100, 20);
      contentLabel.setBounds(50, 70, 300, 100);
      viewReplies.setBounds(50, 70, 100, 30);
      separator.setBounds(50,200, 400, 1);

      frame1.add(authorLabel);
      frame1.add(dateLabel);
      frame1.add(contentLabel);
      frame1.add(viewReplies);
      frame1.add(separator);
      // should parse through all topics in course
      
    }
    
    frame1.setVisible(true);
    frame1.setSize(500, 600);
    frame1.setLayout(null);
  }
  public void actionPerformed(ActionEvent e) {

  }
}
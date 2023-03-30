package ui;
import java.util.ArrayList;
import backEnd.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ViewLesson implements ActionListener{
  private final LMSFacade facade;
  JFrame frame1;
  ArrayList<Topic> topics;
  JTabbedPane tabbedPane;
  JScrollPane scroll;

  ViewLesson(LMSFacade facade){
    this.facade = facade;
    
    frame1 = new JFrame();
    tabbedPane = new JTabbedPane();

    frame1.setLayout(null);
    // for statement should populate string J with the title of the Lesson for
    // each Lesson in the topi. Should iterate once for each lesson in lessons
    // array. 
    for (int i = 0; i < 7; i++) {
      JPanel p1 = new JPanel();
      p1.setLayout(null);
      String j = i + " ";
      tabbedPane.add(j, p1);
      JLabel lessonName = new JLabel();
      JTextArea lessonContent = new JTextArea();
      lessonContent.setLineWrap(true);
      scroll = new JScrollPane(lessonContent);
      lessonName.setText("Lesson Name");

      lessonContent.setEditable(false);
      lessonContent.setText("Lesson Content");

      lessonName.setFont(new Font(lessonName.getFont().getName(), Font.BOLD, lessonName.getFont().getSize()));
  
      lessonName.setBounds(50, 50, 400, 20);
      scroll.setBounds(50, 80, 375, 300);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

      p1.add(lessonName);
      p1.add(scroll);
      

      tabbedPane.setBounds(0,0,500,500);
    
      frame1.setVisible(true);
      frame1.setSize(500, 500);
  
      frame1.add(tabbedPane);
    }
  }
  public void actionPerformed(ActionEvent e) {
    
  }
}

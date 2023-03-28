package ui;
import java.util.ArrayList;
import backEnd.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ViewCourses implements ActionListener{
  private final LMSFacade facade;
  JFrame frame1;
  ArrayList<Course> courses;
  JTabbedPane tabbedPane;

  ViewCourses(LMSFacade facade){
    this.facade = facade;
    
    frame1 = new JFrame();
    tabbedPane = new JTabbedPane();

    frame1.setLayout(null);
    // for statement should populate string J with the title of the course for
    // each course the student is enrolled in. Should iterate once for each 
    // course in courses array. 
    for (int i = 0; i < 7; i++) {
    // for (int i = 0; i < courses.size(); i++) {
      // Course workingCourse = courses.get(i);
      JPanel p1 = new JPanel();
      p1.setLayout(null);
      String j = i + " ";
      tabbedPane.add(j, p1);
      JLabel courseName = new JLabel();
      JLabel authorName = new JLabel();
      JLabel courseDescription = new JLabel();
      JLabel topicLabel = new JLabel();

      courseName.setText("Course Name");
      authorName.setText("Author Name");
      courseDescription.setText("Course Description");
      topicLabel.setText("Topics: ");

      courseName.setFont(new Font(courseName.getFont().getName(), Font.BOLD, courseName.getFont().getSize()));
      topicLabel.setFont(new Font(courseName.getFont().getName(), Font.BOLD, courseName.getFont().getSize()));

      courseName.setBounds(50, 50, 300, 20);
      authorName.setBounds(50, 70, 300, 20);
      courseDescription.setBounds(50, 100, 300, 20);
      topicLabel.setBounds(50, 130, 300, 20);

      p1.add(courseName);
      p1.add(authorName);
      p1.add(courseDescription);
      p1.add(topicLabel);
      // tabbedPane.add(workingCourse.getTitle() , p1);
      // should parse through all topics in course
      for (int k = 0; k < 5; k++) {
        JLabel topicName = new JLabel();
        JButton viewTopic = new JButton();
        topicName.setText("topicName");
        viewTopic.setText("viewTopic");
        topicName.setBounds(150, 160 + (k * 30), 100, 20);
        viewTopic.setBounds(250, 160 + (k * 30), 100, 20);
        p1.add(topicName);
        p1.add(viewTopic);
      }
    }
    tabbedPane.setBounds(0,0,500,500);
    
    frame1.setVisible(true);
    frame1.setSize(500, 500);

    frame1.add(tabbedPane);
  }
  public void actionPerformed(ActionEvent e) {
    
  }
}

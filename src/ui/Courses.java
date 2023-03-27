package ui;
import java.util.ArrayList;
import backEnd.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Courses implements ActionListener{
  JFrame frame1;
  ArrayList<Course> courses;
  JTabbedPane tabbedPane;

  Courses(){
    frame1 = new JFrame();
    tabbedPane = new JTabbedPane();

    // for statement should populate string J with the title of the course for
    // each course the student is enrolled in. Should iterate once for each 
    // course in courses array. 
    for (int i = 0; i < 7; i++) {
    // for (int i = 0; i < courses.size(); i++) {
      // Course workingCourse = courses.get(i);
      JPanel p1 = new JPanel();
      String j = i + " ";
      tabbedPane.add(j, p1);
      JLabel courseName = new JLabel();
      JLabel authorName = new JLabel();
      JLabel courseDescription = new JLabel();
      JLabel lessonLabel = new JLabel();
      JLabel quizLabel = new JLabel();

      courseName.setText("Course Name");
      authorName.setText("Author Name");
      courseDescription.setText("Course Description");
      lessonLabel.setText("Lessons: ");
      quizLabel.setText("Quiz: ");

      courseName.setFont(new Font(courseName.getFont().getName(), Font.BOLD, courseName.getFont().getSize()));

      courseName.setBounds(100, 100, 300, 20);
      authorName.setBounds(100, 140, 300, 20);
      courseDescription.setBounds(100, 180, 300, 20);
      lessonLabel.setBounds(100, 220, 300, 20);
      quizLabel.setBounds(100, 260, 300, 20);

      p1.add(courseName);
      p1.add(authorName);
      p1.add(courseDescription);
      p1.add(lessonLabel);
      p1.add(quizLabel);
      // tabbedPane.add(workingCourse.getTitle() , p1);

    }
    tabbedPane.setBounds(0,0,500,500);
    
    frame1.setVisible(true);
    frame1.setSize(500, 500);
    frame1.setLayout(null);

    frame1.add(tabbedPane);

  }

  public void actionPerformed(ActionEvent e) {
  }
}

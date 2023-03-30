package ui;
import java.util.ArrayList;
import backEnd.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ViewTopic implements ActionListener{
  private final LMSFacade facade;
  JFrame frame1;
  JTabbedPane tabbedPane;

  ViewTopic(LMSFacade facade, Topic workingTopic){
    this.facade = facade;
    
    frame1 = new JFrame();
    tabbedPane = new JTabbedPane();

    frame1.setLayout(null);
    // for statement should populate string J with the title of the topic for
    // each topic in the course. Should iterate once for each 
    // topic in topics array. 
    int saveK = 0;
    int saveW = 0;
    for (int i = 0; i < 1; i++) {
      JPanel p1 = new JPanel();
      p1.setLayout(null);
      String j = i + " ";
      tabbedPane.add(j, p1);
      JLabel topicName = new JLabel();
      JLabel topicDescription = new JLabel();
      JLabel lessonLabel = new JLabel();
      JLabel quizLabel = new JLabel();

      topicName.setText("Title: " + workingTopic.getTitle());
      topicDescription.setText("Topic Description");
      lessonLabel.setText("Lessons: ");
      quizLabel.setText("Quiz:");

      topicName.setFont(new Font(topicName.getFont().getName(), Font.BOLD, topicName.getFont().getSize()));
      lessonLabel.setFont(new Font(topicName.getFont().getName(), Font.BOLD, topicName.getFont().getSize()));
      quizLabel.setFont(new Font(quizLabel.getFont().getName(), Font.BOLD, topicName.getFont().getSize()));

      topicName.setBounds(50, 50, 300, 20);
      topicDescription.setBounds(50, 80, 300, 20);
      lessonLabel.setBounds(50, 130, 300, 20);

      p1.add(topicName);
      p1.add(topicDescription);
      p1.add(lessonLabel);
      tabbedPane.add(workingTopic.getTitle() , p1);
      // should parse through all lessons in topic
      int k = 0;
      while (k < workingTopic.getLessons().size()) {
        JLabel lessonName = new JLabel();
        JButton viewLesson = new JButton();
        lessonName.setText("lessonName");
        viewLesson.setText("viewLesson");
        lessonName.setBounds(150, 160 + (k * 30), 100, 20);
        viewLesson.setBounds(250, 160 + (k * 30), 100, 20);
        p1.add(lessonName);
        p1.add(viewLesson);
        k++;
      }

      quizLabel.setBounds(50, 160 + (k * 30), 300, 20);
      p1.add(quizLabel);
      JLabel quizName = new JLabel();
      JButton viewQuiz = new JButton();
      quizName.setText("quizName");
      viewQuiz.setText("viewQuiz");
      quizName.setBounds(150, 190 + (k * 30) + (0 * 30), 100, 20);
      viewQuiz.setBounds(250, 190 + (k * 30) + (0 * 30), 100, 20);
      p1.add(quizName);
      p1.add(viewQuiz);

      
      
      tabbedPane.setBounds(0,0,500,500);
    
      frame1.setVisible(true);
  
      frame1.setSize(500, 450 + (k * 30));
  
      frame1.add(tabbedPane);
  }
  }
  public void actionPerformed(ActionEvent e) {

  }
}

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
  Course workingCourse;
  Topic workingTopic;
  ArrayList<Lesson> lessons;
  Quiz workingQuiz;
  int lessonIndex = 0;
  JFrame frame1;
  JTabbedPane tabbedPane;
  JButton viewLesson;
  JButton viewQuiz;

  ViewTopic(LMSFacade facade, Course workingCourse, Topic workingTopic){
    this.facade = facade;
    this.workingCourse = workingCourse;
    this.workingTopic = workingTopic;
    this.lessons = workingTopic.getLessons();
    this.workingQuiz = workingTopic.getQuiz();
    
    frame1 = new JFrame();
    tabbedPane = new JTabbedPane();

    frame1.setLayout(null);
    // for statement should populate string J with the title of the topic for
    // each topic in the course. Should iterate once for each 
    // topic in topics array. 
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
      topicDescription.setText("Description: " + workingTopic.getDescription());
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
      while (k < lessons.size()) {
        Lesson workingLesson = lessons.get(k);
        JLabel lessonName = new JLabel();
        viewLesson = new JButton();
        viewLesson.addActionListener(this);
        lessonName.setText(workingLesson.getTitle());
        viewLesson.setText("View");
        viewLesson.setName(Integer.toString(lessonIndex));
        System.out.println(viewLesson.getName()); // TEST
        lessonIndex = lessonIndex + 1;
        lessonName.setBounds(100, 160 + (k * 30), 150, 20);
        viewLesson.setBounds(250, 160 + (k * 30), 100, 20);
        p1.add(lessonName);
        p1.add(viewLesson);
        JButton editTopic = new JButton();
        JButton deleteTopic = new JButton();
        editTopic.setText("Edit");
        deleteTopic.setText("Delete");

        editTopic.setBounds(350, 160 + (k * 30), 100, 20);
        deleteTopic.setBounds(450, 160 + (k * 30), 100, 20);
        p1.add(editTopic);
        p1.add(deleteTopic);
        k++;
      }

      // Set Quiz info
      quizLabel.setBounds(50, 160 + (k * 30), 300, 20);
      p1.add(quizLabel);
      JLabel quizName = new JLabel();
      viewQuiz = new JButton();
      viewQuiz.addActionListener(this);
      quizName.setText(workingQuiz.getTitle());
      viewQuiz.setText("View");
      viewQuiz.setName(Integer.toString(lessonIndex));
      quizName.setBounds(100, 190 + (k * 30), 150, 20);
      viewQuiz.setBounds(250, 190 + (k * 30), 100, 20);
      p1.add(quizName);
      p1.add(viewQuiz);
      
      JButton editTopic = new JButton();
      JButton deleteTopic = new JButton();
      editTopic.setText("Edit");
      deleteTopic.setText("Delete");

      editTopic.setBounds(350, 190 + (k * 30), 100, 20);
      deleteTopic.setBounds(450, 190 + (k * 30), 100, 20);
      p1.add(editTopic);
      p1.add(deleteTopic);
      
      tabbedPane.setBounds(0,0,600,500);
    
      frame1.setVisible(true);
  
      frame1.setSize(600, 600 + (k * 30));
  
      frame1.add(tabbedPane);
  }
  }
  public void actionPerformed(ActionEvent e) {
    JButton btn = (JButton)e.getSource();
    int lessonBtnIndex = Integer.parseInt(btn.getName());

    if (lessonBtnIndex <= lessons.size() - 1) {
      new ViewLesson(facade, lessons.get(lessonBtnIndex));
    } else {
      new ViewQuestion(facade, workingCourse, workingQuiz);
    }
  }
}

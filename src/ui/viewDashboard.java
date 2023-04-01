package ui;
import java.util.ArrayList;
import backEnd.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class viewDashboard implements ActionListener{
  private final LMSFacade facade;
  JFrame frame1;
  ArrayList<Course> courses;
  JLabel coursesLabel;
  User user;

  viewDashboard(LMSFacade facade){
    this.facade = facade;
    this.courses = facade.getCourseList().getCourses();  
    this.user = facade.getUser();  
    
    frame1 = new JFrame();

    frame1.setLayout(null);
    // for statement should populate string J with the title of the course for
    // each course the student is enrolled in. Should iterate once for each 
    // course in courses array. 
    coursesLabel = new JLabel();
    coursesLabel.setText("Completed Courses");
    coursesLabel.setFont(new Font(coursesLabel.getFont().getName(), Font.BOLD, coursesLabel.getFont().getSize()));

    coursesLabel.setBounds(50, 50, 200, 20);
    

    frame1.add(coursesLabel);



    for (int i = 0; i < courses.size(); i++) {
    // for (int i = 0; i < courses.size(); i++) {
      Course workingCourse = courses.get(i);
      frame1.setLayout(null);
      
      String j = i + " ";
      JLabel courseName = new JLabel();
      JButton viewButton = new JButton();
      JButton printButton = new JButton();
      // JLabel 

    
      courseName.setText(workingCourse.getTitle()); // Course name
      viewButton.setText("view");
      printButton.setText("print");

      courseName.setFont(new Font(courseName.getFont().getName(), Font.BOLD, courseName.getFont().getSize()));

      courseName.setBounds(50, 80 + (i * 30), 150, 20);
      viewButton.setBounds(200, 80 + (i * 30), 100, 20);
      printButton.setBounds(300, 80 + (i * 30), 100, 20);
     

      frame1.add(courseName);
      frame1.add(viewButton);
      frame1.add(printButton);
      // should parse through all topics in course
    }
    

    
    frame1.setVisible(true);
    frame1.setSize(600, 600);

  }
  public void actionPerformed(ActionEvent e) {
    JButton btn = (JButton)e.getSource();
    String[] splitArray = btn.getName().split("\\s+");
    String action = splitArray[0];
    int courseBtnIndex = Integer.parseInt(splitArray[1]);
    int topicBtnIndex = Integer.parseInt(splitArray[2]);
    Course courseOfInterest = courses.get(courseBtnIndex);
    Topic topicOfInterest = courseOfInterest.getTopics().get(topicBtnIndex);
    if (action.equals("edit")) {
      // Edit the topic information
      new AddTopic(facade, topicOfInterest, true);
      frame1.setVisible(false);
    } else if (action.equals("delete")) {
      // Delete the topic
      facade.deleteTopic(courseOfInterest, topicOfInterest);
      frame1.setVisible(false);
    } else if (action.equals("view")) {
      // View that particular topic
      new ViewTopic(facade, courseOfInterest, topicOfInterest);
    } else if (action.equals("viewcomments")) {
      new ViewComments(facade, courseOfInterest.getComments());
    } else if (action.equals("addcomment")) {
      new AddComment(facade, courseOfInterest.getComments());
    }
  }
}
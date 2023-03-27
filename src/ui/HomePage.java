package ui;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import backEnd.Quiz;
import backEnd.Topic;
import backEnd.*;
public class HomePage implements ActionListener {

  JLabel l1; 
  JFrame frame1;
  JButton coursesButton;
  JButton searchButton;
  JButton signOutButton;
  JButton dashboardButton;


  HomePage() {
    // create new displayed objects
    frame1 = new JFrame();
    l1 = new JLabel();

    coursesButton = new JButton();
    searchButton = new JButton();
    signOutButton = new JButton();
    dashboardButton = new JButton();

    coursesButton.addActionListener(this);
    signOutButton.addActionListener(this);
    dashboardButton.addActionListener(this);
    searchButton.addActionListener(this);

    l1.setFont(new Font(l1.getFont().getName(), Font.BOLD, l1.getFont().getSize()));
    
    // set text for all prompts
    l1.setText("Welcome to our learning management system, GET FIRSTNAME");
    coursesButton.setText("Courses");
    searchButton.setText("Search");
    dashboardButton.setText("Dashboard");
    signOutButton.setText("Sign Out");



    // sets bounds for all objects
    l1.setBounds(50, 50, 400, 30);
    coursesButton.setBounds(200, 80, 100, 30);
    searchButton.setBounds(200, 110, 100, 30);
    dashboardButton.setBounds(200, 140, 100, 30);
    signOutButton.setBounds(200, 170, 100, 30);


    // adds all ojects
    frame1.add(l1);
    frame1.add(coursesButton);
    frame1.add(searchButton);
    frame1.add(dashboardButton);
    frame1.add(signOutButton);
  
    // creates frame
    frame1.setSize(500, 500);
    frame1.setLayout(null);
    frame1.setVisible(true);
  
    
  }
  public void actionPerformed(ActionEvent e) {
    LMSFacade facade = new LMSFacade();
    if (e.getSource() == coursesButton) {

    } else if (e.getSource() == searchButton) {

    } else if (e.getSource() == dashboardButton) {

    } else if (e.getSource() == signOutButton) {

    }
  }
}

package ui;
import javax.swing.*;

public class LogIn {
  JFrame frame1;
  JLabel l;
  JButton button1; 
  JTextField textField;
  JPasswordField passwordField;
  JLabel fieldLabel1;
  JLabel fieldLabel2;


  LogIn(){
    // creates a JFrame
    frame1 = new JFrame();
    l = new JLabel();
    button1 = new JButton("Submit");

    fieldLabel1 = new JLabel();
    fieldLabel2 = new JLabel();

    textField = new JTextField();
    passwordField = new JPasswordField();

    l.setText("Log in to continue");
    fieldLabel1.setText("Username:");
    fieldLabel2.setText("Password:");

    // x axis, y axis, width, height
    l.setBounds(120, 50, 300, 15);
    fieldLabel1.setBounds(120, 80, 100, 20);
    textField.setBounds(200, 80, 100, 20);
    fieldLabel2.setBounds(120, 110, 100, 20);
    passwordField.setBounds(200, 110, 100, 20);
    button1.setBounds(220, 140, 80, 30);
  
    frame1.add(l);
    frame1.add(textField);
    frame1.add(button1);
    frame1.add(fieldLabel1);
    frame1.add(fieldLabel2);
    frame1.add(textField);
    frame1.add(passwordField);
  
    //400 width and 500 height of frame1
    frame1.setSize(500, 300) ;
    frame1.setLayout(null);
    frame1.setVisible(true);
  }
}

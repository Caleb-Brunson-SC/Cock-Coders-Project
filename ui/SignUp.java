package ui;
import javax.swing.*;

public class SignUp {
  JFrame frame1;
  JLabel l;
  JButton button1; 
  JTextField textField;
  JLabel fieldLabel1;
  JLabel fieldLabel2;
  JLabel fieldLabel3;
  JLabel fieldLabel4;
  JLabel fieldLabel5;
  JLabel fieldLabel6;
  JLabel fieldLabel7;
  JTextField usernameField;
  JTextField firstField;
  JTextField lastField;
  JTextField emailField;
  JTextField DOBField;
  JPasswordField passwordField;
  JPasswordField confirmPasswordField;


  SignUp() {
    // creates a JFrame
    frame1 = new JFrame();
    l = new JLabel();
    button1 = new JButton("Submit");

    fieldLabel1 = new JLabel();
    fieldLabel2 = new JLabel();
    fieldLabel3 = new JLabel();
    fieldLabel4 = new JLabel();
    fieldLabel5 = new JLabel();
    fieldLabel6 = new JLabel();
    fieldLabel7 = new JLabel();
    usernameField = new JTextField();
    firstField = new JTextField();
    lastField = new JTextField();
    emailField = new JTextField();
    DOBField = new JTextField();
    passwordField = new JPasswordField(); 
    confirmPasswordField = new JPasswordField();

    textField = new JTextField();
    passwordField = new JPasswordField();

    l.setText("Sign up to continue");
    fieldLabel1.setText("Username:");
    fieldLabel2.setText("First Name:");
    fieldLabel3.setText("Last Name:");
    fieldLabel4.setText("Email:");
    fieldLabel5.setText("Date of Birth:");
    fieldLabel6.setText("Password:");
    fieldLabel7.setText("Confirm Password:");


    // x axis, y axis, width, height
    l.setBounds(100, 50, 300, 15);
    fieldLabel1.setBounds(100, 80, 150, 20);
    fieldLabel2.setBounds(100, 110, 150, 20);
    fieldLabel3.setBounds(100, 140, 150, 20);
    fieldLabel4.setBounds(100,170, 150, 20);
    fieldLabel5.setBounds(100, 200, 150, 20);
    fieldLabel6.setBounds(100, 230, 150, 20);
    fieldLabel7.setBounds(100, 260, 150, 20);

    usernameField.setBounds(250, 80, 100, 20);
    firstField.setBounds(250, 110, 100, 20);
    lastField.setBounds(250, 140, 100, 20);
    emailField.setBounds(250,170, 100, 20);
    DOBField.setBounds(250, 200, 100, 20);
    passwordField.setBounds(250, 230, 100, 20);
    confirmPasswordField.setBounds(250, 260, 100, 20);

    button1.setBounds(250, 290, 100, 20);
  
    frame1.add(l);
    frame1.add(textField);
    frame1.add(fieldLabel1);
    frame1.add(fieldLabel2);
    frame1.add(fieldLabel3);
    frame1.add(fieldLabel4);
    frame1.add(fieldLabel5);
    frame1.add(fieldLabel6);
    frame1.add(fieldLabel7);
    frame1.add(usernameField);
    frame1.add(firstField);
    frame1.add(lastField);
    frame1.add(emailField);
    frame1.add(DOBField);
    frame1.add(passwordField);
    frame1.add(confirmPasswordField);

    frame1.add(button1);
    
    frame1.setSize(500, 500) ;
    frame1.setLayout(null);
    frame1.setVisible(true);
  }
}

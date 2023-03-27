package ui;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import backEnd.*;

//language.java is enum for all languages
public class CreateCourse implements ActionListener{
  private final LMSFacade facade;
  JFrame frame1;
  JLabel l1;
  JLabel l2;
  JLabel l3;
  JButton button1;

  JLabel courseTitleLabel;
  JLabel languageLabel;
  JLabel descriptionLabel;
  JTextField courseTitleField;
  JComboBox languageField;
  JTextField descriptionField;

  ArrayList<Topic> topicList;

  JButton addTopic;

  String languages[] = {"C#", "CPP", "C", "Java", "JavaScript", "Python", "HTML", "CSS"};

  CreateCourse(LMSFacade facade){
    this.facade = facade;
    // create new displayed objects
    
    frame1 = new JFrame();
    l1 = new JLabel();
    l2 = new JLabel();
    l3 = new JLabel();
    button1 = new JButton();
    button1.addActionListener(this);

    l1.setFont(new Font(l1.getFont().getName(), Font.BOLD, l1.getFont().getSize()));
    l2.setFont(new Font(l2.getFont().getName(), Font.BOLD, l2.getFont().getSize()));
    l3.setFont(new Font(l3.getFont().getName(), Font.BOLD, l3.getFont().getSize()));

    courseTitleLabel = new JLabel(); 
    languageLabel = new JLabel();
    descriptionLabel = new JLabel();

    courseTitleField = new JTextField();
    languageField = new JComboBox(languages);
    descriptionField = new JTextField();

    topicList= new ArrayList<Topic>();
    addTopic = new JButton();

    // set text for all prompts
    l1.setText("Create Course");
    courseTitleLabel.setText("Course title:");
    languageLabel.setText("Select Language:");
    descriptionLabel.setText("Course Description:");
    button1.setText("Submit");

    button1.addActionListener(this);

    l2.setText("Topics");

    addTopic.setText("Add Topic");
    // Sets bounds of all elements
    l1.setBounds(100, 50, 300, 15);
    courseTitleLabel.setBounds(100, 80, 150, 20);
    languageLabel.setBounds(100, 110, 150, 20);
    descriptionLabel.setBounds(100, 140, 150, 20);

    courseTitleField.setBounds(250, 80, 150, 20);
    languageField.setBounds(250, 110, 150, 20);
    descriptionField.setBounds(250, 140, 150, 20);

    l2.setBounds(100, 170, 300, 15);

    int topicCounter = 0;
    while(topicCounter < topicList.size()){
      JLabel topicName = new JLabel();
      JButton editButton = new JButton();

      // lessonName.setText(lessonList.get(topicCounter));
      topicName.setText(topicList.get(topicCounter).getTitle());
      editButton.setText("Edit Lesson");
      topicName.setBounds(100, 200 + (30 * topicCounter), 150, 30);
      editButton.setBounds(300, 200 + (30 * topicCounter), 100, 30);

      frame1.add(topicName);
      frame1.add(editButton);
      topicCounter++;
    }

    addTopic.setBounds(300, 200 + (30 * topicCounter), 100, 30);
    button1.setBounds(300, 230 + (30 * topicCounter), 100, 30);

    // adds all ojects
    frame1.add(l1);

    frame1.add(courseTitleLabel);
    frame1.add(languageLabel);
    frame1.add(descriptionLabel);

    frame1.add(courseTitleField);
    frame1.add(languageField);
    frame1.add(descriptionField);

    frame1.add(l2);

    frame1.add(addTopic);
    frame1.add(button1);

    // frame1.add(l3);

    // frame1.add(addQuiz);
    // creates frame
    frame1.setSize(500, 350 + (30 * topicCounter));
    frame1.setLayout(null);
    frame1.setVisible(true);

    
  }
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      String language = languages[languageField.getSelectedIndex()];
      String title = courseTitleField.getText();
      String description = descriptionField.getText();
      System.out.println(language);
      System.out.println(title);
      System.out.println(description);
    } else if (e.getSource() == addTopic) {
      // frame1.setVisible(false);
      new AddTopic(facade);
    }
  }
}

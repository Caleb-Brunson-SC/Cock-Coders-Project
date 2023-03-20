package ui;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;

public class CreateCourse {
  JFrame frame1;
  JLabel l1;
  JLabel l2;
  JLabel l3;

  JLabel courseTitleLabel;
  JLabel languageLabel;
  JLabel descriptionLabel;
  JTextField courseTitleField;
  JComboBox languageField;
  JTextField descriptionField;

  ArrayList<String> lessonList;
  ArrayList<Quiz> quizList;

  JButton addLesson;
  JButton addQuiz;

  String languages[] = {"Python", "JavaScript", "Java", "C#", "PHP", "C++", "C", "R", "Swift", "Objective C", "Kotlin"};

  CreateCourse(){
    // create new displayed objects
    
    frame1 = new JFrame();
    l1 = new JLabel();
    l2 = new JLabel();
    l3 = new JLabel();
    l1.setFont(new Font(l1.getFont().getName(), Font.BOLD, l1.getFont().getSize()));
    l2.setFont(new Font(l2.getFont().getName(), Font.BOLD, l2.getFont().getSize()));
    l3.setFont(new Font(l3.getFont().getName(), Font.BOLD, l3.getFont().getSize()));

    courseTitleLabel = new JLabel(); 
    languageLabel = new JLabel();
    descriptionLabel = new JLabel();

    courseTitleField = new JTextField();
    languageField = new JComboBox(languages);
    descriptionField = new JTextField();

    lessonList= new ArrayList<String>();
    addLesson = new JButton();
    quizList = new ArrayList<Quiz>();
    addQuiz = new JButton();

    lessonList.add("POOP");
    // lessonList.add("SHIT");
    // lessonList.add("WEINER");
    // set text for all prompts
    l1.setText("Create Course");
    courseTitleLabel.setText("Course title:");
    languageLabel.setText("Select Language:");
    descriptionLabel.setText("Course Description:");

    l2.setText("Lessons");

    addLesson.setText("Add Lesson");

    l3.setText("Quizes");
    addQuiz.setText("Add Quiz");
  
    // sets bounds for all objects
    l1.setBounds(100, 50, 300, 15);
    courseTitleLabel.setBounds(100, 80, 150, 20);
    languageLabel.setBounds(100, 110, 150, 20);
    descriptionLabel.setBounds(100, 140, 150, 20);

    courseTitleField.setBounds(250, 80, 150, 20);
    languageField.setBounds(250, 110, 150, 20);
    descriptionField.setBounds(250, 140, 150, 20);

    l2.setBounds(100, 170, 300, 15);

    int lessonCounter = 0;
    while(lessonCounter < lessonList.size()){
      JLabel lessonName = new JLabel();
      JButton editButton = new JButton();

      lessonName.setText(lessonList.get(lessonCounter));
      // lessonName.setText(lessonList.get(lessonCounter).getTitle());
      editButton.setText("Edit Lesson");
      lessonName.setBounds(100, 200 + (30 * lessonCounter), 150, 30);
      editButton.setBounds(300, 200 + (30 * lessonCounter), 100, 30);

      frame1.add(lessonName);
      frame1.add(editButton);
      lessonCounter++;
    }
    // for(int i = 0; i < lessonList.size() ; i++){
    //   JLabel lessonName = new JLabel();
    //   JButton editButton = new JButton();

    //   lessonName.setText(lessonList.get(i));
    //   // lessonName.setText(lessonList.get(i).getTitle());
    //   editButton.setText("Edit Lesson");
    //   lessonName.setBounds(100, 200 + (30 * i), 150, 20);
    //   editButton.setBounds(250, 200 + (30 * i), 150, 20);

    //   frame1.add(lessonName);
    //   frame1.add(editButton);
    // }

    addLesson.setBounds(300, 200 + (30 * lessonCounter), 100, 30);

    l3.setBounds(100, 230 + (30 * lessonCounter), 300, 15);

    int quizCounter = 0;
    //this will need to change 
    while(quizCounter < lessonList.size()){
      JLabel quizName = new JLabel();
      JButton editButton = new JButton();

      quizName.setText(lessonList.get(quizCounter));
      // lessonName.setText(lessonList.get(lessonCounter).getTitle());
      editButton.setText("Edit Quiz");
      quizName.setBounds(100, 260 + (30 * lessonCounter) + (30 * quizCounter), 150, 30);
      editButton.setBounds(300, 260 + (30 * lessonCounter) + ( 30 * quizCounter), 100, 30);

      frame1.add(quizName);
      frame1.add(editButton);
      quizCounter++;
    }

    addQuiz.setBounds(300, 260 + (30 * lessonCounter) + (30 * quizCounter), 100, 30);


    // adds all ojects
    frame1.add(l1);

    frame1.add(courseTitleLabel);
    frame1.add(languageLabel);
    frame1.add(descriptionLabel);

    frame1.add(courseTitleField);
    frame1.add(languageField);
    frame1.add(descriptionField);

    frame1.add(l2);

    frame1.add(addLesson);

    frame1.add(l3);

    frame1.add(addQuiz);
    // creates frame
    frame1.setSize(500, 350 + (30 * lessonCounter) + (30 * quizCounter)) ;
    frame1.setLayout(null);
    frame1.setVisible(true);

  }
}
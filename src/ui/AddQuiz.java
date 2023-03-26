package ui;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import backEnd.Quiz;
import backEnd.Topic;
import backEnd.*;

//language.java is enum for all languages
public class AddQuiz implements ActionListener {
  JFrame frame1;
  JLabel l1;
  JLabel l2;
  JButton button1;

  JLabel titleLabel;
  JLabel descriptionLabel;

  JTextField titleField;
  JTextField descriptionField;

  ArrayList<Question> questionList;

  JButton addQuestion;

  AddQuiz(){
    // create new displayed objects
    frame1 = new JFrame();
    l1 = new JLabel();
    l2 = new JLabel();
    button1 = new JButton();

    titleLabel = new JLabel();
    descriptionLabel = new JLabel();
    
    titleField = new JTextField();
    descriptionField = new JTextField();

    l1.setFont(new Font(l1.getFont().getName(), Font.BOLD, l1.getFont().getSize()));
    l2.setFont(new Font(l1.getFont().getName(), Font.BOLD, l1.getFont().getSize()));

    titleLabel = new JLabel(); 
    descriptionLabel = new JLabel();

    titleField = new JTextField();
    descriptionField = new JTextField();

    questionList= new ArrayList<Question>();
    addQuestion = new JButton();

    // set text for all prompts
    l1.setText("Create Quiz");
    titleLabel.setText("Quiz Title:");
    descriptionLabel.setText("Quiz Description:");
    l2.setText("Questions");
    addQuestion.setText("Add Question");
    button1.setText("Submit");
  
    // sets bounds for all objects
    l1.setBounds(100, 50, 300, 15);
    titleLabel.setBounds(100, 80, 150, 20);
    descriptionLabel.setBounds(100, 110, 150, 20);

    titleField.setBounds(250, 80, 150, 20);
    descriptionField.setBounds(250, 110, 150, 20);

    l2.setBounds(100, 140, 300, 15);

    int questionCounter = 0;
    while(questionCounter < questionList.size()){
      JLabel questionName = new JLabel();
      JButton editButton = new JButton();

      questionName.setText(questionList.get(questionCounter).getQuestion());
      editButton.setText("Edit Question");
      questionName.setBounds(100, 170 + (30 * questionCounter), 150, 30);
      editButton.setBounds(300, 170 + (30 * questionCounter), 100, 30);

      frame1.add(questionName);
      frame1.add(editButton);
      questionCounter++;
    }

    addQuestion.setBounds(275, 170 + (30 * questionCounter), 125, 30);
    button1.setBounds(275, 200 + (30 * questionCounter), 125,30);

    // adds all ojects
    frame1.add(l1);

    frame1.add(titleLabel);
    frame1.add(descriptionLabel);

    frame1.add(titleField);
    frame1.add(descriptionField);

    frame1.add(l2);
    frame1.add(l1);

    frame1.add(addQuestion);
    frame1.add(button1);

    // frame1.add(l3);

    // frame1.add(addQuiz);
    // creates frame
    frame1.setSize(500, 350 + (30 * questionCounter));
    frame1.setLayout(null);
    frame1.setVisible(true);

  }
  public void actionPerformed(ActionEvent e) {
    LMSFacade facade = new LMSFacade();
    // if (e.getSource() == button1) {
    //   String topic = topicTitleField.getText();
    //   String description = descriptionField.getText();

    //   System.out.println(topic);
    //   System.out.println(description);
    // }
  }
}

package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Enumeration;

import backEnd.*;

public class ViewQuestion implements ActionListener {
    private final LMSFacade facade;
    Quiz workingQuiz;
    ArrayList<Question> questions;
    int questionIndex = 0; // keep track of submitButton
    int numberOfCorrectChoices = 0; // keep track of number of correct choices user makes
    ArrayList<String> correctAnswers;
    ArrayList<ButtonGroup> buttonGroups;
    JFrame frame1;
    JLabel l1;
    JRadioButton a0;
    JRadioButton a1;
    JRadioButton a2;
    JRadioButton a3;
    ArrayList<JPanel> pages;
    JTabbedPane tabbedPane;
    JButton submitButton;
    

    ViewQuestion(LMSFacade facade, Quiz workingQuiz) {
        this.facade = facade;
        this.workingQuiz = workingQuiz;
        this.questions = workingQuiz.getQuestions();
        this.correctAnswers = new ArrayList<String>();
        this.buttonGroups = new ArrayList<ButtonGroup>();

        frame1 = new JFrame();
        l1 = new JLabel();
        submitButton = new JButton();
        pages = new ArrayList<JPanel>();
        tabbedPane = new JTabbedPane();

        for (int i = 0; i < questions.size(); i++) { // 5 for now
            Question workingQuestion = questions.get(i);
            JPanel page = new JPanel();
            JLabel question = new JLabel();
            a0 = new JRadioButton();
            a1 = new JRadioButton();
            a2 = new JRadioButton();
            a3 = new JRadioButton();

            question.setText("Question " + (i + 1) + ": " + workingQuestion.getQuestion());
            ArrayList<String> choices = workingQuestion.getChoices();
            a0.setText("A) " + choices.get(0));
            a1.setText("B) " + choices.get(1));
            a2.setText("C) " + choices.get(2));
            a3.setText("D) " + choices.get(3));

            String workingCorrectAnswer = choices.get(workingQuestion.getCorrectAnswerIndex());
            correctAnswers.add(workingCorrectAnswer);

            ButtonGroup bg = new ButtonGroup();
            bg.add(a0);
            bg.add(a1);
            bg.add(a2);
            bg.add(a3);
            buttonGroups.add(bg);

            page.setLayout(null);

            question.setBounds(100, 50, 300, 30);
            a0.setBounds(100, 100, 300, 30);
            a1.setBounds(100, 130, 300, 30);
            a2.setBounds(100, 160, 300, 30);
            a3.setBounds(100, 190, 300, 30);

            page.add(question);
            page.add(a0);
            page.add(a1);
            page.add(a2);
            page.add(a3);
            pages.add(page);

             // Add a submit button to the page
             submitButton = new JButton("Submit");
             submitButton.setBounds(350, 190, 100, 30);
             submitButton.addActionListener(this);
             submitButton.setName(Integer.toString(questionIndex));
             questionIndex = questionIndex + 1;
             page.add(submitButton);
 
             tabbedPane.add("Question " + (i + 1), page);
        }
        tabbedPane.setBounds(0, 0, 500, 500);
        frame1.add(tabbedPane);

        frame1.setSize(500, 500);
        frame1.setLayout(null);
        frame1.setVisible(true); 
    } 

    public void actionPerformed(ActionEvent e) {
        System.out.println("submit");
        JButton btn = (JButton)e.getSource();
        int questionBtnIndex = Integer.parseInt(btn.getName());
        System.out.println(questionBtnIndex);

        String correctAnswer = correctAnswers.get(questionBtnIndex);
        System.out.println(correctAnswer);

        ButtonGroup bg = buttonGroups.get(questionBtnIndex);
        for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                System.out.println(button.getText());
            }
        }
    }
}
    

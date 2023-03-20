package ui;
import javax.swing.*;
import java.awt.*;

public class AddLesson{
  JFrame frame1;
  JLabel l1;

  JLabel nameLabel;
  JTextField nameField;
  JLabel contentLabel;
  JTextArea contentField;
  JScrollPane scroll;

  AddLesson(){

    frame1 = new JFrame();
    l1 = new JLabel();

    nameLabel = new JLabel();
    nameField = new JTextField(); 
    contentLabel = new JLabel();
    contentField = new JTextArea();
    contentField.setBounds(100, 140, 300, 200);
    contentField.setLineWrap(true);
    scroll = new JScrollPane(contentField);

    l1.setFont(new Font(l1.getFont().getName(), Font.BOLD, l1.getFont().getSize()));

    l1.setText("Create Lesson");
    nameLabel.setText("Lesson Name: ");
    contentLabel.setText("Lesson Content:");

    l1.setBounds(100, 50, 300, 15);

    nameLabel.setBounds(100, 80, 150, 20);
    nameField.setBounds(250, 80, 150, 20);
    contentLabel.setBounds(100, 110, 150, 20);
    scroll.setBounds(100, 140, 300, 200);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    frame1.add(l1);

    frame1.add(nameLabel);
    frame1.add(nameField);
    frame1.add(contentLabel);
    frame1.add(scroll);

    frame1.setSize(500, 400);
    frame1.setLayout(null);
    frame1.setVisible(true);
    frame1.setResizable(false);
  }
}

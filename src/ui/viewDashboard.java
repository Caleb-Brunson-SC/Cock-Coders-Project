package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import backEnd.*;

public class viewDashboard {
    private final LMSFacade facade;
    private final Course course;
    private JFrame frame;

    viewDashboard(LMSFacade facade) {
        this.facade = facade;
        course = new Course();
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        
        // Welcome User
        JLabel welcomeLabel = new JLabel("Welcome, " + facade.getUser().getUserName() + "!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(welcomeLabel, BorderLayout.NORTH);

        // Show User Email
        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        JLabel emailLabel = new JLabel("Email: " + facade.getUser().getEmail());
        infoPanel.add(emailLabel);

        // Show Course Progress
        ArrayList<Grade> grades = StudentProgress.getGrades();
        double totalGrade = 0.0;
        for (Grade grade : grades) {
            totalGrade += Grade.getGradePercentage();
        }
        double avgGrade = totalGrade / grades.size();
        JLabel gradeLabel = new JLabel(String.format("Course Progress: %.2f%%", avgGrade));
        infoPanel.add(gradeLabel);

        frame.getContentPane().add(infoPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

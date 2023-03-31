package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import backEnd.*;

public class viewDashboard {
    private final LMSFacade facade;
    private JFrame frame;
    private JLabel welcomeLabel;
    private JLabel emailLabel;
    private JLabel coursesLabel;
    private JLabel courseProgressLabel;

    viewDashboard(LMSFacade facade) {
        this.facade = facade;

        frame = new JFrame("Dashboard");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(4, 1));

        // Welcome Label
        welcomeLabel = new JLabel();
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setText("Welcome, " + facade.getUser().getName());
        frame.add(welcomeLabel);

        // Email Label
        emailLabel = new JLabel();
        emailLabel.setText("Email: " + facade.getUser().getEmail());
        frame.add(emailLabel);

        // Current Courses Label
        coursesLabel = new JLabel();
        coursesLabel.setFont(new Font("Arial", Font.BOLD, 16));
        coursesLabel.setText("Current Courses:");
        frame.add(coursesLabel);

        // Course Progress Label
        courseProgressLabel = new JLabel();
        courseProgressLabel.setFont(new Font("Arial", Font.BOLD, 16));
        courseProgressLabel.setText("Course Progress:");
        frame.add(courseProgressLabel);

        // Iterate through courses
        ArrayList<Course> courses = facade.getUser().getCourses();
        for (Course course : courses) {
            // Add course to coursesLabel
            JLabel courseLabel = new JLabel();
            courseLabel.setText(course.getName());
            coursesLabel.add(courseLabel);

            // Add course progress to courseProgressLabel
            double progress = facade.getStudentProgress(course.getId());
            JLabel courseProgress = new JLabel();
            courseProgress.setText(course.getName() + ": " + progress + "%");
            courseProgressLabel.add(courseProgress);
        }

        frame.setVisible(true);
    }
}

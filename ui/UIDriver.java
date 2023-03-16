package ui;
import javax.swing.*;

public class UIDriver {
    public static void main(String s[])  
    {  
        System.out.println("Launching program...");

        // Test code from: https://www.geeksforgeeks.org/creating-frames-using-swings-java/
        // creates instance of JFrame
        JFrame frame1 = new JFrame();
 
        // creates instance of JButton
        JButton button1 = new JButton("Sign Up");
         
        // "button2" appears on the button
        JButton button2 = new JButton("Log In");
 
        // x axis, y axis, width, height
        button1.setBounds(180, 50, 80, 80);
        button2.setBounds(180, 140, 80, 80);
 
        //adds button1 in Frame1
        frame1.add(button1);
         
        //adds button2 in Frame1
        frame1.add(button2);
 
        //400 width and 500 height of frame1
        frame1.setSize(500, 300) ;
         
        //uses no layout managers
        frame1.setLayout(null);
         
        //makes the frame visible
        frame1.setVisible(true);
    }  
}
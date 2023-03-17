import java.util.ArrayList;
import java.time.LocalDate;

public class tester {
    public static void main(String args[])  {  
        /*System.out.println("Testing DataLoader");

        System.out.println("--------------------------------------------------------------------\n");
        UserList us = UserList.getInstance();
        printUsers(us.getUsers());
        
        System.out.println("--------------------------------------------------------------------\n");
        LocalDate date = LocalDate.of(2020, 1, 8);
        us.addUser("admin", "bob", "jones", "bj32", "bj@gmail.com", date, "5892759fshkag");
        printUsers(us.getUsers());
        
        //us.saveUsers(); */

        // Create Quiz with Questions
        Question question1 = new Question("What is the color of the sky", new String[] {"blue", "green"}, 0);
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question1);
        Quiz quiz1 = new Quiz("Sky Quiz", "This will test you.", questions);

        // Create Lessons
        ArrayList<Lesson> lessons = new ArrayList<Lesson>();
        Lesson lesson1 = new Lesson("Sky Lesson", "Will teach you.", "The sky is blue!!! Not any other color.");
        lessons.add(lesson1);

        // Create User (Student) and Comments
        LocalDate student1DOB = LocalDate.of(2002, 3, 12);
        LocalDate comment1Date = LocalDate.of(2023, 3, 17);
        Student student1 = new Student("caleb", "brunson", "crb", "crb@email.com", student1DOB, "pass123");
        ArrayList<Comment> comments = new ArrayList<Comment>();
        Comment comment1 = new Comment(student1, comment1Date, "Why is the sky blue?", null);
        comments.add(comment1);

        // Create Topics
        ArrayList<Topic> topics = new ArrayList<Topic>();
        Topic topic1 = new Topic("The Sky", "Learn about the sky.", quiz1, lessons, comments);
        topics.add(topic1);

        // Create StudentProgress
        ArrayList<StudentProgress> progressList = new ArrayList<StudentProgress>();
        StudentProgress student1Progress = new StudentProgress(student1, new double[] {85.0}, 0);
        progressList.add(student1Progress);

        // Create Reviews
        ArrayList<Review> reviews = new ArrayList<Review>();
        Review review1 = new Review(student1, comment1Date, 5, "Great course!!!");
        reviews.add(review1);

        // Create Teacher and Course
        LocalDate teacher1DOB = LocalDate.of(1994, 6, 17);
        Teacher teacher1 = new Teacher("bob", "jones", "bj36", "bobj@email.com", teacher1DOB, "scooby420");
        Course course1 = new Course("Sky Course", Language.C, "Learn about Sky", teacher1, topics, reviews, comments, progressList);

        System.out.println(course1);

    }

    public static void printUsers(ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("***" + users.get(i));
        }
    }
}

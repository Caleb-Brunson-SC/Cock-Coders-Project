import java.util.ArrayList;
import java.util.Arrays;

public class Topic {
    private String title;
    private String description;
    private Quiz quiz;
    private ArrayList<Lesson> lessons;
    private ArrayList<Comment> comments;

    public Topic(String title, String description, Quiz quiz, 
        ArrayList<Lesson> lessons, ArrayList<Comment> comments) {
        this.title = title;
        this.description = description;
        this.quiz = quiz;
        this.lessons = lessons;
        this.comments = comments;
    }

    /* May need to go in Teacher class
    public void addLesson(Lesson lesson) {
        if(lesson != null) {
            lessons.addAll(Arrays.asList(lesson));
        }
    }

    public void removeLesson(Lesson lesson) {
        
    }

    public void addQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public void removeQuiz(Quiz quiz) {
        
    }
    */
}
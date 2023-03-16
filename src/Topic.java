import java.util.ArrayList;
import java.util.Arrays;

public class Topic {
    private ArrayList<Lesson> lessons;
    private String topicTitle;
    private String topicDescription;
    private Quiz quiz;
    private ArrayList<Comment> comments;

    public Topic(String topicTitle, String topicDescription) {
        this.topicTitle = topicTitle;
        this.topicDescription = topicDescription;
    }

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
}
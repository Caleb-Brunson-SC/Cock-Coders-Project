import java.util.ArrayList;
import java.util.UUID;

public class Topic {
    private UUID id;
    private String title;
    private String description;
    private Quiz quiz;
    private ArrayList<Lesson> lessons;
    private ArrayList<Comment> comments;

    public Topic(String title, String description, Quiz quiz, 
        ArrayList<Lesson> lessons, ArrayList<Comment> comments) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.quiz = quiz;
        this.lessons = lessons;
        this.comments = comments;
    }

    public Topic(UUID id, String title, String description, Quiz quiz, 
        ArrayList<Lesson> lessons, ArrayList<Comment> comments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.quiz = quiz;
        this.lessons = lessons;
        this.comments = comments;
    }

    //GETTERS AND SETTERS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
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
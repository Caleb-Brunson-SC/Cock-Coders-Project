package backEnd;
import java.util.ArrayList;
import java.util.UUID;

public class Topic {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UUID id;
    private String title;
    private String description;
    private Quiz quiz;
    private ArrayList<Lesson> lessons;
    private ArrayList<Comment> comments;

    public Topic() {
        this.id = NIL_UUID;
        this.title = "none";
        this.description = "none";
        this.quiz = new Quiz();
        this.lessons = new ArrayList<Lesson>();
        this.comments = new ArrayList<Comment>();
    }

    public Topic(String title, String description, Quiz quiz, 
        ArrayList<Lesson> lessons, ArrayList<Comment> comments) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.quiz = quiz;
        this.lessons = lessons;
        this.comments = comments;
    }

    //Topic constructor that initializes Comments to null
    public Topic(String title, String description, Quiz quiz, 
        ArrayList<Lesson> lessons) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.quiz = quiz;
        this.lessons = lessons;
        this.comments = null;
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

    // getElementByUUID methods
    public Lesson getLessonByUUID(UUID id) {
        for (Lesson lesson : lessons) {
            if (lesson.getId().equals(id)) {
                return lesson;
            }
        }
        return null;
    }

    public Comment getCommentByUUID(UUID id) {
        for (Comment comment : comments) {
            if (comment.getId().equals(id)) {
                return comment;
            }
        }
        return null;
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

    public Lesson createLesson(String title, String content) {
        Lesson newLesson = new Lesson(title, content);
        lessons.add(newLesson);
        return newLesson;
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

    @Override
    public String toString() {
        return "Topic [id=" + id + ", title=" + title + ", description=" + description + ", quiz=" + quiz + ", lessons="
                + lessons + ", comments=" + comments + "]";
    }

}
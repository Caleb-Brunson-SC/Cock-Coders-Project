import java.util.ArrayList;
import java.util.UUID;

public class Course {
    private UUID id;
    private String title;
    private Language language;
    private String description;
    private Teacher teacher;
    private ArrayList<Topic> topics;
    private ArrayList<Review> reviews;
    private ArrayList<Comment> comments;
    private ArrayList<StudentProgress> studentProgresses;

    public Course(String title, Language language, String description, 
        Teacher teacher, ArrayList<Topic> topics, ArrayList<Review> reviews, 
        ArrayList<Comment> comments, ArrayList<StudentProgress> studentProgresses) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.language = language;
        this.description = description;
        this.teacher = teacher;
        this.topics = topics;
        this.reviews = reviews;
        this.comments = comments;
        this.studentProgresses = studentProgresses;
    }

    public Course(UUID id, String title, Language language, String description, 
        Teacher teacher, ArrayList<Topic> topics, ArrayList<Review> reviews, 
        ArrayList<Comment> comments, ArrayList<StudentProgress> studentProgresses) {
            this.id = UUID.randomUUID();
            this.title = title;
            this.language = language;
            this.description = description;
            this.teacher = teacher;
            this.topics = topics;
            this.reviews = reviews;
            this.comments = comments;
            this.studentProgresses = studentProgresses;
    }

    // GETTERS AND SETTERS
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<Topic> topics) {
        this.topics = topics;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public ArrayList<StudentProgress> getStudentProgresses() {
        return studentProgresses;
    }

    public void setStudentProgresses(ArrayList<StudentProgress> studentProgresses) {
        this.studentProgresses = studentProgresses;
    }

    

    /* This might need to go in Teacher class
    public void addTopic(Topic topic) {
        if(topic != null) {
            topics.add(topic);
        }
    }

    public void removeTopic(Topic topic) {
        if(topic != null) {
            topics.remove(topic);
        }
    }

    public ArrayList<Review> updateReviews(Review review) {
        if(review != null) {
            reviews.addAll(reviews);
        }
        return reviews;
    }
    */
}

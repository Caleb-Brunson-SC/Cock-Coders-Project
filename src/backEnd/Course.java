package backEnd;
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
            this.id = id;
            this.title = title;
            this.language = language;
            this.description = description;
            this.teacher = teacher;
            this.topics = topics;
            this.reviews = reviews;
            this.comments = comments;
            this.studentProgresses = studentProgresses;
    }

    // getElementByUUID methods
    public Topic getTopicByUUID(UUID id) {
        for (Topic topic : topics) {
            if (topic.getId().equals(id)) {
                return topic;
            }
        }
        return null;
    }

    public Review getReviewByUUID(UUID id) {
        for (Review review : reviews) {
            if (review.getId().equals(id)) {
                return review;
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

    public StudentProgress getStudentProgressByStudentUUID(UUID id) {
        for (StudentProgress sp : studentProgresses) {
            if (sp.getStudent().getId().equals(id)) {
                return sp;
            }
        }
        return null;
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

    @Override
    public String toString() {
        return "Course [id=" + id + ", title=" + title + ", language=" + language + ", description=" + description
                + ", teacher=" + teacher + ", topics=" + topics + ", reviews=" + reviews + ", comments=" + comments
                + ", studentProgresses=" + studentProgresses + "]";
    }

}

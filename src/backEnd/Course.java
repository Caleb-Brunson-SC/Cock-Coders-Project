package backEnd;
import java.util.ArrayList;
import java.util.UUID;

public class Course {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UUID id;
    private String title;
    private Language language;
    private String description;
    private Teacher teacher;
    private ArrayList<Topic> topics;
    private ArrayList<Review> reviews;
    private ArrayList<Comment> comments;
    private ArrayList<StudentProgress> studentProgresses;

    public Course() {
        this.id = NIL_UUID;
        this.title = "none";
        this.language = Language.NONE;
        this.description = "none";
        this.teacher = new Teacher();
        this.topics = new ArrayList<Topic>();
        this.reviews = new ArrayList<Review>();
        this.comments = new ArrayList<Comment>();
        this.studentProgresses = new ArrayList<StudentProgress>();
    }

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

    public Topic createTopic(String title, String description, Quiz quiz, 
    ArrayList<Lesson> lessons) {
        Topic newTopic = new Topic(title, description, quiz, lessons);
        topics.add(newTopic);
        return newTopic;
        
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

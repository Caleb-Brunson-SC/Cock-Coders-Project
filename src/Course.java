import java.util.ArrayList;

public class Course {
    private ArrayList<Topic> topics;
    private String courseTitle;
    private String courseDescription;
    private Language courseLanguage;
    private ArrayList<Review> reviews;
    private ArrayList<Comment> comments;
    private Teacher teacher;

    public Course(String courseTitle, String courseDescription, Teacher teacher) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.teacher = teacher;
    }

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
}

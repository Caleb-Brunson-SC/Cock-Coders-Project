import java.util.ArrayList;

public class Student extends User {
    private ArrayList<CourseProgress> coursesEnrolled;
    private ArrayList<CourseProgress> coursesCompleted;

    public void takeQuiz() {

    }

    public boolean completedQuiz() {
        return true;
    }

    public CourseProgress getCourseProgressByKeyword(String keyword) {
        return null;
    }

    public ArrayList<CourseProgress> getAllCourseProgress() {
        return null;
    }

    public Review createReview(Review review) {
        return null;
    }

    public void deleteReview(Review review) {

    }
}

package backEnd;
import java.util.ArrayList;
import java.util.UUID;

public class CourseList {
    private ArrayList<Course> courses;
    private static CourseList courseList;
    private Review review_;
    
    private CourseList() {
        courses = DataLoader.getCourses();
    }

    public static CourseList getInstance() {
        if(courseList == null) {
            courseList = new CourseList();
        }
        return courseList;
    }

    public Course getCourseByUUID(UUID id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public boolean haveCourse(UUID id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    // HERE ADD: public boolean addCourse method

    public void saveCourses() {
        DataWriter.saveCourses();
    }

    //OTHER METHODS may change or delete
    /*
    public UserList addCourseList(UserList userList) {
        return null;
    }

    public void deleteCourseList(UserList userList) {

    }

    public void editCourseList(UserList userList) {

    }
    */

    public boolean completedQuiz() {
        // something
        return true;
    }

    public ArrayList<Course> getCourseProgressByKeyword(String keyword) {
        for(Course course : courses) {
            if(course.getTitle().equals(keyword)) {
                courses.add(course);
            }
        }
        return courses;
    }

    public ArrayList<StudentProgress> getAllCourseProgress() {
        return null;
    }

    public Review createReview(Review review) {
        if(review == null) {
            review_ = new Review();
        }
        return review_;
    }

    public void deleteReview(Review review) {

    }
}
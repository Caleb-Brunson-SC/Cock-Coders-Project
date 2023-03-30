package backEnd;
import java.util.ArrayList;
import java.util.UUID;

public class CourseList {
    private ArrayList<Course> courses;
    private static CourseList courseList;
    
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

    public void saveCourses() {
        DataWriter.saveCourses();
    }

    public boolean addCourse(String title, Language language, String description, 
    Teacher teacher, ArrayList<Topic> topics, ArrayList<Review> reviews, 
    ArrayList<Comment> comments, ArrayList<StudentProgress> studentProgresses) {
        // create instance of a course with params and UUID.rando()
        Course findCourse = new Course(title, language, description, teacher, topics, reviews, comments, studentProgresses);
        courses.add(findCourse);
        
        if(findCourse.getId() != null) {
            courseList.saveCourses();
            return true;
        }
        return false;
    }

    public boolean addCourse(Course course) {
        courses.add(course);

        if(course.getId() != null) {
            courseList.saveCourses();
            return true;
        }
        return false;
    }
    


    
}
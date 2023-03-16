import java.util.ArrayList;

public class CourseList {
    private CourseList courseList;
    private ArrayList<StudentProgress> courses;
    
    private CourseList() {
        courses = new ArrayList<>();
    }

    public void addCourseList(StudentProgress course) {
        courses.add(course);
    }

    public void deleteCourseList(StudentProgress course) {
        courses.remove(course);
    }

    public void editCourseList(StudentProgress course) {
        for(int i = 0; i <= courses.size(); i++) {
            if(courses.get(i).equals(course)) {
                courses.set(i, course);
                break;
            }
        }
    }

    public CourseList getInstance() {
        if(courseList == null) {
            courseList = new CourseList();
        }
        return courseList;
    }

    public ArrayList<StudentProgress> getCourses(String keyword) {
        ArrayList<StudentProgress> match = new ArrayList<>();
        for(StudentProgress course : courses) {
            if(course.getStudent().getAllCourses().contains(keyword.toLowerCase())) {
                match.add(course);
            }
        }
        return match;
    }
}

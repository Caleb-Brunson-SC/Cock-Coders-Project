package test;

import backEnd.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

/**
 * JUnit test for DataLoader class
 * Note: first start with users then move to courses
 * @author Caleb Brunson
 */

public class DataLoaderTest {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    public static final UUID TEACHER_UUID = UUID.fromString("7b23c04e-9f5a-4eff-aaf7-d74a9f03d8c0");
    public static final UUID STUDENT_UUID = UUID.fromString("6a73cd69-8316-4e4e-9e69-a4f743cbe148");
    public static final LocalDate DATE = LocalDate.of(2020, 1, 8);
    private UserList userList = UserList.getInstance();
	private ArrayList<User> users = userList.getUsers();
    private CourseList courseList = CourseList.getInstance();
    private ArrayList<Course> courses = courseList.getCourses();

    private Course createCourse() {
        Teacher teacher = new Teacher(TEACHER_UUID, "bob", "jones", "bj32", "bj@gmail.com", 
        "bjiscool123", NIL_UUID, NIL_UUID, NIL_UUID);

        ArrayList<Comment> comments = new ArrayList<Comment>();

        comments.add(new Comment(NIL_UUID, teacher, DATE, "blank comment", new ArrayList<Comment>()));

        ArrayList<Lesson> lessons = new ArrayList<Lesson>();

        lessons.add(new Lesson(NIL_UUID, "lesson title", "lesson content", comments));

        ArrayList<Question> questions = new ArrayList<Question>();

        ArrayList<String> choices = new ArrayList<String>();

        choices.add("question choice");

        questions.add(new Question(NIL_UUID, "question", choices, 0));

        Quiz quiz = new Quiz(NIL_UUID, "quiz title", "quiz description", questions);

        ArrayList<Topic> topics = new ArrayList<Topic>();

        topics.add(new Topic(NIL_UUID, "topic title", "topic description", quiz, lessons, comments));

        ArrayList<StudentProgress> studentProgresses = new ArrayList<StudentProgress>();

        ArrayList<Grade> grades = new ArrayList<Grade>();

        grades.add(new Grade(NIL_UUID, NIL_UUID, 0));

        Student student = new Student(STUDENT_UUID, "jay", "jones", "jayj",
        "jayj@gmail.com", "jj1234", NIL_UUID, NIL_UUID, NIL_UUID);

        studentProgresses.add(new StudentProgress(student, grades));

        ArrayList<Review> reviews = new ArrayList<Review>();

        reviews.add(new Review(NIL_UUID, student, DATE, 5, "review comment"));

        Course course = new Course(NIL_UUID, "intro to python", Language.PYTHON, "python course", teacher, 
        topics, reviews, comments, studentProgresses);

        return course;
    }

    @Before
    public void setup() {
        users.clear();
        users.add(new Student(NIL_UUID, "bob", "jones", "bj32", "bj@gmail.com", "bjiscool123", 
        NIL_UUID, NIL_UUID, NIL_UUID));
        DataWriter.saveUsers();

        courses.clear();
        courses.add(createCourse());
        DataWriter.saveCourses();
    }

    @After
    public void tearDown() {
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers();

        CourseList.getInstance().getCourses().clear();
        DataWriter.saveCourses();
    }

    // User Methods
    @Test
    public void testGetUsersSize() {
        users = DataLoader.getUsers();
        assertEquals(1, users.size());
    }

    @Test
    public void testGetUsersSizeZero() {
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers();
        assertEquals(0, users.size());
    }

    @Test
    public void testGetUserUUID() {
        users = DataLoader.getUsers();
        assertEquals(NIL_UUID, users.get(0).getId());
    }

    @Test
    public void testGetUserType() {
        users = DataLoader.getUsers();
        assertEquals("student", users.get(0).getType());
    }

    @Test
    public void testGetUserFullName() {
        users = DataLoader.getUsers();
        assertEquals("bob jones", users.get(0).getFullName());
    }

    @Test
    public void testGetUserFirstName() {
        users = DataLoader.getUsers();
        assertEquals("bob", users.get(0).getFirstName());
    }

    @Test
    public void testGetUserLastName() {
        users = DataLoader.getUsers();
        assertEquals("jones", users.get(0).getLastName());
    }

    @Test
    public void testGetUserUserName() {
        users = DataLoader.getUsers();
        assertEquals("bj32", users.get(0).getUserName());
    }

    @Test
    public void testGetUserEmail() {
        users = DataLoader.getUsers();
        assertEquals("bj@gmail.com", users.get(0).getEmail());
    }

    @Test
    public void testGetUserPassword() {
        users = DataLoader.getUsers();
        assertEquals("bjiscool123", users.get(0).getPassword());
    }

    @Test
    public void testGetUserCurrentCourseID() {
        users = DataLoader.getUsers();
        assertEquals(NIL_UUID, users.get(0).getCurrentCourseID());
    }

    @Test
    public void testGetUserCurrentTopicID() {
        users = DataLoader.getUsers();
        assertEquals(NIL_UUID, users.get(0).getCurrentTopicID());
    }

    @Test
    public void testGetUserCurrentLessonID() {
        users = DataLoader.getUsers();
        assertEquals(NIL_UUID, users.get(0).getCurrentLessonID());
    }

    // Course Methods
    @Test
    public void testGetCoursesSize() {
        courses = DataLoader.getCourses();
        assertEquals(1, courses.size());
    }

    @Test
    public void testGetCoursesSizeZero() {
        CourseList.getInstance().getCourses().clear();
        DataWriter.saveCourses();
        assertEquals(0, courses.size());
    }




}

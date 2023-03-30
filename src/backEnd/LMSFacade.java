package backEnd;
import java.util.UUID;
import java.util.ArrayList;
import javax.swing.*;  
import java.awt.event.*;  

public class LMSFacade {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    public static final int QUIZ_LIMIT = 1;
    public static final int TOPIC_LIMIT = 10; 
    public static final int LESSON_LIMIT = 10;
    public static final int QUESTION_LIMIT = 10;
    JFrame frame1;
    private UserList userList;
    private CourseList courseList;
    private User user; // the current user
    private ArrayList<Quiz> completedQuizzes;
    // Objects for creating a course
    private Course courseCreated;
    private ArrayList<Lesson> lessonsCreated;
    private Quiz quizCreated;
    private ArrayList<Question> questionsCreated;
    // Booleans to check if limits were reached
    private int quizCount;
    private int topicCount;
    private int lessonCount;
    private int questionCount;

    public LMSFacade() {
        this.userList =  UserList.getInstance();
        this.courseList = CourseList.getInstance();
        this.user = null;
        this.completedQuizzes = new ArrayList<Quiz>();
        this.courseCreated = new Course(); //new Course();
        this.lessonsCreated = new ArrayList<Lesson>();
        this.quizCreated = null;
        this.questionsCreated = new ArrayList<Question>();
        this.quizCount = 0;
        this.topicCount = 0;
        this.lessonCount = 0;
        this.questionCount = 0;
    }

    public UserList getUserList() {
        return userList;
    }

    public CourseList getCourseList() {
        return courseList;
    }

    public User getUser() {
        return user;
    }

    public boolean reachedQuizLimit() {
        return quizCount == QUIZ_LIMIT;
    }

    public boolean reachedTopicLimit() {
        return topicCount == TOPIC_LIMIT;
    }

    public boolean reachedLessonLimit() {
        return lessonCount == LESSON_LIMIT;
    }

    public boolean reachedQuestionLimit() {
        return questionCount == QUESTION_LIMIT;
    }

    public boolean login(String username, String password) {
        User loggedInUser = userList.getUser(username);
        if (userList.authUser(loggedInUser, password)) {
            this.user = loggedInUser;
            return true;
        } else {
            return false;
        }
    }

    public boolean signUp(String type, String firstName, String lastName, String username, String email, String password) {
        if(userList.addUser(type, firstName, lastName, username, email, password, NIL_UUID, NIL_UUID, NIL_UUID)) {
            // User successfully added to db
            this.user = userList.getUser(username);
            return true;
        } else {
            return false;
        }
    }

    public void signOut() {
        this.user = null;
    }

    // COURSE CREATION, EDITING, DELETION
    public void printCourseCreated() {
        System.out.println(courseCreated);
    }

    public void createCourse(String title, Language language, String description) {
        courseCreated.setId(UUID.randomUUID());
        courseCreated.setTitle(title);
        courseCreated.setLanguage(language);
        courseCreated.setDescription(description);
        courseCreated.setTeacher((Teacher)user);

        System.out.println(courseCreated); // testing
        System.out.println(courseCreated.getTeacher().getId().toString());

        
        if (user == null) {
            JOptionPane.showMessageDialog(frame1,"User is not logged in.","Alert",JOptionPane.WARNING_MESSAGE);
        } else if (courseCreated.getTopics().isEmpty()) {
            JOptionPane.showMessageDialog(frame1,"Topics are incomplete.","Alert",JOptionPane.WARNING_MESSAGE);
        } else {
            if (courseList.addCourse(courseCreated)) {
            } else {
                JOptionPane.showMessageDialog(frame1,"Failed to add course.","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void deleteCourse(Course course) {}

    public void createTopic(String title, String description) {
        Topic topic = new Topic();
        topic.setId(UUID.randomUUID());
        topic.setTitle(title);
        topic.setDescription(description);
        topic.setLessons(lessonsCreated);
        topic.setQuiz(quizCreated);

        if (lessonsCreated.isEmpty()) {
            JOptionPane.showMessageDialog(frame1,"Lessons are incomplete.","Alert",JOptionPane.WARNING_MESSAGE);
        } else if (quizCreated == null) {
            JOptionPane.showMessageDialog(frame1,"Quiz is incomplete.","Alert",JOptionPane.WARNING_MESSAGE);
        } else {
            courseCreated.getTopics().add(topic);
            topicCount++;
            // Reset lessons and questions array lists for the next topic
            lessonsCreated = new ArrayList<Lesson>();
            questionsCreated = new ArrayList<Question>();
        }
    }

    public void deleteTopic(Topic topic) {}


    public void createLesson(String title, String content) {
        Lesson lesson = new Lesson();
        lesson.setId(UUID.randomUUID());
        lesson.setTitle(title);
        lesson.setContent(content);

        lessonsCreated.add(lesson);
        lessonCount++;
    }

    public void deleteLesson(Lesson lesson) {}


    public void createQuiz(String title, String description) {
        quizCreated = new Quiz();
        quizCreated.setTitle(title);
        quizCreated.setDescription(description);

        if (questionsCreated.isEmpty()) {
            JOptionPane.showMessageDialog(frame1,"Questions are incomplete.","Alert",JOptionPane.WARNING_MESSAGE);
        } else {
            quizCreated.setQuestions(questionsCreated);
            quizCount++;
        }
    }

    public void deleteQuiz(Quiz quiz) {}

    public void createQuestion(String questionString, ArrayList<String> choices, int correctAnswerIndex) {
        Question question = new Question();
        question.setId(UUID.randomUUID());
        question.setQuestion(questionString);
        question.setChoices(choices);
        question.setCorrectAnswerIndex(correctAnswerIndex);

        questionsCreated.add(question);
        questionCount++;
    }
    
    public void deleteQuestion() {

    }

    public Comment createComment() {
        return null;
    }

    public void deleteComment() {}

    public void editComment() {}

    public Review createReview(Review review) {
        return null;
    }

    public void deleteReview(Review review) {}

    public void editReview(Review review) {}

    // SEARCHING FUNCTIONALITY
    public ArrayList<Course> getCourseByKeyword(String keyword) {
        return null;
    }

    public Course getCourseByTeacher(String teacherName) {
        return null;
    }

    public Course getCourseByRating(int rating) {
        return null;
    }

    public ArrayList<StudentProgress> getCourseProgress() {
        return null;
    }

    public ArrayList<Course> getAllCourses() {
        return null;
    }

    public StudentProgress getCourseProgressByKeyword(String keyword) {
        return null;
    }

    public ArrayList<StudentProgress> getAllCourseProgress() {
        return null;
    }

    // NAVIGATION
    public Course viewCourse() {
        return null;
    }

    public Topic viewTopic() {
        return null;
    }

    public Lesson viewLesson() {
        return null;
    }

    public Lesson viewQuiz() {
        return null;
    }

    public void viewDashboard() {}

    public void viewSettings() {}

    public void viewProfile() {}

    // QUIZ TAKING AND GRADING
    public void updateStudentProgress(Course course, Quiz completedQuiz, double grade) {
        ArrayList<StudentProgress> studentProgresses = course.getStudentProgresses();
        //1. sp is empty
        //2. sp is not empty and has user
        //3. sp is not empty and does not have user
        if (studentProgresses.isEmpty()) {
            System.out.println("case 1");
        } else if (studentProgresses.contains(course.getStudentProgressByStudentUUID(user.getId()))) {
            System.out.println("case 2");
        } else {
            System.out.println("case 3");
        }
    }

    public boolean hasCompletedQuiz(Quiz quiz) {
        return false;
    }

    // ADMIN PRIVLEDGES OVER TEACHERS
    public void addTeacher(Teacher teacher) {}

    public void removeTeacher(Teacher teacher) {}

}

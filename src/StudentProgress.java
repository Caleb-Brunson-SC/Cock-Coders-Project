import java.util.ArrayList;

public class StudentProgress {
    private Student student;
    private ArrayList<Double> quizGrades;
    private int currentTopicIndex;

    public StudentProgress(Student student, ArrayList<Double> quizGrades, int currentTopicIndex) {
        this.student = student;
        this.quizGrades = quizGrades;
        this.currentTopicIndex = currentTopicIndex;
    }

    //GETTERS AND SETTERS
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Double> getQuizGrades() {
        return quizGrades;
    }

    public void setQuizGrades(ArrayList<Double> quizGrades) {
        this.quizGrades = quizGrades;
    }

    public int getCurrentTopicIndex() {
        return currentTopicIndex;
    }

    public void setCurrentTopicIndex(int currentTopicIndex) {
        this.currentTopicIndex = currentTopicIndex;
    }

    @Override
    public String toString() {
        return "StudentProgress [student=" + student + ", quizGrades=" + quizGrades + ", currentTopicIndex="
                + currentTopicIndex + "]";
    }

    //OTHER METHODS
    public void createCertificate() {
        
    }
}

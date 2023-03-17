import java.util.Arrays;

public class StudentProgress {
    private Student student;
    private double[] quizGrades;
    private int currentTopicIndex;

    public StudentProgress(Student student, double[] quizGrades, int currentTopicIndex) {
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

    public double[] getQuizGrades() {
        return quizGrades;
    }

    public void setQuizGrades(double[] quizGrades) {
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
        return "StudentProgress [student=" + student + ", quizGrades=" + Arrays.toString(quizGrades)
                + ", currentTopicIndex=" + currentTopicIndex + "]";
    }

    //OTHER METHODS
    public void createCertificate() {
        
    }
}

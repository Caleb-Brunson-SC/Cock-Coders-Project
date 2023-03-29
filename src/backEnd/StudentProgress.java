package backEnd;
import java.util.ArrayList;

public class StudentProgress {
    private User student;
    private ArrayList<Double> quizGrades;

    public StudentProgress() {
        this.student = new Student();
        this.quizGrades = new ArrayList<Double>();
    }

    public StudentProgress(User student, ArrayList<Double> quizGrades) {
        this.student = student;
        this.quizGrades = quizGrades;
    }

    //GETTERS AND SETTERS
    public User getStudent() {
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

    @Override
    public String toString() {
        return "StudentProgress [student=" + student + ", quizGrades=" + quizGrades + "]";
    }

    //OTHER METHODS
    public void createCertificate() {
        
    }
}

public class StudentProgress {
    private Student student;
    private double[] quizGrades;
    private int currentTopicIndex;

    public StudentProgress(Student student, double[] quizGrades, int currentTopicIndex) {
        this.student = student;
        this.quizGrades = quizGrades;
        this.currentTopicIndex = currentTopicIndex;
    }

    public void createCertificate() {
        
    }
}

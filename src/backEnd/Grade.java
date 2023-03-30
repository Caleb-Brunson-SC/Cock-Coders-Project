package backEnd;

import java.util.UUID;

public class Grade {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UUID id;
    private Quiz quiz;
    private double gradePercentage;

    public Grade() {
        this.id = NIL_UUID;
        this.quiz = new Quiz();
        this.gradePercentage = -1;
    }

    public Grade(UUID id, Quiz quiz, double gradePercentage) {
        this.id = id;
        this.quiz = quiz;
        this.gradePercentage = gradePercentage;
    }

    public Grade(Quiz quiz, double gradePercentage) {
        this.id = UUID.randomUUID();
        this.quiz = quiz;
        this.gradePercentage = gradePercentage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public double getGradePercentage() {
        return gradePercentage;
    }

    public void setGradePercentage(double gradePercentage) {
        this.gradePercentage = gradePercentage;
    }

    @Override
    public String toString() {
        return "Grade [id=" + id + ", quiz=" + quiz + ", gradePercentage=" + gradePercentage + "]";
    }
   
}

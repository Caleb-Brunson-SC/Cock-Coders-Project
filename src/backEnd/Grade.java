package backEnd;

import java.util.UUID;

public class Grade {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UUID id;
    private UUID quizID;
    private double gradePercentage;

    public Grade() {
        this.id = NIL_UUID;
        this.quizID = NIL_UUID;
        this.gradePercentage = -1;
    }

    public Grade(UUID id, UUID quizID, double gradePercentage) {
        this.id = id;
        this.quizID = quizID;
        this.gradePercentage = gradePercentage;
    }

    public Grade(UUID quizID, double gradePercentage) {
        this.id = UUID.randomUUID();
        this.quizID = quizID;
        this.gradePercentage = gradePercentage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getQuizID() {
        return quizID;
    }

    public void setQuiz(UUID quizID) {
        this.quizID = quizID;
    }

    public double getGradePercentage() {
        return gradePercentage;
    }

    public void setGradePercentage(double gradePercentage) {
        this.gradePercentage = gradePercentage;
    }

    @Override
    public String toString() {
        return "Grade [id=" + id + ", quizID=" + quizID + ", gradePercentage=" + gradePercentage + "]";
    }
   
}

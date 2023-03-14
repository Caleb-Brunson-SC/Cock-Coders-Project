import java.util.ArrayList;

public class Quiz {
    protected String title;
    protected ArrayList<Question> questions;
    protected double timeLimit;

    public Quiz(String title, double timeLimit, double numOfQuestions) {

    }

    public double grade() {
        return 0;
    }

    public boolean hasNext() {
        return true;
    }

    public Question next() {
        return null;
    }
}

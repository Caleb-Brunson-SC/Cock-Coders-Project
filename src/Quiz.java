import java.util.ArrayList;

public class Quiz {
    protected String title;
    protected String description;
    protected ArrayList<Question> questions;

    public Quiz(String title, String description, ArrayList<Question> questions) {
        this.title = title;
        this.description = description;
        this.questions = questions;
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

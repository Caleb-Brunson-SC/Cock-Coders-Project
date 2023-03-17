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

    //GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    //OTHER METHODS
    public double grade() {
        return 0;
    }

    public boolean hasNext() {
        return true;
    }

    public Question next() {
        return null;
    }

    @Override
    public String toString() {
        return "Quiz [title=" + title + ", description=" + description + ", questions=" + questions + "]";
    }

    

}

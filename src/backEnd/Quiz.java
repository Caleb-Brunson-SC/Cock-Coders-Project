package backEnd;
import java.util.ArrayList;
import java.util.UUID;


public class Quiz {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    protected UUID id;
    protected String title;
    protected String description;
    protected ArrayList<Question> questions;

    public Quiz() {
        this.id = NIL_UUID;
        this.title = "none";
        this.description = "none";
        this.questions = new ArrayList<Question>();
    }

    public Quiz(UUID id, String title, String description, ArrayList<Question> questions) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.questions = questions;
    }

    public Quiz(String title, String description, ArrayList<Question> questions) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.questions = questions;
    }

    // getElementByUUID methods
    public Question getQuestionByUUID(UUID id) {
        for (Question question : questions) {
            if (question.getId().equals(id)) {
                return question;
            }
        }
        return null;
    }

    //GETTERS AND SETTERS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Quiz [id=" + id + ", title=" + title + ", description=" + description + ", questions=" + questions
                + "]";
    }
    
}

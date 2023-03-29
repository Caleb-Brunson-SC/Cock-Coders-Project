package backEnd;
import java.util.ArrayList;
import java.util.UUID;

public class Question {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UUID id;
    private String question;
    private ArrayList<String> choices;
    private int correctAnswerIndex;

    public Question() {
        this.id = NIL_UUID;
        this.question = "none";
        this.choices = new ArrayList<String>();
        this.correctAnswerIndex = -1;
    }

    public Question(String question, ArrayList<String> choices, int correctAnswerIndex) {
        this.id = UUID.randomUUID();
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public Question(UUID id, String question, ArrayList<String> choices, int correctAnswerIndex) {
        this.id = id;
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    //GETTERS AND SETTERS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", choices=" + choices + ", correctAnswerIndex="
                + correctAnswerIndex + "]";
    }

    

}

import java.util.UUID;

public class Question {
    private UUID id;
    private String question;
    private String[] choices;
    private int correctAnswerIndex;

    public Question(String question, String[] choices, int correctAnswerIndex) {
        this.id = UUID.randomUUID();
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public Question(UUID id, String question, String[] choices, int correctAnswerIndex) {
        this.id = id;
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    //GETTERS AND SETTERS
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }


}

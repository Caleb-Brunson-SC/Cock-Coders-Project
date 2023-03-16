public class Question {
    private String question;
    private String[] choices;
    private int correctAnswerIndex;

    public Question(String question, String[] choices, int correctAnswerIndex) {
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}

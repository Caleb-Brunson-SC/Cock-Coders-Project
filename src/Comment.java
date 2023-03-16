import java.time.LocalDate;
import java.util.ArrayList;

public class Comment {
    private User user;
    private LocalDate date;
    private String content;
    private ArrayList<Comment> replys;
    
    public Comment(User user, LocalDate date, String content, ArrayList<Comment> replys) {
        this.user = user;
        this.date = date;
        this.content = content;
        this.replys = replys;
    }

    //GETTERS AND SETTERS
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Comment> getReplys() {
        return replys;
    }

    public void setReplys(ArrayList<Comment> replys) {
        this.replys = replys;
    }

    
}

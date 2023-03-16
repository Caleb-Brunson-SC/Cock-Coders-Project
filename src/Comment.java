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
}

package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Comment {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UUID id;
    private User user;
    private LocalDate date;
    private String content;
    private ArrayList<Comment> replys;

    public Comment() {
        this.id = NIL_UUID;
        this.user = null;
        this.date = null;
        this.content = null;
        this.replys = null;
    }
    
    public Comment(User user, LocalDate date, String content, ArrayList<Comment> replys) {
        this.id = UUID.randomUUID();
        this.user = user;
        this.date = date;
        this.content = content;
        this.replys = replys;
    }

    public Comment(UUID id, User user, LocalDate date, String content, ArrayList<Comment> replys) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.content = content;
        this.replys = replys;
    }

    // getElementByUUID methods
    public Comment getReplyByUUID(UUID id) {
        for (Comment reply : replys) {
            if (reply.getId().equals(id)) {
                return reply;
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

    @Override
    public String toString() {
        return "Comment [id=" + id + ", user=" + user + ", date=" + date + ", content=" + content + ", replys=" + replys
                + "]";
    }
}

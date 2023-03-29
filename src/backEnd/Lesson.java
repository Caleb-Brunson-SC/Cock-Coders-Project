package backEnd;
import java.util.ArrayList;
import java.util.UUID;

public class Lesson {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UUID id;
    private String title;
    private String content;
    private ArrayList<Comment> comments;

    public Lesson() {
        this.id = NIL_UUID;
        this.title = "none";
        this.content = "none";
        this.comments = new ArrayList<Comment>();
    }

    public Lesson(String title, String content, ArrayList<Comment> comments) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.content = content;
        this.comments = comments;
    }

    public Lesson(String title, String content) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.content = content;
        this.comments = null;
    }

    public Lesson(UUID id, String title, String content, ArrayList<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.comments = comments;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Lesson [id=" + id + ", title=" + title + ", content=" + content + ", comments=" + comments + "]";
    } 
}

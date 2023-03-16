import java.util.UUID;

public class Lesson {
    private UUID id;
    private String title;
    private String description;
    private String content;

    public Lesson(String title, String description, String content) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public Lesson(UUID id, String title, String description, String content) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
}

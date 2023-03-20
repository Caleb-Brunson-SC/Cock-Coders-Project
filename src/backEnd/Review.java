package backEnd;
import java.time.LocalDate;
import java.util.UUID;

public class Review {
    private UUID id;
    private Student reviewer;
    private LocalDate date;
    private int rating;
    private String comment;

    public Review(Student reviewer, LocalDate date, int rating, String comment) {
        this.id = UUID.randomUUID();
        this.reviewer = reviewer;
        this.date = date;
        this.rating = rating;
        this.comment = comment;
    }

    public Review(UUID id, Student reviewer, LocalDate date, int rating, String comment) {
        this.id = id;
        this.reviewer = reviewer;
        this.date = date;
        this.rating = rating;
        this.comment = comment;
    }

    //GETTERS AND SETTERS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Student getReviewer() {
        return reviewer;
    }

    public void setReviewer(Student reviewer) {
        this.reviewer = reviewer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", reviewer=" + reviewer + ", date=" + date + ", rating=" + rating + ", comment="
                + comment + "]";
    }
    
    

}

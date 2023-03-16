import java.time.LocalDate;

public class Review {
    private Student reviewer;
    private LocalDate date;
    private int rating;
    private String comment;

    public Review(Student reviewer, LocalDate date, int rating, String comment) {
        this.reviewer = reviewer;
        this.date = date;
        this.rating = rating;
        this.comment = comment;
    }

    //GETTERS AND SETTERS
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
    

}

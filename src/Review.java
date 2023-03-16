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

    public Student getReviewer() {
        return null;
    }

    public int getRating() {
        return 0;
    }

    public String getComment() {
        return null;
    }
}

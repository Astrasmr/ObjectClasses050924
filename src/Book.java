import java.util.Objects;

public class Book {
    private String title ;
    private Author authour;
    private int year;


    public Book (String title, Author authour, int year) {
     this.title = title;
     this.authour = authour;
     this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthour() {
        return authour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authour=" + authour +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(authour, book.authour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authour, year);
    }
}


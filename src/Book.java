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
}


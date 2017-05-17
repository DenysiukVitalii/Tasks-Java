package JavaLabs;

public class Book {

    private String bookname;
    private String authorSurname;
    private String authorName;
    private String authorLastname;
    private String publishingHouse;
    private String yearPublishing;
    private float cost;

    @Override
    public String toString() {
        return ""+cost;
    }


    public Book(float cost, String bookname, String authorSurname, String authorName, String authorLastname,
                String publishingHouse, String yearPublishing) {
        this.cost = cost;
        this.bookname = bookname;
        this.authorSurname = authorSurname;
        this.authorName = authorName;
        this.authorLastname = authorLastname;
        this.publishingHouse = publishingHouse;
        this.yearPublishing = yearPublishing;
    }

    public String getBookName() {
        return bookname;
    }
    public String getAuthorSurname() {
        return authorSurname;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorLastname() {
        return authorLastname;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public String getYearPublishing() {
        return yearPublishing;
    }

}

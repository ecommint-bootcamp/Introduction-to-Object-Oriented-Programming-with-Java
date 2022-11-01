package hw1.ch8Odev3;

public class Book {

    private Author author;
    private String title;
    private int pageNumber;
    private String type;
    private boolean isHardCover;
    private int currentPage;

    public Book(Author author, String title, int pageNumber, String type, boolean isHardCover, int currentPage) {
        this.author = author;
        this.title = title;
        this.pageNumber = pageNumber;
        this.type = type;
        this.isHardCover = isHardCover;
        this.currentPage = currentPage;
    }

    public Book(Author author, String title, int pageNumber, String type, int currentPage) {
        this.author = author;
        this.title = title;
        this.pageNumber = pageNumber;
        this.type = type;
        this.currentPage = currentPage;
    }

    public Book() {

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}

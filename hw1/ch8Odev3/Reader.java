package hw1.ch8Odev3;

public class Reader {


    private String readerName;
    private int age;
    private char sex;

    public Reader() {

    }

    public Reader(String readerName, int age, char sex) {

        this.readerName = readerName;
        this.age = age;
        this.sex = sex;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void read(Book book) {
        System.out.println("Reader Info: " + getReaderName() + ", " + getAge() + ", " + getSex());

        if (book.isHardCover()) {
            System.out.println("Reader reads: " + book.getTitle() + " and author of book is " + book.getAuthor().getAuthorName() + "." + "\nThere are " + book.getPageNumber() +
                    " pages in the book and currently reader is on page " + book.getCurrentPage() + "\nBook is a " +
                    book.getType() + " type of a book. Also book is hardcovered.");
        } else {
            System.out.println("Reader reads: " + book.getTitle() + " and author of book is " + book.getAuthor().getAuthorName() + "." + "\nThere are " + book.getPageNumber() +
                    " pages in the book and currently reader on page " + book.getCurrentPage() + "\nBook is a " +
                    book.getType() + " type of a book and book is not hardcovered.");
        }


    }

    public void read2(Book book) {
        if (book.isHardCover()) {
            System.out.println("Reader reads: " + book.getTitle() + " and author of book is " + book.getAuthor().getAuthorName() + "." + "\nThere are " + book.getPageNumber() +
                    " pages in the book and currently reader has not started book yet." + "\nBook is a " +
                    book.getType() + " type of a book. Also book is hardcovered.");
        } else {
            System.out.println("Reader reads: " + book.getTitle() + " and author of book is " + book.getAuthor().getAuthorName() + "." + "\nThere are " + book.getPageNumber() +
                    " pages in the book and currently reader has not started book yet." + "\nBook is a " +
                    book.getType() + " type of a book and book is not hardcovered.");
        }
    }

}

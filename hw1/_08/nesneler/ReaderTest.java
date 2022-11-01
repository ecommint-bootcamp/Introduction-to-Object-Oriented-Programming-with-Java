package org.javaturk.oopj.hw1._08.nesneler;

public class ReaderTest {

    public static void main(String[] args) {

        Author author = new Author("Ivan Goncharov");
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle("Oblomov");
        book.setType("novel");
        book.setHardCover(true);
        book.setCurrentPage(200);
        book.setPage(650);

        Reader reader = new Reader();
        reader.setName("Emrullah");
        reader.setSex('E');
        reader.setAge(25);

        ReaderManager readerManager = new ReaderManagerImpl(reader);

        readerManager.read(book);


    }
}

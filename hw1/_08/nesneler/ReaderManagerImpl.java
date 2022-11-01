package org.javaturk.oopj.hw1._08.nesneler;

public class ReaderManagerImpl implements ReaderManager {

    private Reader reader;

    public ReaderManagerImpl(Reader reader) {
        this.reader = reader;
    }

    @Override
    public void read(Book book) {
        System.out.println(reader.getName() + " reads ...");

        System.out.println(" ****** Book Information ******");
        System.out.println();
        System.out.println("Book name : "+book.getTitle());
        System.out.println("Book author : "+ book.getAuthor());
        System.out.println("Book type : "+ book.getType());
        System.out.println("Page count : "+ book.getPage());
        System.out.println("Current page : "+ book.getCurrentPage());
    }
}

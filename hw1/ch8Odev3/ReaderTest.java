package hw1.ch8Odev3;

import java.util.Scanner;

public class ReaderTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Reader reader1 = new Reader();
        reader1.setReaderName("Semih Yildiz");
        reader1.setAge(26);
        reader1.setSex('M');

        Author author = new Author("J. R. R. Tolkien");

        Book book1 = new Book();
        //  book1.getAuthor().setAuthorName("J. R. R. Tolkien");
        book1.setAuthor(author);
        book1.setTitle("The Silmarillion");
        book1.setHardCover(false);
        book1.setPageNumber(696);
        book1.setType("Fantastic");
        System.out.println("What page are you on right now?");
        int currentPage = in.nextInt();
        in.nextLine();
        book1.setCurrentPage(currentPage);

        if (currentPage > 0) {
            reader1.read(book1);
        } else if (currentPage == 0) {
            reader1.read2(book1);
        } else System.out.println("Current page cannot be under 0.");

        in.close();
    }

}

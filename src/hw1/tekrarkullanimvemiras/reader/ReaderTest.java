package hw1.tekrarkullanimvemiras.reader;

public class ReaderTest {

    public static void main(String[] args) {
        Reader reader1= new Reader();
               reader1.name="Yildiz";


        Author author1=new Author();
        author1.authorName="Amin Maalouf";

        Book book1=new Book();
        book1.setTitle("Yuzuncu Ad");


        book1.author= new Author();
        //book1.setAuthor(author1);
        book1.author=author1;

        System.out.println("Name of Book's Author is: " + book1.author.authorName);





    }
}

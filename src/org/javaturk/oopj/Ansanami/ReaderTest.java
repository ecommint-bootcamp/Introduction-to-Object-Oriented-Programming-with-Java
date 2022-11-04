package Ansanami;

public class ReaderTest {

	public static void main(String[] args) {
		Reader reader1=new Reader("Emir",21,'E');
		Author author=new Author("Orhan Kemal");
		Book book1= new Book(author,"Baslik",5000,"Korku",true,3);
		Book book3= new Book(author,"Baslik2",50300,"eglence",false,4);
		Reader reader2=new Reader("Emir",21,'K');
		Author author1=new Author("Orhan Kemal");
		Book book4= new Book(author,"Baslik2",50300,"eglence",false,4);
		
	}

}

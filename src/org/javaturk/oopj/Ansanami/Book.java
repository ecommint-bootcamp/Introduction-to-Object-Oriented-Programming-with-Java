package Ansanami;

public class Book {
	
	Author author;
	String title;
	int page;
	String type;
	boolean isHardCover;
	int currentPage;
	
	
	public Book(Author author, String title, int page, String type, boolean isHardCover, int currentPage) {
		this.author = author;
		this.title = title;
		this.page = page;
		this.type = type;
		this.isHardCover = isHardCover;
		this.currentPage = currentPage;
	}
	
	
	
	@Override
	public String toString() {
		String s=new String();
		s+="\nBook Info\n";
		s+="Title:"+title+"\n";	
		s+="Page:"+page+"\n";	
		s+="Type:"+type+"\n";	
		s+="IsHardCover:"+isHardCover+"\n";	
		s+="currentPage:"+currentPage+"\n";
		s+="Author:"+author.name+"\n";
		return s;
	}
	@Override //title, author, page ve currentPage' e  bakıyor 
	public boolean equals(Object x) {
		Book b1=(Book)x;
		boolean a=false;
		if(title.equals(b1.title) &&author.equals(b1.author)&& page==b1.page&&currentPage==b1.currentPage) {
			a=true;
		}
		return a;
	}
	
	@Override
	public int hashCode() {
		return title.hashCode()+author.hashCode()+page+currentPage;
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
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
	public void setHardCover(boolean isHardCover) {
		this.isHardCover = isHardCover;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
}
	


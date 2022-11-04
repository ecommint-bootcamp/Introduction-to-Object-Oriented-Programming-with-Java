package Ansanami;

public class Author {
	
	String name;

	public Author(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		String s=new String();
		s+="\nAuthor Info\n";
		s+="Name:"+name+"\n";
		return s;
	}
	
	
	@Override //ada  bakılıyor
	public boolean equals(Object x) {
		Author r1=(Author)x;
		boolean a=false;
		if(name.equals(r1.name)){
			a=true;
		}
		return a;
	}
	
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		
}

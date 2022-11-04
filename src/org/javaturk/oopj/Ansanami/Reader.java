package Ansanami;
import java.util.*;
public class Reader {
	
	String name;
	int age;
	char sex;
	
	
	public Reader(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}


	public void Read(Book book) {
		System.out.print(name+" kisisi "+book.author.name+" adli yazarin kitabini okuyor.");
	}
	@Override
	public String toString() {
		String s=new String();
		s+="\nReader Info\n";	
		s+="Name:  "+name+ "\n";	
		s+="Age:   "+age+ "\n";	
		s+="Sex:   "+sex+ "\n";	
		return s;
	}
	
	@Override //Cinsiyetlerine  bakmıyor bizim esitligimizde
	public boolean equals(Object x) {
		Reader r1=(Reader)x;
		boolean a=false;
		if(name.equals(r1.name)&& age==r1.age ) {
			a=true;
		}
		return a;
	}
	
	
	public int  hashCode() {
		return name.hashCode()+age;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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

	
}

package hw1.fonksiyonel.ch1.odev1;

public class Student {
	private int no;
	private String name;
	private int year;
	private int dob;
	private String major;

	public void study() {

	}

	public void register() {

	}

	public Student(int no, String name, int year, int dob, String major) {

		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int i) {
		this.dob = i;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}



}

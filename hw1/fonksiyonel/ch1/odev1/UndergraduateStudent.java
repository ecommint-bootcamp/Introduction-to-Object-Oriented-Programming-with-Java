package hw1.fonksiyonel.ch1.odev1;

public class UndergraduateStudent extends Student {

	protected String minor;

	public UndergraduateStudent(int no, String name, int year, int dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;

	}
	public UndergraduateStudent(int no, String name, int year, int dob, String minor) {
		super(no, name, year, dob, minor);
		this.minor = minor;

	}
	

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Undergraduate student studies on " + getMinor() + ".");
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " registered to the Undergraduate school in " + getYear() + " with " + getNo()
				+ " schoold id and studying on " + getMinor() + ".");
	}
	@Override
	public String toString() {
		return "UndergraduateStudent [minor=" + minor + ", toString()=" + super.toString() + "]";
	}

	

}

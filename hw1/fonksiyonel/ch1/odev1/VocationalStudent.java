package hw1.fonksiyonel.ch1.odev1;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, int dob, String major) {
		super(no, name, year, dob, major);

	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Vocational student " + getName() + " is studying on " + getMajor() + " .");
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("Vocational student " + getName() + " registered to the " + getMajor() + " and got "
				+ getNo() + " school id in year " + getYear() + ".");
	}

	@Override
	public String toString() {
		return "VocationalStudent [toString()=" + super.toString() + "]";
	}

}

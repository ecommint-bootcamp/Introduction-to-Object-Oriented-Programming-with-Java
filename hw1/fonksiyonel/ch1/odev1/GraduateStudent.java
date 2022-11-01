package hw1.fonksiyonel.ch1.odev1;


public class GraduateStudent extends Student {

	protected String thesis;
	protected String advisor;

	public GraduateStudent(int no, String name, int year, int dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.thesis = thesis;
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Graduated student " + getName() + " is studying " + getMajor() + " and writing about "
				+ getThesis() + ".");
		writeThesis();
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("Graduated student " + getName() + " is registered to the " + getMajor() + " in year "
				+ getYear() + " with " + getNo() + " schoold id.");
	}

	public void writeThesis() {
		System.out.println("Graduated student " + getName() + " is writing thesis about " + getThesis() + " .");
		meetWithAdvisor();

	}

	public void meetWithAdvisor() {
		System.out.println("Graduated student " + getName() + " meets with advisor " + getAdvisor()
				+ " on every saturdays and talks about " + getThesis() + " .");

	}

}

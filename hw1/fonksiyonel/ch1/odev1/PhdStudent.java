package hw1.fonksiyonel.ch1.odev1;

public class PhdStudent extends GraduateStudent {

	protected boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, int dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
		// TODO Auto-generated constructor stub
	}

	public PhdStudent(int no, String name, int year, int dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
		// TODO Auto-generated constructor stub
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("PHD student" + getName() + " is studying to pass qualifying exam.");
		writeThesis();
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println(
				"PHD student " + getName() + " is registered to the Graduate Student Department's PHD section with "
						+ getNo() + " schoold id in year " + getYear());
	}

	@Override
	public void writeThesis() {
		// TODO Auto-generated method stub
		System.out.println("PHD student " + getName() + " is writing " + getThesis() + " .");
		meetWithAdvisor();
	}

	@Override
	public void meetWithAdvisor() {
		// TODO Auto-generated method stub
		System.out.println("PHD student " + getName() + " meets with advisor " + getAdvisor()
				+ " every saturdays and talks about " + getThesis() + ".");
		writePaper();
	}

	public void writePaper() {
		System.out.println("PHD student " + getName() + " writes papers about the thesis.");

	}

}

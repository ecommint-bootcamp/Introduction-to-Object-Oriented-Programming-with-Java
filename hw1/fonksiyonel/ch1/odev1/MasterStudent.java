package hw1.fonksiyonel.ch1.odev1;


public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, int dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Master student " + getName() + " is studying on " + getThesis() + " .");
		writeThesis();
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("Master student " + getName() + " is registered to the Graduate Student Department's "
				+ getMajor() + " section in year " + getYear() + " with " + getNo() + " schoold id.");
	}

	@Override
	public void writeThesis() {
		// TODO Auto-generated method stub
		System.out.println("Master student " + getName() + " write's " + getThesis() + " .");
		meetWithAdvisor();
	}

	@Override
	public void meetWithAdvisor() {
		// TODO Auto-generated method stub
		System.out.println("Master student " + getName() + " meets with advisor" + getAdvisor()
				+ " on Saturdays and talks about " + getThesis() + " .");
	}

}

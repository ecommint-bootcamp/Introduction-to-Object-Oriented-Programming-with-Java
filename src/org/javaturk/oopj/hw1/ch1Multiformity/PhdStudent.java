package ch1Multiformity;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	protected boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		System.out.println("A phd student is studying.");
	}

	@Override
	public void register() {
		System.out.println("The phd student is enrolled.");
	}

	@Override
	public void writeThesis() {
		System.out.println("A phd student is writing a thesis: " + thesis);
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Phd student's advisor: " + advisor);
	}

	public void writePaper() {
		System.out.println("I'm writing papers for a PhD degree");
	}

	@Override
	public String toString() {
		return "PhdStudent [qualifyingExamTaken=" + qualifyingExamTaken + ", advisor=" + advisor + ", thesis=" + thesis
				+ ", no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}

}

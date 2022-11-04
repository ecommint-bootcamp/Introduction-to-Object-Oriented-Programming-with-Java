package ch1Multiformity;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);

	}

	@Override
	public void study() {
		System.out.println("A master student is studying.");
	}

	@Override
	public void register() {
		System.out.println("The master student is enrolled.");
	}

	@Override
	public void writeThesis() {
		System.out.println("A master student is writing a thesis: " + thesis);
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Master student's advisor: " + advisor);
	}

	@Override
	public String toString() {
		return "MasterStudent [advisor=" + advisor + ", thesis=" + thesis + ", no=" + no + ", name=" + name + ", year="
				+ year + ", dob=" + dob + ", major=" + major + "]";
	}

}

package ch1Multiformity;

import java.util.Date;

public class GraduateStudent extends Student {
	protected String advisor;
	protected String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}

	@Override
	public void study() {
		System.out.println("A graduate student is studying.");
	}

	@Override
	public void register() {
		System.out.println("The graduate student is enrolled.");
	}

	public void writeThesis() {
		System.out.println("A graduate student is writing a thesis: " + thesis);
	}

	public void meetWithAdvisor() {
		System.out.println("Graduate student's advisor: " + advisor);
	}

	@Override
	public String toString() {
		return "GraduateStudent [advisor=" + advisor + ", thesis=" + thesis + ", no=" + no + ", name=" + name
				+ ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}

}

package ch1Multiformity;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);

	}

	@Override
	public void study() {
		System.out.println("A vocational student is studying.");
	}

	@Override
	public void register() {
		System.out.println("The vocational student is enrolled.");
	}

	@Override
	public String toString() {
		return "VocationalStudent [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major
				+ "]";
	}

}

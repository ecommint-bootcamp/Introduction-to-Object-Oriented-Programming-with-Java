package ch1Multiformity;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {
	private Student student;

	public Student getAStudent() {
		Random rand = new Random();
		int i = rand.nextInt(4);

		switch (i) {
		case 0: {
			student = new Student(1, "Berkay", 2021, new Date(), "Engineer");
			break;
		}

		case 1: {
			student = new VocationalStudent(2, "Ayşe", 2002, new Date(), "Mathematics");
			break;
		}

		case 3: {
			student = new GraduateStudent(3, "Cem", 2022, new Date(), "Physic", "Ahmet", "microphysics");
			break;
		}

		case 4: {
			student = new PhdStudent(4, "Akın", 1993, new Date(), "Computer Science", "Cem", "Adnan", true);
			break;
		}
		}
		return student;
	}

	public Student registerStudent(Student student) {
		if (student instanceof VocationalStudent) {
			VocationalStudent vS = (VocationalStudent) student;
			vS.study();
			vS.register();
			System.out.println(vS.toString());
			return vS;
		} else if (student instanceof PhdStudent) {
			PhdStudent pS = (PhdStudent) student;
			pS.study();
			pS.register();
			pS.writePaper();
			pS.writeThesis();
			pS.meetWithAdvisor();
			System.out.println(pS.toString());
			return pS;
		} else if (student instanceof MasterStudent) {
			MasterStudent mS = (MasterStudent) student;
			mS.study();
			mS.register();
			mS.writeThesis();
			mS.meetWithAdvisor();
			System.out.println(mS.toString());
			return mS;
		} else if (student instanceof GraduateStudent) {
			GraduateStudent gS = (GraduateStudent) student;
			gS.study();
			gS.register();
			gS.writeThesis();
			gS.meetWithAdvisor();
			System.out.println(gS.toString());
			return gS;
		} else if (student instanceof UndergraduateStudent) {
			UndergraduateStudent uS = (UndergraduateStudent) student;
			uS.study();
			uS.register();
			System.out.println(uS.toString());
			return uS;
		} else if (student instanceof VocationalStudent) {
			VocationalStudent vS = (VocationalStudent) student;
			vS.study();
			vS.register();
			System.out.println(vS.toString());
			return vS;
		} else {
			return getAStudent();
		}

	}

	public static void main(String[] args) {
		RegistrationOffice rf = new RegistrationOffice();
		rf.registerStudent(rf.getAStudent());
	}
}

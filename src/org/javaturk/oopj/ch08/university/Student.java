package org.javaturk.oopj.ch08.university;
import java.util.Date;
/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public abstract class Student {
	public int no;
	protected String name;
	protected Date dob;
	protected String major;
	Department department;
	Professor advisor;
	Course[] coursesTaken;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
        public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public Professor getAdvisor() {
        return advisor;
    }

        public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }

        public Course[] getCoursesTaken() {
        return coursesTaken;
    }

        public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
	public Student(int no, String name, Date dob, String major, String department) {
		
		this.no = no;
		this.name = name;
		this.dob = dob;
		this.major = major;
		this.department = department;
		this.advisor = advisor;
                this.coursesTaken = coursesTaken;
    }

	}
	
	}
	
	public void register() {
		System.out.println("This student is now registered.");
	}
		public void study() {
		System.out.println("This student is studying.);
	}			   
	@Override
	public String toString() {
		
		String s = new String();
		
		s += "Student Infos \n";
		s += "no : " + no + "\n";
		s += "name : " + name + "\n";
		s += "dob : " + dob + "\n";
		s += "major : " + major + "\n";
		s += "department : " + department + "\n";
		s += "Professor : " + advisor + "\n";
		return s;
	}
	

	
	
	

}

package prob2C;

public class Section {
	public int sectionNum;
	private Student student;

	Section(int sectionNum) {
		this.sectionNum = sectionNum;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getSectionNum() {
		return sectionNum;
	}
	
	@Override
	public String toString() {
		return "| SECTION NUM: " + sectionNum;
	}

}

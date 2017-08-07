package prog2Csubmit;

import java.util.List;

public class Section {
	private int sectionNum;
	
	private List<Student> student;

	public Section(int sectionNum) {
		this.sectionNum = sectionNum;
		student.add(createStudent());
	}
	
	public Student createStudent() {
		return new Student("dipesh", 1);
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public int getSectionNum() {
		return sectionNum;
	}

	

}

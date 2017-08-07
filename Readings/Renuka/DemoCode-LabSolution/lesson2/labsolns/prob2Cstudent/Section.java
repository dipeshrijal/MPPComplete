package lesson2.labsolns.prob2Cstudent;

import java.util.ArrayList;
import java.util.List;

public class Section {

	private int sectionNum;
	
	private List<Student> students;
	
	Section(int sectionNum, Student student){
		this.sectionNum = sectionNum;
		students = new ArrayList<Student>();
		student.enrollToSection(this);
		students.add(student);
	}

	public int getSectionNum() {
		return sectionNum;
	}

	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student){
		student.enrollToSection(this);
		this.students.add(student);
	}
	
}

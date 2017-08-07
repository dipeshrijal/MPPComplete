package prob2C;

public class StudentSectionFactory {
	
	public static StudentSection createStudentSection(String name, int id, int sectionNum) {
		Student student = new Student(name, id);
		Section section = new Section(sectionNum);
		student.setSection(section);
		section.setStudent(student);
		
		return new StudentSection(student, section);
		
	}

}

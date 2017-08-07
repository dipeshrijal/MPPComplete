package lesson2.labsolns.prob2Cstudent;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Student stud1 = new Student("Issa");
		Student stud2 = new Student("Ashraf");
		Student stud3 = new Student("Pat");
		
		List<Student> students = Arrays.asList(stud1, stud2, stud3);
		
		Section sectionOne = new Section(1, stud1);
		sectionOne.addStudent(stud2);
		
		Section sectionTwo = new Section(2, stud1);
		sectionTwo.addStudent(stud2);
		sectionTwo.addStudent(stud3);
		//stud2.enrollToSection(sectionTwo);
		//stud3.enrollToSection(sectionTwo);
		
		students.forEach(System.out::println);		
		System.out.println("Students Enrolled in SectionTwo : " + sectionTwo.getStudents().size());
		
	}
	

}

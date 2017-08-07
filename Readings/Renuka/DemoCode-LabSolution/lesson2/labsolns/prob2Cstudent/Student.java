package lesson2.labsolns.prob2Cstudent;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	
	private List<Section> sections;

	public Student(String name){
		this.name = name;
		sections = new ArrayList<Section>(); 
				
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public void enrollToSection(Section section){
		this.sections.add(section);
		//section.addStudent(this);
	}
	
	@Override
	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Student Name ").append(this.getName()).append(" assigned to : ").append("\n");
		
		sections.forEach(section -> builder.append("Section # ").append(section.getSectionNum()).append("\n"));
		
		return builder.toString();
	}
	
}

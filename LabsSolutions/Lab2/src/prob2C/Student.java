package prob2C;

public class Student {
	private String name;
	private int id;
	private Section section;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "| NAME: " + name + "| ID: " + id + section;
	}

}

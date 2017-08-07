package prog2Csubmit;

import java.util.List;

public class Student {
	private String name;

	private int id;
	private List<Section> section;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public List<Section> getSection() {
		return section;
	}

	public void setSection(List<Section> section) {
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}

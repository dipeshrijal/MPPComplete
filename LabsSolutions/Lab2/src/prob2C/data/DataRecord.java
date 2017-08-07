package prob2C.data;

public class DataRecord {
	
	String name;
	int id;
	int sectionNum;
	
	public DataRecord(String name, int id, int sectionNum) {
		this.name = name;
		this.id = id;
		this.sectionNum = sectionNum;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSectionNum() {
		return sectionNum;
	}

}

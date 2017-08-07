package april2017.problem5;

public class Student {
	String name;
	int id;
	Graduate grd;

	// You can define any Data member or Method here
	public Student(String n, int i, Graduate g) {
		name = n;
		id = i;
		grd = g;
	}
	
	public int scholarships() {
		return grd.scholarships();
	}
	
	public int feeCal() {
		return grd.feeCal();
	}

}

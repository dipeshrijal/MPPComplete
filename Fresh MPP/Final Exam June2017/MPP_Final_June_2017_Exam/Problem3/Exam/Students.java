package Problem3.Exam;

public class Students 
{
	String Id;
	String f_Name;
	String l_Name;
	String City;
	int age;
	
	 public Students(String i,String f,String l,String c,int a)
	 {
		 Id=i;
		 f_Name=f;
		 l_Name=l;
		 City=c;
		 age=a;
	 }

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Last name:"+this.l_Name+" First name:"+this.f_Name+" City:"+this.City;
	}

}

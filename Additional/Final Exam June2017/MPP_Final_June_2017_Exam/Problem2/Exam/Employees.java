package Problem2.Exam;

import java.util.Objects;

public class Employees 
{
	String Id;
	String Name;
	int Age;
	String Gender;
	public Employees(String i,String n, int a, String g)
	{
		Id=i;
		Name=n;
		Age=a;
		Gender=g;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Override
	public String toString()
	{
		return "Id:"+this.getId()+" Name:"+this.getName()+" Age:"+this.getAge()+" Gender:"+this.getGender();
	}
	
	@Override
	public int hashCode(){
		 int result = 17;
		 result = 31 * result + this.getId().hashCode();                   // 1 bit   » 32-bit
 	     result = 31 * result + this.getName().hashCode();                                // 8 bits  » 32-bit 
		 result = 31 * result + this.getGender().hashCode();                                // 16 bits » 32-bit
		 result = 31 * result + this.getAge();                               // 16 bits » 32-bit
		 return result;                               

	}

}

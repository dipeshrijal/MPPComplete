package Problem6.Exam;

import java.util.Objects;

public class Employees 
{
	String Id;
	String Name;
	int Age;
	String Gender;
	int Salary;
	public Employees(String i,String n, int a, String g,int s)
	{
		Id=i;
		Name=n;
		Age=a;
		Gender=g;
		Salary=s;
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
	public void setSalary(int s)
	{
		Salary=s;
	}
	public int getSalary()
	{
		return Salary;
	}
	@Override
	public int hashCode(){
		 int result = 17;
		 result = 31 * result + this.getId().hashCode();                   
 	     result = 31 * result + this.getName().hashCode();                            
		 result = 31 * result + this.getGender().hashCode();                             
		 result = 31 * result + this.getAge();                              
		 return result;                               

	}

}

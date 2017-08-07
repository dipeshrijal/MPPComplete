package Problem2.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main 
{
	public static void main(String[] args)
	{
		List<Employees> emplist=new ArrayList<Employees>()
		{
			{
				add(new Employees("28-12331", "Tong Ren",21,"Male"));
				add(new Employees("99-22223", "David Lynch", 23, "Male"));
				add(new Employees("28-12335", "Ayla Maersk",21,"Female"));
				add(new Employees("99-22255", "Ayman Bayed", 33, "Male"));
				add(new Employees("44-85356", "Yunatan Blue",21,"Unknown"));
				add(new Employees("78-12331", "Nicolase Bryen",21,"Male"));
				add(new Employees("99-22258", "Daniyal Mahd", 19, "Male"));
				add(new Employees("99-22258", "Daniyal Mahd", 19, "Male"));
				add(new Employees("44-85331", "Joyce Mac",21,"Female"));	
				add(new Employees("99-22223", "Jordan Creek",21,"Unknown"));
			}
		};
		
			Map<String,Employees> empmap=Main.getEmpList(emplist);
			empmap.forEach((k,v)->System.out.println("Key:"+ k+" Value:"+ v));
				
	}
	public static Map<String,Employees> getEmpList(List<Employees> emplist) 
	{
		// Write your code here
		return null;
	}
	
}

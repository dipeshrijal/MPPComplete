package classs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ReduceStream {
	List<String> lst = Arrays.asList("as","b","as","bs","aaw");
	public static void main(String args[])
	{
//		List<String> lst = Arrays.asList("as","b","as","bs","aaw");
//		List<String> ls= lst.stream().filter(s->s.startsWith("c"))
//		.map(s-> s+ "a")
//		.collect(Collectors.toList());
//		System.out.println(ls);
//		
//		String s1="test";
////		s1.equals(anObject)
//		
//		
//		List<String> ls1=lst.stream()
//		.filter(s->s.equals("as"))
//		.collect(Collectors.toList());
//		System.out.println("---" + ls1);
		
		ReduceStream rs= new ReduceStream();
		rs.main1();

	}
	
	public void main1(){
		List<String> ls= lst.stream().filter(s->s.startsWith("c"))
				.map(s-> s+ "a")
				.collect(Collectors.toList());
				System.out.println(ls);
				
				String s1="test";
//				s1.equals(anObject)
				
				
				List<String> ls1=lst.stream()
				.filter(s->s.equals("as"))
				.collect(Collectors.toList());
				System.out.println("---" + ls1);
				
				
				long lst2 = lst.stream()
						.filter(s->s.length()>1)
						.count();
				System.out.println("long : " + lst2);
	}
}
	

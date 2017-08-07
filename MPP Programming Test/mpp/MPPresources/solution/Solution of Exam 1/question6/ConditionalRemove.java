package finalmpp.question6;

import java.util.function.Predicate;
import java.util.*;
public class ConditionalRemove {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("ramesh", "kushal", "suresh", "kc")); 
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(100, 40, 50, 1000)); 
		System.out.println(conditionalRemove(list1));
	}

	public static <T> List<T> conditionalRemove(ArrayList<T> list) {
		ConditionCheck<T> cond = new ConditionCheck<>();
		Iterator<T> it = list.iterator();
       		while(it.hasNext())     
        	{
     		   T t = it.next();
            	   if (cond.test(t)) {
                       it.remove();
                   }
                }
        	return list;
	}
	
	static class ConditionCheck <T> implements Predicate<T> {
		@Override
		public boolean test(T t) {
			if (t instanceof String) {
				return (((String) t).contains("k"));
			} else if (t instanceof Integer) {
				return ((int) t > 100);
			} else if (t instanceof Employee) {
				return ((int) ((Employee) t).getSalary() < 60000);
			}
			return true;
		}
		
	}
}

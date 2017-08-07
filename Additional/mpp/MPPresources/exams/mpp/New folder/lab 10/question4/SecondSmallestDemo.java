package lab10.question4;
import java.util.*;
import java.util.stream.Collectors;
public class SecondSmallestDemo {
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
		List<T> result = list.stream().sorted((x,y)->x.compareTo(y)).collect(Collectors.toList());
		return result.get(1);
	}
	public static void main(String[]a){
		List<Integer> listInteger = Arrays.asList(10,2,4,9,0,12);
		List<String> listString = Arrays.asList("Rhododandrun","Rose","Lily","Sunflower","Flora");
		
		System.out.println("SecondSmallest of integer list: "+secondSmallest(listInteger));
		System.out.println("SecondSmallest of integer list: "+secondSmallest(listString));	
		
	}
}

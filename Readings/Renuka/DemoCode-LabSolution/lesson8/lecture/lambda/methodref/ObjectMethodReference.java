package lesson8.lecture.lambda.methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class ObjectMethodReference {
	 public static void main(String[] args)
	   {
	      String s = "method references are cool";
	      print(s::toString);
	      print(() -> s.toString());
	     
	      String s1 = "Functional Programming";
	      show(s1::length);
	      show(() -> s1.length());
	      
	      Integer integer = new Integer(11);
	      System.out.println(integer.compareTo(22));
	      Function<Integer,Integer> fi = integer::compareTo;
	      System.out.println(fi.apply(22));
	      
	   }

	   public static void print(Supplier<String> supplier)
	   {
	      System.out.println(supplier.get());
	   }
	   public static void show(Supplier<Integer> supplier)
	   {
	      System.out.println("Length of a String : " + supplier.get());
	   }
}

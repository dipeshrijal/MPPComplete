package lesson8.lecture.function;

import java.util.function.Consumer;

public class ReverseString {

	public static void main(String args[]){
		
	
		Consumer<String> rev = (String text) -> {
			@SuppressWarnings("unused")
			String temp = null;
			for(int i=text.length()-1;i>=0;i--){
				//temp = temp + text.charAt(i);
				System.out.print(text.charAt(i));
			}
			
			};
			rev.accept("JAVA");
	}
}

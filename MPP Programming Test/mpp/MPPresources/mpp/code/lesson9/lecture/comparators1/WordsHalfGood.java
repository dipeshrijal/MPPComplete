package lesson9.lecture.comparators1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsHalfGood {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Tom", "Joseph", "Richard", "Andy");
		
		Stream<String> longestFirst  = words.stream().sorted(
				(String x, String y) -> y.length()-x.length());
		
		System.out.println(longestFirst.collect(Collectors.toList()));
	}
	
}

package lesson9.lecture.comparators1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.*;

public class WordsAllGood {
	public static void main(String[] args) {
		goodSort();
	}
	
	public static void goodSort() {
		List<String> words = Arrays.asList("Tom", "Jph", "Richard");
		Stream<String> longestFirst  
		    = words.stream().sorted(Comparator.comparing(String::length).reversed());
		System.out.println(longestFirst.collect(Collectors.toList()));
	}
}

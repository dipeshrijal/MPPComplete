package labs.problem6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReduceList {

	public static void main(String[] args) {

		List<Set<String>> list = new ArrayList<Set<String>>();
		Set<String> first = new TreeSet<String>();
		first.add("A");
		first.add("B");
		Set<String> second = new TreeSet<String>();
		first.add("D");
		Set<String> third = new TreeSet<String>();
		first.add("1");
		first.add("2");
		first.add("3");

		list.add(first);
		list.add(second);
		list.add(third);
		
		ReduceList reduce = new ReduceList();
		reduce.union(list).forEach(System.out::println);

	}

	public Set<String> union(List<Set<String>> sets) {
		return sets.stream().flatMap(n -> n.stream()).collect(Collectors.toSet());
	}

}

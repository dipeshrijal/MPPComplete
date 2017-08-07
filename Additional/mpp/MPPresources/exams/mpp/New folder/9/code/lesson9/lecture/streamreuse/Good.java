package lesson9.lecture.streamreuse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Good {
	public static void main(String[] args) {
		Good g = new Good();
		System.out.println(g.countNumberFriendsStartingWith("B"));
		System.out.println(g.listFriendsNamesStartingWith("B"));
	}
	public Stream<String> listStartsWith(List<String> list, String letter) {
		return list.stream().filter(name -> name.startsWith(letter));
	}
	public int countNumberFriendsStartingWith(String letter) {
		return (int) listStartsWith(Folks.friends, letter).count();
	}
	public List<String> listFriendsNamesStartingWith(String letter) {
		return listStartsWith(Folks.friends, letter).collect(
				Collectors.toList());
	}
}

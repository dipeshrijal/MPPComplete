package lesson11.lecture.exceptions2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson11.lecture.exceptions2.TheProblem.MyFunction;

/**
 * This class provides an easy solution -- just provide a companion
 * method that deals with the exception by re-throwing it as a 
 * RuntimeException. 
 *
 */
public class EasierSolution {
	public List<String> getCanonicalPaths(String[] dirs)  {
		return Stream.of(dirs).map(
			path -> uncheckedGetCanonicalPath(path))
			.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		String[] localDirs = {"//usr", "//usr", "//etc"};
		List<String> canonicalPaths 
			= (new EasierSolution()).getCanonicalPaths(localDirs);
		System.out.println(canonicalPaths);
	}
	
	public static String uncheckedGetCanonicalPath(String path) {
		try {
			return new File(path).getCanonicalPath();
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
//		return null;
	}
	
}

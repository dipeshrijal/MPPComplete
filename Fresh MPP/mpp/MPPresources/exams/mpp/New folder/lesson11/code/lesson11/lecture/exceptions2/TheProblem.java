package lesson11.lecture.exceptions2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TheProblem {

	class MyFunction implements Function<String, String>{

		@Override
		public String apply(String path) {
			try {
				return new File(path).getCanonicalPath();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		
	}
	public List<String> getCanonicalPaths(String[] dirs) throws IOException {
		return Stream.of(dirs)
//		 .map(path ->
//		 new File(path).getCanonicalPath()) //UNHANDLED IOEXCEPTION
				.collect(Collectors.toList());
	}
	
		
	public static void main(String[] args){
//		new File("S").getCanonicalPath();
//		String[] localDirs = {"//usr", ".temp", "/etc"};
//		try {
//			List<String> canonicalPaths 
//				= (new TheProblem()).getCanonicalPaths(localDirs);
//			System.out.println(canonicalPaths);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
	}

}

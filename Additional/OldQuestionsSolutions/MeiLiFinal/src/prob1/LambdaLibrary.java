package prob1;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<LibraryMember>,String,Character,String > IMPLEMENT = 
			(sampleData,state,char0) -> sampleData.stream()
			.filter(lm->lm.getAddress().getState().equals(state))
			.filter(lm->lm.getFirstName().charAt(0)>char0)
			.sorted((lm1,lm2)->(Integer.valueOf(lm1.getAge())).compareTo(Integer.valueOf(lm2.getAge())))
			.map(lm-> lm.getFirstName() + " " + lm.getLastName())
			.collect(Collectors.joining(","));
			
		
			public static List<LibraryMember> sampleData;
			public static String state;
			public static Character char0;
 			
//	public static final String IMPLEMENT = IMPLEMENTOR.apply(sampleData, state, char0);
			
//	public static final String IMPLEMENT = "Implement";
							
		
			
	}

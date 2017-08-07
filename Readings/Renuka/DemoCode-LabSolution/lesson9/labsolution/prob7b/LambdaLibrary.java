package lesson9.labsolution.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Character, String> SALARY_NAME =
				(emps, salaryBoundary, letter) -> 
			            emps.stream()
					        .filter(e -> (e.getSalary() > salaryBoundary))
					        .filter(e -> (e.getLastName().charAt(0) > letter))
					        .map(Employee::fullName)
					        .sorted().collect(Collectors.joining(", "));
					
			               
	
}

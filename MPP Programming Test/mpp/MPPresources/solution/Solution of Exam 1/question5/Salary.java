package finalmpp.question5;

import java.time.LocalDate;

public interface Salary {
	LocalDate getHireDate() ;
	
	default double computeBonus() {
		int hireYear = getHireDate().getYear();
		int thisYear = LocalDate.now().getYear();
		return 400 * (thisYear - hireYear);
	}
}

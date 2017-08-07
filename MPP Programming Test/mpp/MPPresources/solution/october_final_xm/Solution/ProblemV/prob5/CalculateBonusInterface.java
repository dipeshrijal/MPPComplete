package prob5;

import java.time.LocalDate;
//creating interface
public interface CalculateBonusInterface {
	
	//abstract method for getHireDate
	LocalDate getHireDate();

	//default method for computeBonus
	default double computeBonus() {
		int hireYear = getHireDate().getYear();
		int thisYear = LocalDate.now().getYear();
		return 400 * (thisYear - hireYear);
	}
}

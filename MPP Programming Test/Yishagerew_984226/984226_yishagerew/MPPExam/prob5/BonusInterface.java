package MPPExam.prob5;

import java.time.LocalDate;

/**
 * Created by yishagerew on 10/27/2016.
 */
public interface BonusInterface {
    LocalDate getHireDate();
    default double computeBonus(){
        System.out.println(getHireDate().getYear());
        int hireYear = getHireDate().getYear();
        int thisYear = LocalDate.now().getYear();
        return 400 * (thisYear - hireYear);
    }
}

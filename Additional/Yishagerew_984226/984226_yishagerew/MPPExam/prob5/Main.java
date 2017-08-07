package MPPExam.prob5;

import java.time.LocalDate;

/**
 * Created by 984226 on 10/27/2016.
 */
public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("yishagerew", 2000, LocalDate.of(2000,10,10),null);
        System.out.println(mgr.computeBonus());
        LeadEngineer en = new LeadEngineer("Lulie", 2018, LocalDate.of(2018,10,10),null);
        System.out.println(en.computeBonus());
    }
}

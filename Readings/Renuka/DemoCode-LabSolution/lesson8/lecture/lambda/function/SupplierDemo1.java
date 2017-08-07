package lesson8.lecture.lambda.function;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier<Integer> oneDigitRandom = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };
        
        Supplier<Double> rn = () -> Math.random();
        System.out.println(rn.get());
        
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    oneDigitRandom.get());
        }
    }
}
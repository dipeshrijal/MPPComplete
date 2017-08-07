package lesson8.lecture.lambda.methodref;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class WithBiFunction {
    
    public static void formatAndPrint(
            BiFunction<String, List<String>, String> formatter, 
            String delimiter, List<String> list) {
        String formatted = formatter.apply(delimiter, list);
        System.out.println(formatted);
    }
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Don", "King", "Kong");
        formatAndPrint(String::join, ", ", names);
    }
}
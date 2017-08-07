package lesson8.lecture.lambda.methodref;
import java.util.Arrays;

public class MethodReferenceDemo3 {
    
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen","KRISTY"};
        
        Arrays.sort(names, String::compareToIgnoreCase);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
package lesson8.lecture.lambda;

@FunctionalInterface
interface B1 {
abstract void apply();
String toString();
}

/*@FunctionalInterface
interface FunctionalInterfaceExample2 {
void apply();
void illegal();
}*/  // Invalid

@FunctionalInterface 
interface FunctionalInterfaceExample2 {
void show();
}

@FunctionalInterface
interface A1 {
abstract void apply();
}

interface C1 {
void apply();
int hashCode();
}


 interface Calculator1 {

    double calculate(int a, int b);
}


public class ValidInValidInterface {

}

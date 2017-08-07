package lesson8.lecture.lambdaexamples.trifunction;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
	String toString();
	default int myMethod(){
		return 1;
	}
	default int apply(int x){
		return 1;
	}
}

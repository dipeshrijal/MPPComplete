package labs.problem10;

public interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

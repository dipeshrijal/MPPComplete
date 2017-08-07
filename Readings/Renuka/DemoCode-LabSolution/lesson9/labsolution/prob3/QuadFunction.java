package lesson9.labsolution.prob3;

@FunctionalInterface
public interface QuadFunction<S,T,U,V, R> {
	R apply(S s, T t, U u, V v);
}

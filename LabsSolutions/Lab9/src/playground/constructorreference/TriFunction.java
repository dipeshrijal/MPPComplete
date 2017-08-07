package playground.constructorreference;

public interface TriFunction<T, U, V, R> {

	R apply(T t, U u, V v);

//	default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
//		Objects.requireNonNull(after);
//		return (T t, U u) -> after.apply(apply(t, u));
//	}

}

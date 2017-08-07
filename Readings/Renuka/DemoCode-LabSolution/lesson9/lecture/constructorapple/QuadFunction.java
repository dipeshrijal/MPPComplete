package lesson9.lecture.constructorapple;

public interface QuadFunction<S, R, U, T, E> {
	E apply(S s, R r, U u, T t);
}

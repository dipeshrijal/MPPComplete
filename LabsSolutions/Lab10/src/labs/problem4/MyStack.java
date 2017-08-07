package labs.problem4;

import java.util.Arrays;

public class MyStack<T> {

	private T[] container;
	private int head;
	private int size;

	@SuppressWarnings("unchecked")
	public MyStack() {
		container = (T[]) new Object[10];
		head = -1;
		size = 0;
	}

	public void push(T obj) {

		if (size > head) {
			resize();
		}

		if (size == 0) {
			head = 0;
		}

		container[head++] = obj;
		size++;

	}

	public T pop() {
		if (size() == 0) {
			throw new IndexOutOfBoundsException("Stack is empty");
		}
		T temp = container[size - 1];
		container[getSize() - 1] = null;
		head--;
		size--;
		return temp;

	}

	public T peek() {
		if (size() == 0) {
			throw new IndexOutOfBoundsException("Stack is empty");
		}
		return container[size - 1];
	}

	public void resize() {
		int len = container.length;
		int newlen = len * 2;
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[newlen];
		System.arraycopy(container, 0, temp, 0, len);

		container = temp;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "MyStack [container=" + Arrays.toString(container) + "]";
	}

	public int getSize() {
		return size;
	}

}

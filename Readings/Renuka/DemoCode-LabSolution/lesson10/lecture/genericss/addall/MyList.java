package lesson10.lecture.genericss.addall;

public interface MyList<E> {
	public void add(E e);
	//public void addAll(MyList<E> list);
	public void addAll(MyList<? extends E> list);
	public E get(int i);
	public int getSize();
}

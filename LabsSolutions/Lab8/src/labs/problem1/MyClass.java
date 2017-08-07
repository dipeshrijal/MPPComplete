package labs.problem1;

import java.util.function.Predicate;

public class MyClass {

	private int x;
	private int y;

	public MyClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean myMethod(MyClass cl) {

		Predicate<MyClass> value = this::equals;
		
		return value.test(cl);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyClass [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		MyClass class1 = new MyClass(10, 20);
		MyClass class2 = new MyClass(10, 20);

		System.out.println(class1.myMethod(class2));
	}

}

package playground.overrides;

public final class Person {

	private final String firstName;
	private final String lastName;
	private final int age;

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		// if (this.getClass() != obj.getClass()) {
		// return false;
		// }

		if (!(obj instanceof Person)) {
			return false;
		}

		Person p = (Person) obj;

		boolean isEqual = firstName.equals(p.firstName) && lastName.equals(p.lastName) && age == p.age;

		return isEqual;

	}

	@Override
	public int hashCode() {
		int result = 17;

		result = result * 31 + firstName.hashCode();
		result = result * 31 + lastName.hashCode();
		result = result * 31 + age;

		return result;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Dipesh", "Rijal", 26);
		Person p2 = new Person("Dipesh", "Rijal", 26);

		System.out.println(p1.equals(p2));
	}

}

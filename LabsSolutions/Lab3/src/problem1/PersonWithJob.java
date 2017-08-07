package problem1;

public class PersonWithJob {

	private double salary;
	private Person person;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPerson;
		boolean isEqual = this.person.equals(p.person) && this.salary == p.salary;
		return isEqual;
	}

	public static void main(String[] args) {

		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		// All person with job are person but all person with job may not have
		// job so they don't have salary attribute
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}

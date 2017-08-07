package apr2017.problem2;

public class Admin {
	// implement

	Department[] depts;

	public Admin(Department[] depts) {
		this.depts = depts;
	}

	public String hourlyCompanyMessage() {
		StringBuilder message = new StringBuilder();

		for (Department department : depts) {

			message.append(format(department.getName(), department.nextMessage()));

		}

		return message.toString();

	}

	public String format(String name, String message) {
		return name + ":" + message + "\n";
	}

}

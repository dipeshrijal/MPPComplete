package lesson2.labsolns.prob1;

public class Feature {
	private Sprint owningSprint;
	private Developer associatedDeveloper;
	public Feature(Sprint s) {
		this.owningSprint = s;
	}
	public Sprint getOwningSprint() {
		return owningSprint;
	}
	public void setOwningSprint(Sprint owningSprint) {
		this.owningSprint = owningSprint;
	}
	public Developer getAssociatedDeveloper() {
		return associatedDeveloper;
	}
	public void setAssociatedDeveloper(Developer associatedDeveloper) {
		this.associatedDeveloper = associatedDeveloper;
	}
}

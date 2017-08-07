package lesson2.labsolns.prob1;

import java.time.LocalDate;
import java.util.List;

public class Sprint {
	private List<Feature> sprintFeatures;
	
	private LocalDate dueDate;
	
	public Sprint() {
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
	public List<Feature> getSprintFeatures() {
		return sprintFeatures;
	}
	public void setSprintFeatures(List<Feature> sprintFeatures) {
		this.sprintFeatures = sprintFeatures;
	}

	
	
}

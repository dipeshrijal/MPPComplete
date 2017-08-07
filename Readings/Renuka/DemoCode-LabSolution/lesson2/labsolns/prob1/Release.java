package lesson2.labsolns.prob1;
import java.util.*;
public class Release {
	private List<Sprint> sprintList = new ArrayList<>();
	private List<Feature> featureList = new ArrayList<>();
	public Release() {}
	
	public void addSprint(Sprint s) {
		sprintList.add(s);
	}
	public void addFeature(Feature f) {
		featureList.add(f);
	}
	
	public List<Sprint> getSprintList() {
		return sprintList;
	}
	public void setSprintList(List<Sprint> sprintList) {
		this.sprintList = sprintList;
	}
	
}

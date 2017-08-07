package lesson2.labsolns.prob1;

import java.time.LocalDate;
import java.util.List;

public class Developer {
	private String developerId;
	private List<Feature> assignedFeatures;
	
	/** Returns number of estimated days to complete work on this feature */
	public double timeRemaining(Feature feature, LocalDate startingFrom) {
		return 2.5; //real implemenation is done later
	}
	
	/** Returns the estimated total number of days to complete work on 
	 * this feature
	 * @return
	 */
	public double estimatedTotal(Feature feature) {
		return 11.3;
	}
	public String getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}
	public List<Feature> getAssignedFeatures() {
		return assignedFeatures;
	}
	public void setAssignedFeatures(List<Feature> assignedFeatures) {
		this.assignedFeatures = assignedFeatures;
	}
}

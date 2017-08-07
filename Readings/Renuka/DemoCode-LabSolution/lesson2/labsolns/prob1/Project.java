package lesson2.labsolns.prob1;
import java.util.*;
public class Project {
	private String projectId;
	private List<Feature> backlogFeatureList = new ArrayList<>();
	private List<Release> releaseList= new ArrayList<>();
	public Project() {}
	
	public void addRelease(Release r) {
		releaseList.add(r);
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public List<Feature> getBacklogFeatureList() {
		return backlogFeatureList;
	}
	public void setBacklogFeatureList(List<Feature> backlogFeatureList) {
		this.backlogFeatureList = backlogFeatureList;
	}
	public List<Release> getReleaseList() {
		return releaseList;
	}
	public void setReleaseList(List<Release> releaseList) {
		this.releaseList = releaseList;
	}

}

package com.sgic;

import java.util.List;

public class Project {
	
	private String projectName;
	private String description;
	private List<Defect> defectlist;
	
	public Project(List<Defect> defectList) {
		// TODO Auto-generated constructor stub
		this.defectlist = defectList;
	}
	public List<Defect> getDefectlist() {
		return defectlist;
	}
	public void setDefectlist(List<Defect> defectlist) {
		this.defectlist = defectlist;
	}

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}

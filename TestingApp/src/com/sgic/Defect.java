package com.sgic;

public class Defect {
	private String defectName;
	private String severity;
	private String priority;
	
	public Defect(String defectName, String severity, String priority) {
		// TODO Auto-generated constructor stub
		this.defectName = defectName;
		this.severity = severity;
		this.priority = priority;
	}
	public String getDefectName() {
		return defectName;
	}
	public void setDefectName(String defectName) {
		this.defectName = defectName;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
}

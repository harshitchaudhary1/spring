package com.learn.spring;

public class student {
	private int StudentId;
	private String StudentName;
	private String StudentAddress;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}

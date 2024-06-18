package com.krishna.APPlication01;

import java.util.List;
import java.util.Set;

public class Student {
	private int rollNumber;
	private String studentName;
	private String aggrigateMarks;
	private Course course;
	private List<String> skillSet;
	
	private Set<String> setofHobbies;
	
	
	
	
	public Set<String> getSetofHobbies() {
		return setofHobbies;
	}
	public void setSetofHobbies(Set<String> setofHobbies) {
		this.setofHobbies = setofHobbies;
	}
	public List<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAggrigateMarks() {
		return aggrigateMarks;
	}
	public void setAggrigateMarks(String aggrigateMarks) {
		this.aggrigateMarks = aggrigateMarks;
	}
	
	public void getStudentDetails() {
		
		System.out.println("RollNumber "+rollNumber);
		System.out.println("StudentName "+studentName);
		System.out.println("studentMarks"+aggrigateMarks);
		System.out.println("SkillSet"+skillSet);
		System.out.println("SetOfHobbies"+setofHobbies);
		
		System.out.println("Course Details");
		System.out.println("CourseId"+course.getCourseId());
		System.out.println("CourseName"+course.getCourseName());
		System.out.println("CourseCost"+course.getCourseCost());
		
	}

}

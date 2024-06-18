package com.Teacher.jdbc.TeacherPenExample;

import java.util.List;

public class Student {
	private String name;
	private int id;
	private List<String> marks;
	private List<Books> books;
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getMarks() {
		return marks;
	}
	public void setMarks(List<String> marks) {
		this.marks = marks;
	}

}

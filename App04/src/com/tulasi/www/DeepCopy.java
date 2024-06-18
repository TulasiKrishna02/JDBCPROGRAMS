package com.tulasi.www;

class Subject{
	private String name;
	public Subject(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Student implements Cloneable{
	private Subject subj;
	private String name;
	public Student(String s,String sub) {
		name=s;
		subj=new Subject(sub);
	}
	public Subject getSubj() {
		return subj;
	}
	public void setSubj(Subject subj) {
		this.subj = subj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object clone() {
		Student s=new Student(name,subj.getName());
		return s;
		
	}
}

public class DeepCopy {
	public static void main(String args[]) {
		
		Student stud=new Student("john","Algebra");
		System.out.println("original object:"+stud.getName()+"--"+stud.getSubj().getName());
		
		Student clonedstud=(Student)stud.clone();
		System.out.println("cloned Object:"+clonedstud.getName()+"--"+clonedstud.getSubj().getName());
		stud.setName("Dan");
		stud.getSubj().setName("physics");
		
		System.out.println("original object after it is updated:"+stud.getName()+"---"+stud.getSubj().getName());
		System.out.println("cloned Object after updating original object:"+clonedstud.getName()+"--"+clonedstud.getSubj().getName());
		
	}

}

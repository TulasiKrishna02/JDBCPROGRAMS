package cloning;

class Subjectt {
	private String name;

	public Subjectt(String s) {
		name = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	
}

class Studentt implements Cloneable {
	// Contained object
	private Subjectt subj;
	private String name;
	
	public Studentt(String s, String sub) {
		name = s;
		subj = new Subjectt(sub);
	}
	public Subjectt getSubj() {
		return subj;
	}
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	
	public Object clone() {
		//Deep copy
		Studentt s = new Studentt(name, subj.getName());
		return s;
	  }

}

public class DeepCopy {

	public static void main(String[] args) {
		// Original Object
		Studentt stud = new Studentt("John", "Algebra");

		System.out.println("Original Object: " + stud.getName() + " - " + stud.getSubj().getName());

		// Clone Object
		Studentt clonedStud = (Studentt) stud.clone();

		System.out.println("Cloned Object: " + clonedStud.getName() + " - " + clonedStud.getSubj().getName());

		stud.setName("Dan");
		stud.getSubj().setName("Physics");

		System.out.println("Original Object after it is updated: " + stud.getName() + " - " + stud.getSubj().getName());

		System.out.println("Cloned Object after updating original object: "  + clonedStud.getName() + " - " + clonedStud.getSubj().getName());

	}
}

//http://www.jusfortechies.com/java/core-java/deepcopy_and_shallowcopy.php


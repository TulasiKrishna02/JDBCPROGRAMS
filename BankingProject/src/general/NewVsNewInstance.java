package general;

public class NewVsNewInstance {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("Insatance is created for class "+ o.getClass().getName());

	}

}

class Student{
	
}

class Employee{
	
}

// Run this from command line
// with new Instance we can't create a object dynamically
//https://www.youtube.com/watch?v=GuBzhgYFrP0
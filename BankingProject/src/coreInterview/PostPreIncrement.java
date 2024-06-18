package coreInterview;

public class PostPreIncrement {

	public static void main(String[] args) {
		preIncrement();
		postIncrement();
	}

	private static void preIncrement() {
		int n=10;
		System.out.println("Pre");
		System.out.println(n);
		System.out.println(++n);
		System.out.println(n);		
	}
	
	private static void postIncrement() {
		int n=10;
		System.out.println("Post");
		System.out.println(n);
		System.out.println(n++);
		System.out.println(n);	
	}

	

}

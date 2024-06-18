package dataStructure.stackLinkedList;

public class StainMain {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.isEmpty());
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		System.out.println(stack.topEl());
		System.out.println(stack.isEmpty());
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
	}

}

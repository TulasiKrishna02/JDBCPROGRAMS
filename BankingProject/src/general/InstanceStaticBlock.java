package general;

class Parent {
	public Parent() {
		System.out.println("Parent Cons");
	}
	static {
		System.out.println("Parent satic");
	}
	{
		System.out.println("Parent normal");
	}
}
public class InstanceStaticBlock extends Parent{
	public InstanceStaticBlock() {
		System.out.println("Child Cons");
	}
	static {
		System.out.println("Child satic");
	}
	{
		System.out.println("Child normal");
	}
	public static void main(String[] args) {
		System.out.println("before main");
		InstanceStaticBlock t = new InstanceStaticBlock();
		InstanceStaticBlock t1 = new InstanceStaticBlock();
		System.out.println("after main");
		}
}

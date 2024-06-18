package general;

interface inter {
	public abstract void go();
	public static final String abc="initial";
}

abstract class abr implements inter {

	public abstract void goAbr();
}

abstract class abr1 extends abr {
	
	abstract void goAbr1();

}

public class InterfaceAbstract extends abr {

	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println(abc);
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goAbr() {
		// TODO Auto-generated method stub
		
	}


}
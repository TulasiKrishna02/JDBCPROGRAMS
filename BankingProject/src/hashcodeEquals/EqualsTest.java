package hashcodeEquals;

public class EqualsTest {
	public static void main(String[] args) {
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		Moof three= one;
		
		System.out.println(one == two);
		if (one.equals(two)) {
			System.out.println("one and two are equal");
		}
		
		System.out.println(one.equals(two)); // remove equals method and den try. Coz my default equals method 
											 //	use == to check the objects
		
		String abc= new String("hi");
		System.out.println("hi".equals(abc));
		
		//commment override equals methods and den try
		//http://theopentutorials.com/tutorials/java/strings/string-literal-pool/
	}
}

class Moof {
	private int moofValue;

	Moof(int val) {
		moofValue = val;
	}

	public int getMoofValue() {
		return moofValue;
	}

	/*public boolean equals(Object o) {
		if ((o instanceof Moof)
				&& (((Moof) o).getMoofValue() == this.moofValue)) {
			return true;
		} else {
			return false;
		}
	}*/
}
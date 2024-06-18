package hashcodeEquals;

final class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

	// Broken - violates symmetry!
	public boolean equals(Object o) {
		System.out.println("inside");
		if (o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		if (o instanceof String) // One-way interoperability!
			return s.equalsIgnoreCase((String) o);
		return false;
	}
}

public class EqualsViolates {

	public static void main(String[] args) {

		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String s = "polish";
		System.out.println(cis.equals(s));
		System.out.println(s.equals(cis));
	}

}

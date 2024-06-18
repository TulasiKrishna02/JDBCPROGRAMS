package singletonImmutable;

final class MyImmutableClass {
	// instance var are made private & final to restrict the access

	private final int count;
	private final double value;

	// Constructor where we can provide the constant value
	public MyImmutableClass(int paramCount, double paramValue) {
		count = paramCount;
		value = paramValue;
	}

	// provide only methods which return the instance var
	// & not change the values

	public int getCount() {
		return count;
	}

	public double getValue() {
		return value;
	}
}

// class TestImmutable
public class ImmutableClass {
	public static void main(String[] args) {
		MyImmutableClass obj1 = new MyImmutableClass(3, 5);

		System.out.println(obj1.getCount());
		System.out.println(obj1.getValue());

		// there is no way to change the values of count & value-
		// no method to call besides getXX, no subclassing, no public access to
		// var -> Immutable
	}
}
package singletonImmutable;

import java.util.Date;

public class ImmutableWithDate{
	public static void main(String[] args) {
		
		Date d = new Date();
		Sample t = new Sample(d);
		System.out.println(t.getDate());
		t.getDate().setTime(1000000); // try this same with simple immutable class implementation
		System.out.println(t.getDate());
	}
}

class Sample {

	private Date date; // Immutable Date Step 1 Make Private

	public Sample(Date date) {
		// Immutable Date Step 2 If Set through Constructor then get a
		// specialised (sub class) Date.
		this.date = getImmutableDate(date); // THIS METHOD RETURNS AN IMMUTABLE
											// DATE
	}

	public Sample() {
	} // Allow Default Constructor

	public Date getDate() {
		return date;
	}

	// Immutable Date Step 3- Allow setting of date only once!!
	public void setDate(Date date) {
		if (this.date == null) {
			this.date = getImmutableDate(date);
		}
	}

	/*
	 * Override all Setter methods of Date class. So even if user gets reference
	 * of Date Object it is not the original date object it would be a modified
	 * date object whose all setter methods do nothing
	 */
	private Date getImmutableDate(Date date) {
		/*
		 * This is an Anonymous Inner Class that extends java.util.Date class,
		 * it overrides all the setter methods making the date object IMMUTABLE(
		 * i.e setXXX has no effect)
		 */
		date = new Date(date.getTime()) {

			@Override
			public void setYear(int year) {
			}

			@Override
			public void setMonth(int month) {
			}

			@Override
			public void setDate(int date) {
			}

			@Override
			public void setHours(int hours) {
			}

			@Override
			public void setMinutes(int minutes) {
			}

			@Override
			public void setSeconds(int seconds) {
			}

			@Override
			public void setTime(long time) {
				System.out.println("I am coming from anonymous class :D ");
			}

		};
		return date;
	}
}

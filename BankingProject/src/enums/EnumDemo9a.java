package enums;

enum YY {
	KF, RC, RO;
}

public class EnumDemo9a {

	public static void main(String[] args) {
		
		YY.KF.equals(YY.RC);
		System.out.println(YY.KF == YY.RC);
		System.out.println(YY.KF.hashCode() > YY.RC.hashCode());
		System.out.println(YY.KF.ordinal() > YY.KF.ordinal());
	}
}

// What ever method we can call on normal object, same we can call from enum aslo

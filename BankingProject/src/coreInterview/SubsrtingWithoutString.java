package coreInterview;

public class SubsrtingWithoutString {

	public static void main(String[] args) {

		SubsrtingWithoutString t = new SubsrtingWithoutString();
		System.out.println(t.subString("Hello World", 0, 4));
		System.out.println(t.subString("Hello World", 2, 7));
		System.out.println(t.subString("Hello World", 0, 20));

		subString();

	}

	public String subString(String s, int start, int end) {
		if (start < 0 || end < 0 || start >= s.length() || end >= s.length())
			return null;
		StringBuffer sb = new StringBuffer();
		for (int i = start; i < end; i++) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	private static void subString() {
		String a = "SampleProgram";
		int end = 6;
		StringBuilder sub = new StringBuilder();
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (end == i)
				break;
			sub = sub.append(Character.toString(ch[i]));

		}
		System.out.println(sub);
	}

}

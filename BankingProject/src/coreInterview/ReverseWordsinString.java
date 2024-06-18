package coreInterview;

public class ReverseWordsinString {

	public static void main(String[] args) {
		
		String inputString = "Hello World how";
		int strLen = inputString.length() - 1;
		String reverse = "", tmp = "";

		for (int i = 0; i <= strLen; i++) {
			if(inputString.charAt(i) != ' '){				
				tmp += inputString.charAt(i);
			}
			if ((inputString.charAt(i) == ' ') || (i == strLen)) {
				for (int j = tmp.length() - 1; j >= 0; j--) {
					reverse += tmp.charAt(j);
					if ((j == 0) && (i != strLen))
						reverse += " ";
				}
				tmp = "";
			}
		}
		System.out.println(reverse);
	}

}

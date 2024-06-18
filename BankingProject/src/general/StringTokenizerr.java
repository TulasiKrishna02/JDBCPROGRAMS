package general;

import java.util.*;

public class StringTokenizerr {
	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("my name is khan", " ");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		     
		StringTokenizer st = new StringTokenizer("my,name,is,khan");
		// printing next token
		System.out.println("Next token is : " + st.nextToken(","));
	}
}
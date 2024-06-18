package coreInterview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCountWithLineNumber {

	public static void main(String[] args) {
		HashMap<String, Integer> hmLineNumber = new HashMap<String, Integer>();
		HashMap<String, Integer> hmOcurence = new HashMap<String, Integer>();
		BufferedReader br = null;

		try {

			String sCurrentLine;
			int i = 1;
			br = new BufferedReader(new FileReader("C:/new/testing.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				for (String lineWords : sCurrentLine.split(" ")) {
					if (hmOcurence.containsKey(lineWords)) {
						hmOcurence.put(lineWords, hmOcurence.get(lineWords) + 1);
					} else {
						hmOcurence.put(lineWords, 1);
					}
					hmLineNumber.put(lineWords + hmOcurence.get(lineWords), i);
				}
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Object key : hmOcurence.keySet()) {

			int repeat = hmOcurence.get(key);
			System.out.print(key + " ");
			for (int i = 1; i <= repeat; i++) {
				System.out.print(" " + hmLineNumber.get(key + "" + i));
			}
			System.out.println("");
		}

	}
}
/*The problem:

------------

INPUT is a text file.

* The file consists of a number of lines, separated by line breaks.

* Each line contains "words" made up of lower case alphabetical

 characters separated by white space.

* You can assume that the file is small enough to fit in working memory.

OUTPUT is a text file containing an index to the input:

* For each word w in the input, there is an entry of the form

 w num1 num2 ... <carriage_return>

 such that num1, num2,... are the line numbers in the input on which

 w occurs. If w occurs more than once on a given line, the line

 number should only occur once.

* The entries appear in alphabetical order.

For example, if the input is:

the quick brown fox jumps over

the lazy

lazy lazy

dog

then the output will be:

brown 1

dog 4

fox 1

jumps 1

lazy 2 3

over 1

quick 1

the 1 2*/
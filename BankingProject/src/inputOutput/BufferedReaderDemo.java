package inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("def.txt"));
		
		String s = null;
		while((s = br.readLine()) != null){
			
			System.out.println(s);
		}
	}

}

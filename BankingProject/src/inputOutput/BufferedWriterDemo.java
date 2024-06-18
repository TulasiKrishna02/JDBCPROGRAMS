package inputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("def.txt"));
		
		bw.write(100);
		bw.write("urga");
		bw.newLine();
		bw.write("Software Solutions");
		bw.newLine();
		char[] c = { 'a', 'b', 'c' };
		bw.write(c);
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
//total 3 write method
//1. int
//2. char[]
//3. String

// 1 extra newLine method
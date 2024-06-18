package inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		//FileWriter fw = new FileWriter("abc.txt",true); // this constructor with true will append in the file
		fw.write(100); // it will write corresponding char in file -> d 
		fw.write("urga\nSoftware Solutions");
		fw.write("\n");
		char[] c = { 'a', 'b', 'c' };
		fw.write(c);
		fw.write("\n");
		fw.write(98);
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}
// total 3 write method
// 1. int
// 2. char[]
// 3. String
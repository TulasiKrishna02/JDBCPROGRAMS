package inputOutput;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("print.txt");
		
		pw.write(100);
		pw.write("\n");
		pw.println(true);
		pw.print('D');
		pw.println('o');
		pw.println("your Work");
		pw.flush();
		pw.close();

	}

}
//
// DisAdvantages of FW and BW
// In FW we don't have new Line method
// In BW we have to pass everything as string(if we have to pass double , then we have to make it as string)
// due to this it will create lots of objs on heap
// newLine() method is also a kind of headache only to write for each new Line.

// Advantages of PW
// it has all the methods of FW
// it has two kinds of methods -> print and println(no need for new line explicitly)
// you can pass String,boolean,double,char etc everything 

//Another Adv is in Constructor we can either pass string/ File/ BW
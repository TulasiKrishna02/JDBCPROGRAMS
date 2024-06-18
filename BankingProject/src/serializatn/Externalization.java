package serializatn;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization {

	public static void main(String[] args) throws Exception{
		
		ExternalizationDemo ex = new ExternalizationDemo("rohit",10,20);
		System.out.println("before Ser, s: "+ ex.s + " i: "+ex.i + " j: " + ex.j);
		
		FileOutputStream fos = new FileOutputStream("out.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ex); 
		// above method internally invokes private void writeObject(ObjectOutputStream oos)
		oos.close();
		
		FileInputStream fis = new FileInputStream("out.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo exNew = (ExternalizationDemo) ois.readObject();
		// above method internally invokes private void readObject(ObjectInputStream ois)

		System.out.println("before Ser, s: "+ exNew.s + " i: "+exNew.i + " j: " + exNew.j);
	
	}

}


class ExternalizationDemo implements Externalizable {
	
	String s;
	int i;
	int j; // we are not serializing this property
	
	public ExternalizationDemo() {
		// it is mandatory to have
		System.out.println("default Constructor of ExternalizationDemo");
	}
	
	public ExternalizationDemo(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = in.readInt();
	}
	
}
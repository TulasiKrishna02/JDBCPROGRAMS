package serializatn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDog {
	public static void main(String[] args) {
		Collar c = new Collar(3);
		Dog d = new Dog(c, 5, "trans");
		System.out.println("before: collar size is " + d.getCollar().getCollarSize() + ", before: Dog size is "
				+ d.getDogSize() + ", before: transientVariable is " + d.getTransientVariable());
		
		
		try {
			FileOutputStream fs = new FileOutputStream("testSer.anyType");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("testSer.anyType");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("after: collar size is " + d.getCollar().getCollarSize() + ", before: Dog size is " + d.getDogSize());
		if (d.getTransientVariable() == null) {
			System.out.println("TransientVariable is NULL because we kept transientVariable as transient ");
		}
	}
}

class Dog implements Serializable {
	private Collar theCollar;
	private int dogSize;
	private transient String transientVariable;

	public Dog(Collar collar, int size, String variable) {
		theCollar = collar;
		dogSize = size;
		transientVariable = variable;
	}

	public Collar getCollar() {
		return theCollar;
	}

	public int getDogSize() {
		return dogSize;
	}

	public String getTransientVariable() {
		return transientVariable;
	}
}

class Collar implements Serializable {
	private int collarSize;

	public Collar(int size) {
		collarSize = size;
	}

	public int getCollarSize() {
		return collarSize;
	}
}
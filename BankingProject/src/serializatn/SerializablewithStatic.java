package serializatn;
import java.io.*;

public class SerializablewithStatic {
	public static void main(String[] args) {
		Doggg d1 = new Doggg(35, "Fido");
		Doggg d2 = new Doggg(35, "Moti");
		Doggg d3 = new Doggg(35, "Tommy");
		Doggg d4 = new Doggg(35, "Rocky");
		
		System.out.println("before: " + d1.name + " " + d1.weight + " " + d1.ORIGIN);
		System.out.println("before: " + d2.name + " " + d2.weight + " " + d1.ORIGIN);
		System.out.println("before: " + d3.name + " " + d3.weight + " " + d1.ORIGIN);
		System.out.println("before: " + d4.name + " " + d4.weight + " " + d1.ORIGIN);
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d1);
			os.writeObject(d2);
			Doggg.ORIGIN = "Ancesian";
			os.writeObject(d3);
			os.writeObject(d4);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d1 = (Doggg) ois.readObject();
			d2 = (Doggg) ois.readObject();
			d3 = (Doggg) ois.readObject();
			d4 = (Doggg) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after: " + d1.name + " " + d1.weight + " " + d1.ORIGIN);
		System.out.println("after: " + d2.name + " " + d2.weight + " " + d1.ORIGIN);
		System.out.println("after: " + d3.name + " " + d3.weight + " " + d1.ORIGIN);
		System.out.println("after: " + d4.name + " " + d4.weight + " " + d1.ORIGIN);
	}
}

class Doggg extends Animall implements Serializable {
	String name;
	static String ORIGIN = "Alifiston";

	Doggg() {
		
	}
	Doggg(int w, String n) {
		weight = w; // inherited
		name = n; // not inherited
	}
}

class Animall { // not serializable !
	int weight = 42;
}
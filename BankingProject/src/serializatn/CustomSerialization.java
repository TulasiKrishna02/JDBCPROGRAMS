package serializatn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerialization {

	public static void main(String[] args) throws Exception{
		
		Account acc = new Account();
		System.out.println("before Ser, username: "+ acc.userName + " password: "+acc.password + " pin: " + acc.pin);
		
		FileOutputStream fos = new FileOutputStream("out.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc); 
		// above method internally invokes private void writeObject(ObjectOutputStream oos)
		oos.close();
		
		FileInputStream fis = new FileInputStream("out.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account accNew = (Account) ois.readObject();
		// above method internally invokes private void readObject(ObjectInputStream ois)

		System.out.println("After Ser, username: "+ accNew.userName + " password: "+accNew.password + " pin: " + accNew.pin);
	}

}

class Account implements Serializable{

	String userName = "rohit";
	transient String password = "test";
	transient int pin = 2222;

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		//above method will write first default state of object
		String epassword = "123" + password;
		oos.writeObject(epassword);
		int epin = 1111 + pin;
		oos.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		String epassword = (String) ois.readObject();
		password = epassword.substring(3);
		int epin = ois.readInt();
		pin = epin - 1111;
	}
}
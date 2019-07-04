package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializationExampleAccount s1 = new SerializationExampleAccount("vaibhav",1000,"75517888");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customerNew.ser"));
		
		oos.writeObject(s1);
		
		readCustomerObject();
	}

	private static void readCustomerObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customerNew.ser"));
		
		SerializationExampleAccount sea = (SerializationExampleAccount) ois.readObject();
		
		System.out.println(sea);
	}

}

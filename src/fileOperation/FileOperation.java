package fileOperation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOperation {

	public static void main(String[] args) {
		try {
			RandomAccessFile RandomAccessFile = new RandomAccessFile("VaibhavFile.txt","rw");
			//RandomAccessFile.seek(5);//This will add
			RandomAccessFile.write("Data".getBytes());
			RandomAccessFile.close();
			System.out.println("Data has been writed succesfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

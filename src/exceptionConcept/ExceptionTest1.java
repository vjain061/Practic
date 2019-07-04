package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("D:\\testout.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		
	}

}

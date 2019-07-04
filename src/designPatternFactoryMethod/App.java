package designPatternFactoryMethod;

public class App {

	public static void main(String[] args) {
		new FileProcessing().processFile("somefile");
		System.out.println("Done");
	}

}

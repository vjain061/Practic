package designPatternFactoryMethod;

public class FileProcessing {

	public void processFile(String file) {
		System.out.println("processing text file");
		TextProcessor textProcessor = new TextProcessor();
		textProcessor.process(file);
	}
}

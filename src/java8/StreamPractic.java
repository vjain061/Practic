package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamPractic {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("first");
		stringList.add("second");
		stringList.add("third");
		stringList.add("forth");
		stringList.add("fifth");
		
		stringList.stream().filter(i->i.contains("s")).forEach(System.out::println);
	}

}

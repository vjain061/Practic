package dataStructure;

import java.util.LinkedList;
import java.util.List;

public class ReverceLinkedList {
	public static void main(String[] args) {
		List<String> stringList = new LinkedList<>();
		stringList.add("first");
		stringList.add("second");
		stringList.add("third");
		stringList.add("forth");
		stringList.add("fifth");
		
		System.out.println(stringList);
		System.out.println(reverseLinkedList(stringList));
	}

	private static List<String> reverseLinkedList(List<String> stringList) {
		List<String> resultStringList = new LinkedList<>();
		Object[] arrayOfStringLinkedList = stringList.toArray();
		for(int i=arrayOfStringLinkedList.length-1;i>=0;i--)
			resultStringList.add(arrayOfStringLinkedList[i].toString());
		return resultStringList;
	}
	
	
}

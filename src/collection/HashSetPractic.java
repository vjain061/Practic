package collectionPractic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSetPractic {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("first");
		h.add("second");
		h.add("third");
		h.add("forth");
		
		System.out.println(h);
		
		List<String> l = new LinkedList<>();
		l.add("first");
		l.add("second");
		l.add("third");
		l.add("forth");
		
		Iterator<String> i = h.iterator();
		
	}

}

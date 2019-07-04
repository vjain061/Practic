package cognamPragrams;

import java.util.TreeSet;

public class Sample {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Geeks");
		treeSet.add("for");
		treeSet.add("Geeks");
		treeSet.add("GeeksforGeeks");

		for (String temp : treeSet)
			System.out.printf(temp + " ");

		System.out.println("\n");
	}
}

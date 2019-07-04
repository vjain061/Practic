package collectionPractic;

import java.util.TreeSet;

public class TreeSetPractic {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(30);
		treeSet.add(20);
		
		System.out.println(treeSet);
		
		TreeSet<House> treeSetStudent = new TreeSet<>();
		treeSetStudent.add(new House(101,"vaibhav"));
		treeSetStudent.add(new House(101,"rahul"));
		treeSetStudent.add(new House(101,"piyush"));
		treeSetStudent.add(new House(101,"harshit"));
		
		System.out.println(treeSetStudent);
	}

}

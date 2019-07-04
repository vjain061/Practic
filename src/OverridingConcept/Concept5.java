package OverridingConcept;

public class Concept5 {
	public static void main(String[] args) {
		ChildConcept5 child = new ChildConcept5();
		child.m1();
	}
}


class ParentConcept5 {
	public Object m1() {
		System.out.println("ParentConcept5 method");
		return null;
	}
}
class ChildConcept5 extends ParentConcept5 {
	public String m1() {
		System.out.println("ChildConcept5 method");
		return "";
	}
}
package polymorphism;

public class OverridingRule1 {

	public static void main(String[] args) {
		Child1 c = new Child1();
		Parent1 p = new Parent1();
		
		c.m1();
		//p.m1();
		
	}

}

class Parent1{
	private void m1(){
		System.out.println("Parent");
	}
}

class Child1 extends Parent1{
	public void m1(){
		System.out.println("Parent");
	}
}

package others;


class Parent{
	{
		System.out.println("Non-static block of Parent");
	}
	static int x = 10;
	static{
		System.out.println("Static block of Parent");
		System.out.println(x);
	}
	
	public Parent() {
		System.out.println("Constructor block of Parent");
	}
	
	public Parent(int x) {
		System.out.println("Parameterized constructor block of Parent");
	}
	
}


public class StaticNonStaticInstanceBlockConstructorConcept extends Parent{

	{
		System.out.println("Non-static block of Child");
	}
	
	static{
		System.out.println("Static block of Child");
	}
	
	public StaticNonStaticInstanceBlockConstructorConcept() {
		super(10);
		System.out.println("Constructor block of child");
	}
	
	public static void main(String[] args) {
		StaticNonStaticInstanceBlockConstructorConcept s = new StaticNonStaticInstanceBlockConstructorConcept();
		System.out.println("Main method");
	}

}

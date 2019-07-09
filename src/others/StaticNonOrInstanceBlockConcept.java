package others;


class Parent{
	static{
		System.out.println("Static block of Parent");
	}
	{
		System.out.println("Non-Static block of Parent");
	}
	public Parent(){
		System.out.println("Constructor block of Parent");
		Void v = null;
	}
	
	
}


public class StaticNonOrInstanceBlockConcept extends Parent{

	static{
		System.out.println("Static block of Child");
	}
	{
		System.out.println("Non-Static block of Child");
	}
	public StaticNonOrInstanceBlockConcept(){
		System.out.println("Constructor block of Child");
	}
	
	public static void main(String[] args) {

	}

}

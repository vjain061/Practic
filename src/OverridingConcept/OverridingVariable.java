package OverridingConcept;

class ParentOverridingVariable{
	int x = 10;
}

public class OverridingVariable extends ParentOverridingVariable{
	static int x = 20;
	public static void main(String[] args) {
		//new OverridingVariable().display(); //case-1
		
		//new ParentOverridingVariable.display(); //case-2
		
		ParentOverridingVariable p = new OverridingVariable();
		System.out.println(p.x);
		
		System.out.println(x);
	}
	
	public void display(){
		System.out.println(x);
	}
}

package collection;

import java.util.LinkedList;
import java.util.List;

class PrentOfVaibhav{
	public void normalMethod(){
		System.out.println("normalMethod of PrentOfVaibhav class");
	}
	
	private static void staticMethodOfParentOfVaibhav(){
		System.out.println("staticMethodOfParentOfVaibhav of PrentOfVaibhav class");
	}
	List<String> listOfString = new LinkedList<>();
}
public class Vaibhav extends PrentOfVaibhav {
	public void normalMethod(){
		System.out.println("normalMethod of Vaibhav class");
	}
	
	private static void staticMethodOfParentOfVaibhav(){
		System.out.println("staticMethodOfParentOfVaibhav of Vaibhav class");
	}
	public static void main(String[] args) {
		PrentOfVaibhav prentOfVaibhav = new Vaibhav();
		prentOfVaibhav.normalMethod();
		staticMethodOfParentOfVaibhav();
	}

}

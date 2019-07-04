package OverridingConcept;

public class Concept3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot bird=new Parrot();
       // bird.fly();
	}

}

class Bird{
    private  void fly(){
       System.out.println("Bird is flying");
   }
}
class Parrot extends Bird{
   public void doStuff(){
       System.out.println("I am parrot , and I am doing stuff");
   }
}

package objectClassMethod;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		final Map<String,String> m = new HashMap<>();
		
		HashSet<String> s = new HashSet<>();
		
		m.put("1", "1");
		m.put("2", "2");
		m.put("3", "3");
		m.put("4", "4");
		m.put("5", "5");
		System.out.println(m);
		
		System.out.println(m.values());
		
		System.out.println(LocalTime.now());
		
		
		
		Test t = new Test();
		t.x = 10;
		t.y = 20;
		
		System.out.println("t.x : "+t.x);
		System.out.println("t.y : "+t.y);
		System.out.println("t.test1.p : "+t.test1.p);
		
		Test testClone = (Test) t.clone();
		testClone.test1.p = 100;
		
		System.out.println("testClone.x : "+testClone.x);
		System.out.println("testClone.y : "+testClone.y);
		System.out.println("testClone.test1.p : "+testClone.test1.p);
		
		System.out.println("t.x : "+t.x);
		System.out.println("t.y : "+t.y);
		System.out.println("t.test1.p : "+t.test1.p);
	}
}

class Test implements Cloneable{
	int x;
	int y;
	Test1 test1 = new Test1();
	
	public Test() {
		test1.p = 30;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();    //If you uncomment this line then it will be shallow copy line (37) 
		
		Test objTest = new Test(); // and this is the example of deep copy line (39-43)
		objTest.x = this.x;
		objTest.y = this.y;
		
		objTest.test1.p = this.test1.p;
		
		return super.clone();
		
	}
	
}

class Test1{
	int p;
}

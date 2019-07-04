package OverridingConcept;

public class Basic extends MySuper {final static short i = 2;
public static int j = 0;

public static void main(String [] args) 
{
    for (int k = 0; k < 3; k++) 
    {
        switch (k) 
        {
            case i: System.out.print(" 0 ");
            case i-1: System.out.print(" 1 ");
            case i-2: System.out.print(" 2 ");
        }
    }
}}

class MySuper {
	String str1 = "x";
	{
		System.out.println("Non-static block!!!");//Non static it means it is written into the top of the(From first line) constructor block........
	}
	static {
		System.out.println("static block!!!");
	}

	public MySuper() {
		myMethod();
	}

	void myMethod() {
		System.out.print(str1);
	}
}

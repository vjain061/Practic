package threadPractic;

public class TrickyProgram2 implements Runnable{
		private int x=0; 
		private int y=0; 
		public static void main(String [] args)
		{
			TrickyProgram2 obj = new TrickyProgram2();
			(new Thread(obj)).start(); /*Line 8*/
			(new Thread(obj)).start(); /*Line 8*/
		}
		public synchronized void run () /*Line 11*/
		{
			for (int i=0;i<10;i++) /*Line 13*/
			{
			  x++;
			  y++;
			 System.out.println("x = " + x +" ; y = "+y);
			}
		}
	}

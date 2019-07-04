package threadPractic;

public class TrickyProgram3 extends Thread {
	public static void main(String[] args) {
		TrickyProgram3 t = new TrickyProgram3(); /* Line 5 */
		System.out.println("Calling run method ");
		t.start(); /* Line 6 */
	}

	public void run() {
		for (int i = 1; i < 3; ++i) {
			System.out.print(i + "..");
		}
	}
}

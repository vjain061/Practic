package other;

class Super {
	public Integer getLength() {
		return new Integer(4);
	}
}

public class Practic extends Super {
	public Long getLength() {
		return new Long(5);
	}

	public static void main(String[] args) {
		Super sooper = new Super();
		Practic sub = new Practic();
		System.out.println(sooper.getLength().toString() + ", " + sub.getLength().toString());
	}
}

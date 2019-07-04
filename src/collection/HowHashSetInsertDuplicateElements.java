package collection;

import java.util.HashSet;

public class HowHashSetInsertDuplicateElements {

	public static void main(String[] args) {
		HashSet<Animal> s = new HashSet<>();
		s.add(new Animal());
		s.add(new Animal());
		
		for(Animal a : s) {
			System.out.println(a);
		}
	}

}

class Animal{
	int i = 10;
	
	public Animal() {
		i = 30;
	}

	@Override
	public String toString() {
		return "Animal"+i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	
	
	
}

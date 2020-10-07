package others;

import java.util.HashMap;
import java.util.Map;

public class EmployeeAsKeyExample {

	public static void main(String[] args) {
		Map<Employee,String> mapEmployee = new HashMap<>();
		
		Employee emp1 = new Employee(1,"sudhir");
		Employee emp2 = new Employee(2,"vaibhav");
		
		mapEmployee.put(emp1, "sudhir");
		mapEmployee.put(emp2, "vaibhav");
		
		
		Employee emp3 = new Employee(2,"vaibhavNew");
		
		System.out.println(mapEmployee.get(emp3));
		
	}

}

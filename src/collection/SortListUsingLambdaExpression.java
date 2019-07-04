package collectionPractic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortListUsingLambdaExpression {

	public static void main(String[] args) {
		List<StudentObjectForSortListUsingLambdaExpressionClass> listOfStudent = new ArrayList<>();
		
		listOfStudent.add(new StudentObjectForSortListUsingLambdaExpressionClass(101,"Vaibhav"));
		listOfStudent.add(new StudentObjectForSortListUsingLambdaExpressionClass(102,"Rahul"));
		listOfStudent.add(new StudentObjectForSortListUsingLambdaExpressionClass(103,"Piyush"));
		listOfStudent.add(new StudentObjectForSortListUsingLambdaExpressionClass(104,"Yogesh"));
		listOfStudent.add(new StudentObjectForSortListUsingLambdaExpressionClass(105,"Harshit"));
		listOfStudent.add(new StudentObjectForSortListUsingLambdaExpressionClass(106,"Yogesh"));
		
		System.out.println(listOfStudent);
		
		Collections.sort(listOfStudent);
		
		System.out.println(listOfStudent);
		
	}

}

package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//Declare a List
		List<String> learners=new ArrayList<String>();
		
		//Empty List    
		System.out.println("The List is: "+learners);
		
		//add an element   - add
		learners.add("Rajesh");
		System.out.println("The List is: "+learners);
		
		//add more elements
		learners.add("Bharath");
		learners.add("Venkatesh");
		System.out.println("The List is: "+learners);
		
		//add duplicate values
		learners.add("Bharath");
		System.out.println("The List is: "+learners);
		
		
		//To retrieve a particular value - get
		String elementAtIndex1 = learners.get(3);
		System.out.println("elementAtIndex1 is: "+elementAtIndex1);
		
		//remove - remove an element from the List
		learners.remove(1);
		System.out.println("The List is : "+learners);
		
		//addAll - add all the element from one List to Another List
		List<String> employees=new ArrayList<String>();
		System.out.println("The Employee List : "+employees);
		employees.addAll(learners);
		System.out.println("The Current employee List is: "+employees);
		
		//Size of List
		int sizeOfList = employees.size();
		System.out.println("The size is: "+sizeOfList);
		
	}

}

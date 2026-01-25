package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Declare Set
		
		//HashSet
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();

		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		
		
		//add an element
		mentors.add("Vinoth");
		mentors.add("Anburaj");
		mentors.add("Harrish");
		mentors.add("Seenivasan");
		mentors.add("Arun ashwin");
		System.out.println("The set is: "+mentors);
		
		//Retrieve a particular value
		//Convert the Set into List
		
		//Declaring a empty List
		List<String> trainers=new ArrayList<String>(mentors);
		System.out.println("The List is : "+trainers);
		String elementAt0= trainers.get(0);
		System.out.println("elementAt0 is: "+elementAt0);

	}

}

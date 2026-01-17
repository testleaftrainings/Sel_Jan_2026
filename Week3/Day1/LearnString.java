package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		String str1="TestLeaf";
		String str3="TestLeaf";    
		
		//String Instantiation
		String str2=new String("TestLeaf");
		String str4=new String("TestLeaf");
		
		//==   compares the reference address of two Strings
		//.equals     compares the values of the two Strings
		
		System.out.println(str1==str3);   
		System.out.println(str1==str2);
		System.out.println(str2==str4);
		System.out.println(str1.equals(str4));
		
		System.out.println("--------------------------------");
		//                01234567
		String batchName="Selenium";
		
		//.equals   equalIgnore
		System.out.println(batchName.equals("Selenium"));
		System.out.println(batchName.equalsIgnoreCase("selenium"));
		
		//.equals and contains
		System.out.println(batchName.contains("sele"));
		
		//length of the String or number of Characters
		int lengthOfString = batchName.length();
		System.out.println("The length is: "+lengthOfString);
		
		String batch="Sel Jan";
		//Convert the String into uppercase
		//input="Sel Jan"    output="SEL JAN"
		String upperCase = batch.toUpperCase();
		System.out.println(upperCase);
		
		//Convert to lower
		//input="Sel Jan"    output="sel jan"
		//              01234567
		String batName="SelJan26";
		
		//To retrieve a single character -index
		//charAt
		char charAt2 = batName.charAt(1);
		System.out.println(charAt2);
		
		//toCharArray
		//To convert a String into a Character Array
		//               0   1   2   3   4   5   6   7
		//SeleJan26   ={'S','e','l','J','a','n','2','6'}
		
		char[] charArray = batName.toCharArray();
		System.out.println(charArray[3]);
		
		//split
		//Convert 1 String into multiple Strings
		String name="OpenAI Jan 2026";
		String[] split = name.split("a");
		System.out.println(split[0]);
		      
		// subString
		// Convert the String into its much shorter format
		//                  01234567
		String nameOfBatch="TestLeaf";
		String substring = nameOfBatch.substring(3);
		System.out.println(substring);
		
		String substring2 = nameOfBatch.substring(2, 4);
		System.out.println(substring2);
		
		
		int amount1=1000;
		String amount2="200Rupees";
		System.out.println(amount1+amount2);  
		
		//Remove the Rupees from the String
		String replacedAmount = amount2.replaceAll("[a-zA-Z]", "");
		System.out.println(replacedAmount);       
		System.out.println(replacedAmount+amount1); 
		
		
		//int -Integer
		int convertedAmount = Integer.parseInt(replacedAmount);
		System.out.println(amount1+convertedAmount); 
		}
}

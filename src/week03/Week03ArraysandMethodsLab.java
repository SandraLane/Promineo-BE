package week03;
import java.util.Scanner;

public class Week03ArraysandMethodsLab {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			int[] myArray = new int[6];
			myArray[0] = 1;
			myArray[1] = 5;
			myArray[2] = 2;
			myArray[3] = 8;
			myArray[4] = 13;
			myArray[5] = 6;
	//	int[] myArray = {1,5,2,8,13,6};
//		
//		// 2. Print out the first element in the array
//			System.out.println(myArray[0]);
//		
//		// 3. Print out the last element in the array without using the number 5
//			System.out.println(myArray[myArray.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?

			//System.out.println(myArray[6]);
		// 5. Print out the element in the array at position -1, what happens?

			//System.out.println(myArray[-1]);
		// 6. Write a traditional for loop that prints out each element in the array
			for(int i =0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
			}
			//}
			
		// 7. Write an enhanced for loop that prints out each element in the array
			for(int number : myArray) {
				System.out.println(number);
			}
			//}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			int sum = 0;
			for (int number : myArray) {
				sum+= number;
			
	}
			System.out.println(sum);
					
		// 9. Create a new variable called average and assign the average value of the array to it
			double average = sum/(myArray.length);
			
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			for(int i: myArray) {
				if(i%2!=0) {
					System.out.println(i);}
			}
	

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String[] names = new String[4];
			names[0] = "Sam";
			names[1] = "Sally";
			names[2] = "Thomas";
			names[3] = "Robert";
		
		// 12. Calculate the sum of all the letters in the new array
			//int sum = 0;
			//for(String name:names) {
			//	sum+= name.length();
				
			//}
		
			//System.out.println(sum);
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			//String name = "Sandy";
		//	greetPerson(name);
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		
		//	System.out.println(greetingsName(name));
	//}
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		//System.out.println(compareTwo(str, num)); 
			
		//}
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		//compareTwo("Hello", 6);
			System.out.println(doesArrayContainString(names,"Hello"));
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		
			// TODO Auto-generated method stub
			System.out.println(getSmallestNumber(myArray));
		
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
			double[] numbers = {45.7,30.2,67.3};
			System.out.println(getAverage(numbers));
	
		
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
			int[] nameLengths = getLengthOfString(names);
			for(int number: nameLengths) {
			 System.out.println(number);}
	//

		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
			System.out.println();
				System.out.println(isEvenBiggerThanOdd(names));}
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

	
		
	

	
	
	
	

//	private static int len(Object string) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private static int myArray(int i) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private static Object i(int i, int j) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//}
	

	
	// Method 13:
private static void greetPerson(String name) {
	// TODO Auto-generated method stub
	System.out.println("Hello and welcome " + name);}


	// Method 14:
private static Object greetingsName(String name) {
	String greeting = "Welcome to the class!" + name;
		return greeting;}
	
	
	// Method 15:

private static boolean compareTwo(String str, int num) {
	return str.length() <num;
}
	


	
	// Method 16:

	private static boolean doesArrayContainString(String[] array, String string) {
		for(String str: array) {
			if(str.equals(string)) {
				return true;
			}
		} 
		return false;
	}



	// Method 17:

	private static int getSmallestNumber(int[] numbers ) {
		int smallest = numbers[0];
		for (int number:numbers) {
			if(number<smallest) {
				smallest = number;
			}
		}
		return smallest;
	}

	// Method 18:
	private static double getAverage(double[] numbers) {
		double sum = 0;
		for(double number: numbers) {
			sum+=number;
		}
		return sum/numbers.length;
	}


	
	// Method 19:

//	public static int[] getLengthOfString(String[] strings) {
	//	int[] = new int[strings.length];
	//	for(int i=0; i<strings.length; i++) {
			results[i] = strings[i].length();
	//	}
		return results;
//	}





	
	// Method 20:
	public static boolean isEvenBiggerThanOdd(String[] strings) {
		int evenLetters = 0;
		int oddLetters = 0;
		for(String string: strings) {
			if(string.length()%2==0) {
				evenLetters+= string.length();
			}else {
			oddLetters += string.length();
		}
			
		}
		return evenLetters > oddLetters;
	}


	
// Method 21:
	

public static boolean isPalindrone(String string) {
	if(string.charAt(0)==string.charAt(string.length()-1)) {
		for(int i=0; i<string.length()/2;i++) {
			return false;
		}
		return true;
	}
}
}
}

	
	



	



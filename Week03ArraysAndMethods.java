package week03;

import java.util.Scanner;

public class Week03ArraysAndMethods {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 1.	1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
						a.	Programmatically subtract the value of the first element in the array from the value in the
						 	last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
						b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
						c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		 */
		System.out.println("------------------------------Part 1-------------------------------");
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.print("These are the ages in your array: ");
		for(int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		
		//a) printing out the result of subtracting the first element of ages from the last element of ages
		System.out.print("\nThe result of subtracting the first element of ages from the last element of ages is: ");
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		//b) creating a new array with a new age and repeating step a)
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 57};
		
		System.out.print("These are the ages in your new array: ");
		for(int i = 0; i < newAges.length; i++) {
			System.out.print(newAges[i] + " ");
		}
		
		System.out.print("\nThe result of subtracting the first element of ages from the last element of ages is: ");
		System.out.println(newAges[newAges.length - 1] - newAges[0]);
		
		//c) iterating through newAges to calculate the average age and printing the average to the console
		int averageAge = 0;
		for(int i = 0; i < newAges.length; i ++) {
			averageAge += newAges[i];
		}
		
		averageAge /= (newAges.length + 1);
		System.out.print("the average of the ages in your array is: " + averageAge);
		
		/*
		 * 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
						a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
							Print the result to the console.
						b.	Use a loop to iterate through the array again and concatenate all the names together, separated 
							by spaces, and print the result to the console.

		 */
		System.out.println("\n------------------------------Part 2-------------------------------");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a) Iterating through array to calculate the average number of letters per name
		int averageLetters = 0;
		for(int i = 0; i < names.length; i++) {
			averageLetters += names[i].length();
		}
		
		averageLetters /= (names.length + 1);
		System.out.println(averageLetters);
		
		//b) Creating a new String that contains all the names in the array and printing it out to the console
		String allNames = "";
		for(int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		
		System.out.println(allNames);
		
		/*
		 * 3.	How do you access the last element of any array?
		 */
		// <arrayIdentifier>[<arrayIdentifier>.length - 1];
		System.out.println("------------------------------Part 3-------------------------------");
		System.out.println("The last element in the names array is: " + names[names.length - 1]);
		
		/*
		 * 4.	How do you access the first element of any array?
		 */
		// <arrayIdentifier>[0];
		System.out.println("------------------------------Part 4-------------------------------");
		System.out.println("The first element in the names array is: " + names[0]);
		
		/*
		 * 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
		 * 		and add the length of each name to the nameLengths array.
		 */
		int[] nameLengths = new int[6];
		
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		/*
		 * 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		 */
		System.out.println("------------------------------Part 6-------------------------------");
		int sumOfLengths = 0;
		
		for(int length : nameLengths) {
			sumOfLengths += length;
		}
		
		System.out.println("The sum of all the lengths of the names in the names array is: " + sumOfLengths);
		
		/*
		 * 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		 * 		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
		System.out.println("------------------------------Part 7-------------------------------");
		String userWord = "";
		int repeat = 0;
		System.out.print("Please give a word you want to repeat: ");
		userWord = sc.next();
		
		System.out.print("How many times do you want the word to repeat: ");
		repeat = sc.nextInt();
		
		System.out.println("Here is your word repeated " + repeat + " times: " + repeatWord(userWord, repeat));
		
		/*
		 * 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
		 * 		(the full name should be the first and the last name as a String separated by a space).
		 */
		System.out.println("------------------------------Part 8-------------------------------");
		System.out.print("Please enter a first name: ");
		String userFirstName = sc.next();
		
		System.out.print("Please enter a last name: " );
		String userLastName = sc.next();
		
		System.out.println("Your full name is: " + createFullName(userFirstName, userLastName));
		
		
		/*
		 * 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 */
		System.out.println("------------------------------Part 9-------------------------------");
		int[] numArray1 = {1, 5, 10, 15, 20};
		int[] numArray2 = {26, 27, 28, 29, 30};
		
		System.out.print("array1: ");
		for(int i = 0; i < numArray1.length; i ++) {
			System.out.print(numArray1[i] + " ");
		}
		
		System.out.print("\narray2: ");
		for(int i = 0; i < numArray2.length; i++) {
			System.out.print(numArray2[i] + " ");
		}
		
		System.out.println("\nIs the sum of the numbers in array1 greater than 100: " + isGreaterThanHundred(numArray1));
		System.out.println("Is the sum of the numbers in array2 greater than 100: " + isGreaterThanHundred(numArray2));
		
		
		/*
		 * 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		 */
		System.out.println("------------------------------Part 10-------------------------------");
		double[] dblNumArray1 = {5.25, 10.75, 3.50, 8.75, 55.25};
		double[] dblNumArray2 = {1.25, 1.25, 1.25, 1.25, 1.25};
		
		System.out.print("array: ");
		for(int i = 0; i < dblNumArray1.length; i ++) {
			System.out.print(dblNumArray1[i] + " ");
		}
		
		System.out.println("\nThe average of the numbers in your array is: " + arrayAverage(dblNumArray1));
		
		/*
		 * 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
		 * 		is greater than the average of the elements in the second array.
		 */
		System.out.println("------------------------------Part 11-------------------------------");
		System.out.print("array1: ");
		for(int i = 0; i < dblNumArray1.length; i ++) {
			System.out.print(dblNumArray1[i] + " ");
		}
		
		System.out.print("\narray2: ");
		for(int i = 0; i < dblNumArray2.length; i++) {
			System.out.print(dblNumArray2[i] + " ");
		}
		
		System.out.println("\nIs the average for array1 greater than array2: " + compareArrayAverage(dblNumArray1, dblNumArray2));
		System.out.println("Is the average for array2 greater than array2: " + compareArrayAverage(dblNumArray2, dblNumArray1));
		

		/*
		 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		 * 		and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
		System.out.println("------------------------------Part 12-------------------------------");
		boolean isHotOutside = true;
		double moneyInPocket = 9.75;
		
		System.out.print("Is it hot outside: " + isHotOutside);
		System.out.print("\nHow much money do you have in your wallet: " + moneyInPocket);
		System.out.print("\nWill you buy a drink: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		moneyInPocket = 12.75;
		
		System.out.print("\nIs it hot outside: " + isHotOutside);
		System.out.print("\nHow much money do you have in your wallet: " + moneyInPocket);
		System.out.print("\nWill you buy a drink: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		/*
		 * 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 */
		System.out.println("\n------------------------------Part 13-------------------------------");
		System.out.print("Please give a number that you would like to recieve all of the numbers divisible by from 1-100: ");
		int divisbleNum = sc.nextInt();
		int[] nums100 = new int[100];
		
		for(int i = 0; i < nums100.length; i++) {
			nums100[i] = i + 1;
		}
		
		System.out.println("The numbers divisible by " + divisbleNum + " from 1-100 are: " + divisibleNumbers(divisbleNum, nums100));
		
	}
	
	/*
	 * 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	 * 		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */
	public static String repeatWord(String word, int n) {
		String newWord = "";
		
		for(int i = 0; i < n; i++) {
			newWord += word;
		}
		
		return newWord;
	}
	
	/*
	 * 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
	 * 		(the full name should be the first and the last name as a String separated by a space).
	 */
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	/*
	 * 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 */
	public static boolean isGreaterThanHundred(int[] nums) {
		int sum = 0;
		
		for(int num: nums) {
			sum += num;
		}
		
		if(sum > 100) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	 */
	public static double arrayAverage(double[] nums) {
		double sum = 0;
		
		for(double num: nums) {
			sum += num;
		}
		
		return sum / nums.length;
	}

	
	/*
	 * 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
	 * 		is greater than the average of the elements in the second array.
	 */
	public static boolean compareArrayAverage(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		
		for(int j = 0; j < array2.length; j++) {
			sum2 += array2[j];
		}
		
		return (sum1/array1.length) > (sum2/array2.length);
	}
	
	/*
	 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	 * 		and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}	
	}
	
	/*
	 * 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	 */
	//Creating a method that takes an int divisibleNum, and an array that contains the numbers 1-100
	//and will return a String with all the numbers that are divisible by divisibleNum from 1-100.
	//This will server as additional practice with methods, user input, and iterating through an array.
	public static String divisibleNumbers(int divisibleNum, int[] nums100) {
		String nums = "";
		
		for(int i = 0; i < nums100.length; i++) {
			if(nums100[i] % divisibleNum == 0) {
				nums += nums100[i] + " ";
			}
		}
		
		return nums;
	}
}

package dataStrucutreHW2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
//		Write a program to sum all the values of a given Array in Java.	  
		
		int sum = 0;
		int[] sumArray = {2, 12, 42, 69, 113};
		// : for each in array
		for (int i : sumArray) {
			sum += i; 
		}
		
		System.out.println("Sum = " + sum);
		
//		What is the output?
		
		double[] exampleArray = {1,5,6,5,4,1};
		
		double max = exampleArray[0];
		
		int index = 0;
		
		for (int i = 1; i < exampleArray.length; i++){
			
			if (exampleArray[i] > max) {
				max = exampleArray[i];
				index = i;
           }

      }
		String string1 = exampleArray.toString();
		System.out.println(string1);
		System.out.println(index);
		
//		Write a public static method called "toPower" that takes in as parameters two 
//			integers called size and power. The method should return an array of size 
//			"size" with each array index raised to the value of "power." 
//		So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," 
//			the method should return the following result: [0,1,4,9].
	}
}

		          


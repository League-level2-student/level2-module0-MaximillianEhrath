package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Sarah", "Joe","Ali", "Jose", "Maxi"};
		int[] ages = {12, 15, 9, 5, 15};
		int smallestNumber = 0;
		int biggestNumber = 0;
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = names[4];
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		Random random = new Random();
		for(int i = 0; i < fifty.length; i++){
			fifty[i] = random.nextInt();
			//fifty[i] = i;
		}
		System.out.println(Arrays.toString(fifty));
		//7. use a for loop to make every value of the integer array a random number
		smallestNumber = fifty[0];
		for(int i = 0; i < fifty.length; i++){
//			System.out.println(fifty[i]);
			if(fifty[i] < smallestNumber){
				smallestNumber = fifty[i];
			}
		}
		System.out.println(smallestNumber);



		biggestNumber = fifty[0];
		for(int i = 0; i < fifty.length; i++){
//			System.out.println(fifty[i]);
			if(fifty[i] > biggestNumber){
				biggestNumber = fifty[i];
			}
		}
		System.out.println(biggestNumber);
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}

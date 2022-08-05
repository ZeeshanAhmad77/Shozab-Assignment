package qwer;

import java.util.Arrays;
import java.util.Scanner;

public class Armstrong {
	

	public static void main(String[] args) {

		System.out.println("Please enter Size of an Array");
		Scanner takeInput = new Scanner(System.in);
		int sizeOfArray  = takeInput.nextInt();
		int[] inputArray = new int[sizeOfArray];
		System.out.println(" Enter elements in array");
		for (int i=0; i<sizeOfArray; i++) {
			inputArray[i] = takeInput.nextInt();
		}
		System.out.println("The Input Array");
		System.out.println(Arrays.toString(inputArray));
			
		int arm =0;
		int sum =0;
		int lastDigit =0;
		int originalNumber=0;
		for(int i=0; i<sizeOfArray; i++) {
		originalNumber = inputArray[i];
		int b = inputArray[i];
			while(b!=0) {
				lastDigit = b%10;
				arm = arm +(lastDigit*lastDigit*lastDigit);
				b=b/10;
				
			}
			if(originalNumber==arm) {
				System.out.println(originalNumber+" is an armstrong number");
			}
			arm=0;
			

	}
		takeInput.close();

}
}

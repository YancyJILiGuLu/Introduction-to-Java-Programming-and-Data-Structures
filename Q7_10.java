package chapter7;

import java.util.Scanner;

public class Q7_10 {
	static int indexOfMin=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.print("Enter a number:");
			array[i]=input.nextInt();
		}
		System.out.print("The index of smallest number is :"
				+indexOfSmallestElement(array));

	}
	private static int indexOfSmallestElement(int[] array) {
		// TODO Auto-generated method stub
		int currentMin=array[0];
		for(int i=0;i<array.length;i++) {
			if(currentMin>array[i]) {
				currentMin=array[i];
				indexOfMin=i;
			}

		}
		return indexOfMin;
	}

}

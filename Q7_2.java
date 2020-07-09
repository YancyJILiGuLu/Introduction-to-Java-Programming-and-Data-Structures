package chapter7;

import java.util.Scanner;

public class Q7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.print("Enter ten numbers");
		int[] number= new int[10];

		for(int i=0;i<number.length;i++) {
			number[i]=input.nextInt();				
		}

		System.out.print("The number you "
				+ "entered in a reverses oeder is :");
		for(int k=number.length-1;k>=0;k--) {	

			System.out.print(number[k] +"\t");

		}
	}
}



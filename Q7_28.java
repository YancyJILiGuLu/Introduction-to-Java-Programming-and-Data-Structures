package chapter7;

import java.util.Scanner;

public class Q7_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.print("Enter ten numbers:");

		int[] number= new int[10];
		for(int i=0;i<10;i++) {
			number[i]=input.nextInt();
		}

		showPairs(number);
		
	}

	private static void showPairs(int[] number) {
		// TODO Auto-generated method stub
		for(int i=0;i<number.length;i++) {
			for(int k=0;k<number.length;k++) {
				System.out.print("("+number[i]+","+ number[k]+ ")\n");
			}
		}
		
	}
}

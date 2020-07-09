package chapter7;

import java.util.Scanner;

public class Q7_8 {
	//static int[] numbers = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbersInInt = new int[10];
		double[]numbersInDouble = new double[10];
		Scanner input =new Scanner (System.in);

		for(int i=0;i<10;i++) {
			System.out.print("Enter a number:");
			numbersInDouble[i]=input.nextInt();
		}
		for (int i=0;i<numbersInDouble.length;i++) {
			numbersInInt[i]=(int) numbersInDouble[i];
		}
		
		System.out.print("The average  in a integer format  is :"
				+average(numbersInInt)+"\n"
				+ "The average  in a double format is :"
				+average(numbersInDouble));



	}

	private static double average(double[] numbersInDouble) {
		// TODO Auto-generated method stub
		double ans=0;
		for (int i=0;i<numbersInDouble.length;i++) {
			ans +=numbersInDouble[i];
		}
		
		return ans/numbersInDouble.length;
	}

	public static  int average(int[] numbersInInt) {
		int ans=0;
		for (int i=0;i<numbersInInt.length;i++) {
			ans +=numbersInInt[i];
		}
		return ans/numbersInInt.length;
	}
	






}

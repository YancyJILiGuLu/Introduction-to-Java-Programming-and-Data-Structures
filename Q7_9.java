package chapter7;

import java.util.Scanner;

public class Q7_9 {
	static double[] number = new double[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner (System.in);
		System.out.print("Enter  numbers:");
		for (int i=0;i<10;i++) {

			number[i]=input.nextDouble();		
		}
		double ans=findMin(number);
		System.out.print("The minimum number is :"+ ans);
	}

	private static double findMin(double[] number1) {
		// TODO Auto-generated method stub

		//double currentMin=number1[i];
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number1[i]>number1[j]) {
					double tem= number1[i];
					number1[i]=number1[j];
					number1[j]=tem;


				}
			}
		}
		return number1[0];
	}

}

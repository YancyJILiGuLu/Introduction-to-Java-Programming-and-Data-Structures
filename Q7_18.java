package chapter7;

import java.util.Scanner;

public class Q7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] number = new double [10];
		//double[] numberAfterOrder = new double [10];
		System.out.print("Enter numbers : ");
		for(int i=0;i<number.length;i++) {
			
			number[i]=input.nextDouble();

		}


		bubbleSort(number);

	}

	private static void bubbleSort(double[] number) {

		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]<number[j]) {
					double tem=number[i];
					number[i]=number[j];
					number[j]=tem;
				}


			}
		}
		System.out.print("Ranking  in a descending order is:" );
		for(int k=0;k<number.length;k++) {
			System.out.print(number[k] + " ");

		}
	}
}

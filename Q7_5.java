package chapter7;

import java.util.Scanner;

public class Q7_5 {

	static Scanner input = new Scanner (System.in);
	static int[] numbers= new int[10];
	static int counter= 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers= readNumbers();
		counter=count(numbers);
		System.out.print("\n The number of distinct number is " + counter+"\n");

	}

	private static int count(int[] numbers2) {
		// TODO Auto-generated method stub
		int[] counter= new int[10];
		int times=0;
		
		System.out.print("The distinct numbers are :");
		//counter[0]=0;
		for (int i=0;i<numbers2.length;i++) {	
			counter[numbers2[i]]++; 
			if(counter[numbers2[i]]==1) {
				times++;
				System.out.print(numbers2[i]+"\t");
			}
		}
		return times;
	}

	private static int[] readNumbers() {
		// TODO Auto-generated method stub
		int [] numbers= new int[10];
		System.out.print("Enter 10 numbers ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = input.nextInt();
		}	
		return numbers;
	}
}


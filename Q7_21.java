package chapter7;

import java.util.Scanner;

public class Q7_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[100];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers(Enter 0 for end):");	
		int total=0;
		
		for(int i=0;i<array.length;i++) {
				array[i]=input.nextInt();
				total+=array[i];
				if(array[i]==0) {
					break;
				
			}
					
		}
		System.out.printf("The sum of those numbers "
				+ "you entered is: %d",total);

	}

}

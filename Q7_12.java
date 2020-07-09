package chapter7;

import java.util.Scanner;

public class Q7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array= new int[10];
		int[] afterReverse= new int[10];
		System.out.print("Enter 10 numbers :");
		for (int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.print("The array before reverse is : ");
		for(int i=0;i<array.length;i++) {


			System.out.print(array[i]+ " ");

		}
		System.out.print("\n However the array "
				+ "after reverse is:");

		afterReverse=afterReverse(array);
		
		for(int i=0;i<array.length;i++) {

			System.out.print(array[i]+" ");
		}
	}
		private static int[] afterReverse(int[] array) {
			// TODO Auto-generated method stub
						
			for (int i=0;i<array.length/2;i++) {			
					int tem=array[i];		
					array[i]=array[array.length-i-1];
					array[array.length-i-1]=tem;

				
				
			}
			return array;
		}

	}

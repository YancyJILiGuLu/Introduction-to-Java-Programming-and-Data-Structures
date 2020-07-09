package chapter7;

import java.util.Scanner;

public class Q7_15 {
	static int[] list = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter numbers:");
		
		for (int i=0;i<list.length;i++) {
			list[i]=input.nextInt();		
		}
		
		System.out.print("The list your entered is: ");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.print("\n");
		eliminateDuplicates(list);
	}
	private static void eliminateDuplicates(int[] list2) {
		// TODO Auto-generated method stub

		int[] counter =new int[10];

		System.out.print("Those number you entered without duplicate are: ");
		for(int i=0;i<list2.length;i++) {
			counter[list2[i]]++;
			if(counter[list2[i]]==1) {
				System.out.print(list2[i]);
			}


		}	

	}

}



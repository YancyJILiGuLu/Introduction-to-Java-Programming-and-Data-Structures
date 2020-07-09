package chapter7;

import java.util.Scanner;

public class Q7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter list1 size and contains");
		int size1 = input.nextInt();
		int[] list1= new int[size1];
		
		for (int i=1;i<size1;i++) {
			list1[i] =input.nextInt();
		}
		
		for(int i=1;i<size1;i++) {
			System.out.print(list1[i]+" ");
		}
		System.out.print("Enter list2 size and contains");
		int size2 = input.nextInt();
		int[] list2= new int[size2];
		for (int i=1;i<size2;i++) {
			list2[i] =input.nextInt();
		}
		//boolean compare=true;
		if (compare(list1,list2)==true) {
			System.out.print("Two lists are strictly identical");
		}
		else 
			System.out.print("Two lists are not strictly identical");
			
	}

	private static boolean compare(int[] list1, int[] list2) {
		// TODO Auto-generated method stub
		for(int i=0;i<list1.length;i++) {
			for(int k=0;k<list2.length;k++) {
				if(list1[i]==list2[k]) {
					return true;
					
				}
				
				
			}
		}
		return false;
		
	}

}

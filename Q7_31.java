package chapter7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Q7_31 {

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
		combine(list1,list2);

	}

	private static void combine(int[] list1, int[] list2) {
		// TODO Auto-generated method stub
		int length=list1.length+list2.length;
		int []newList= new int[length];
		System.arraycopy(list1, 0, newList, 0, list1.length);
		System.arraycopy(list2, 0, newList, list1.length, list2.length);
		for(int i=0;i<length;i++) {
			System.out.print((newList[i])+" ");
		}
		
		
	}

}

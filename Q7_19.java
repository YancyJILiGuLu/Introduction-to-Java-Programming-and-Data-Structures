package chapter7;

import java.util.Scanner;

public class Q7_19 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.print("Enter the size of the list :");
		 int size = 0;
		size=input.nextInt();

		int[] list = new int[size];
		 int[] listAfterSort = new int[size];
		System.out.print("Enter the contents of the list :");
		for(int i=0;i<size;i++) {
			list[i]=input.nextInt();
		}
		System.out.print("The list contains "+list.length+ "integers \n");
		
		listAfterSort=sort(list);
		
		if (test(list)== false) {
			System.out.print("The list is not sorted \n after it sorted it should be ");	
			for(int i=0;i<list.length;i++) {
			System.out.print(listAfterSort[i]+" ");	
		     }
		}
		else  if (test(list)== true)
			System.out.print("The list is already sorted \n");	
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+ " ");	
		     }
			
		
		
	}

	private static boolean test(int[] list) {
		
	boolean isSorted=true;
		for(int i=0;i<list.length;i++) {
			for(int k=i+1;k<list.length;k++) {
				if(list[i]>list[k])
					isSorted= false;
				else 
					isSorted= true;
	}
		}
		return isSorted;
	}

	private static int[] sort(int[] list) {
		// TODO Auto-generated method stub

		for(int i=0;i<list.length;i++) {

			for(int j=i+1;j<list.length;j++) {
				if(list[i]==list[j]) {

				}
				else if(list[i]>list[j]) {
					int tem=list[i];
					list[i]=list[j];
					list[j]=tem;
				}

			}
			
			//System.out.print(list[i]+" ");
		}
		
		
		return list;

	}

}

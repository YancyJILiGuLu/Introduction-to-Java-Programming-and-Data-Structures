package chapter7;

import java.util.Scanner;

public class Q7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list= new double[10];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter ten double numbers");
		
		for(int i=0;i<list.length;i++) {
			
			list[i]=input.nextDouble();
			
		}
		
		selectionSrot(list);

	}

	private static void selectionSrot(double[] list) {
		// TODO Auto-generated method stub
		//double currentMax=list[list.length];
		
		for(int i=list.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				
				if(list[i]<list[j]) {
					double tem=list[i];
					list[i]=list[j];
					list[j]=tem;
					
				}				
			}		
		}
		System.out.print("The number ordered in a ascerding way is: ");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
	}

}

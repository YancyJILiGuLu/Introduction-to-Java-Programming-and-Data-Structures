package chapter7;

import java.util.Scanner;
public class Q7_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter numbers between 0-100,  enter 0 for end");
		int[] number= new int[100];
		int[] counter =  new int[101];

		for(int i=0;i<number.length;i++) {
			number[i]=input.nextInt();
			if( number[i]==0) 				
				break;
			counter[number[i]]++;
		} 

		for(int i=0;i<counter.length;i++) {
			if(counter[i]>0 && counter[i]==1)
				System.out.print(i+" occurrs"+ counter[i] +" time \n");
			
			else if(counter[i]>=2)
				System.out.print(i+" occurrs"+ counter[i] +" times \n");

		}

	}
}


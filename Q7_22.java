package chapter7;

import java.util.Scanner;

public class Q7_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String InString= " ";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string ");
		InString=input.nextLine();
		int counter=0;
		char[] sInArray= InString.toCharArray();
		for(int i=0;i<sInArray.length;i++) {
			if((int)(sInArray[i])>=41 && (int)sInArray[i]<=90) {
				System.out.print(sInArray[i] +" ");
				counter++;
			}
			
		}
		System.out.print("The are "+counter+ " characters that are capital.");
	}

}

package chapter7;

import java.util.Scanner;

public class Q7_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String[] zodias= {" monkey","rooter","dog","pig","rat","ox","tiger","rabbit",
				"dragon","snake","horse","sheep"};
		System.out.print("Enter a year");
		int year=input.nextInt();
		int i=year%12;
		System.out.print(zodias[i]);
		
		}

	}



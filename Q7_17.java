package chapter7;

import java.util.Scanner;

public class Q7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.print("Enter the number of students");
		int number = input.nextInt();
		String[] name = new String[number];
		int[] score = new int[number];
		for(int i=0;i<number;i++) {
			System.out.print("Enter a student's name:" );
			name[i]= input.next();	
			System.out.print("Enter a student's score:" );
			score[i]= input.nextInt();	

		}

		rank(number,name,score);

	}

	private static void rank(int number, String[] name, int[] score) {
		// TODO Auto-generated method stub

		for(int i=0;i<number;i++) {
			for(int j=i+1;j<number;j++) {
				if(score[i]<score[j]) {
					int tem=score[i];
					score[i]=score[j];
					score[j]=tem;

					String nameTem=name[i];
					name[i]=name[j];
					name[j]=nameTem;

				}
			}
		}

		System.out.print("Ranking students by their score in a descending order is:" );
		for(int i=0;i<number;i++) {
			System.out.print(name[i] + " ");
		}

	}

}

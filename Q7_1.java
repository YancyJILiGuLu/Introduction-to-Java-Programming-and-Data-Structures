package chapter7;

import java.util.Scanner;

public class Q7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of students \n");
		int number = input.nextInt();

		System.out.printf("Enter %d scores",number);
		int[] scores= new int[number];

		for (int i=0;i< scores.length;i++) {
			scores[i]=input.nextInt();	
		}
		int best = findTheBest(scores);
		getOutput(scores,best);

	}
	private static void getOutput(int[] scores,int best) {
		// TODO Auto-generated method stub
		for (int i=0;i< scores.length;i++) {
			if(scores[i]>= best -10) {
				System.out.printf("Student %d score is %d"
						+ " and Grade is A\n",i, scores[i]);
			}
			else if (scores[i]>= best -20) {
				System.out.printf("Student %d score is %d"
						+ " and Grade is B\n",i, scores[i]);
			}
			else if(scores[i]>= best -30) {
				System.out.printf("Student %d score is %d"
						+ " and Grade is C\n",i, scores[i]);
			} 
			else if (scores[i]>= best -40) {
				System.out.printf("Student %d score is %d"
						+ " and Grade is D\n",i, scores[i]);
			} 
			else if (scores[i]>= best -50) {
				System.out.printf("Student %d score is %d"
						+ " and Grade is D\n",i, scores[i]);
			} 
			else 
				System.out.printf("Invalid input ");


		}

	}


	private static int findTheBest(int[] scores) {
		// TODO Auto-generated method stub
		int best = scores[0];

		for (int i=0;i< scores.length;i++) {	
			if(scores[i] >best) {
				best=scores[i];	
			}

		}
		return best;

	}
}


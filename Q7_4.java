package chapter7;

import java.util.Scanner;

public class Q7_4 {
	static Scanner input = new Scanner (System.in);
	static int[] scores= new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scores=showAndTestNegative();
		double ave=testAverage(scores);
		System.out.print("Ave is "+ ave+ "\n");
		showResult(scores,ave);
	}

	private static void showResult(int[] scores2, double ave) {

		// TODO Auto-generated method stub
		int countForOver=0;
		int countForUnder=0;
		for(int i=0;i<scores2.length;i++) {
			if (scores2[i] >0 && scores2[i]>ave) {		
				countForOver++;
			System.out.print(scores2[i] + " \t "
					+ "is over the average \n");
			}
			else if (scores2[i] >0 && scores2[i]<ave) {
				countForUnder++;
				System.out.print(scores2[i] + " \t "
						+ "is under the average \n");
				}
				
		}
		System.out.printf("There are %d numbers over average\n",countForOver);
		
		System.out.printf("There are %d numbers under average",countForUnder);
	}


	private static double testAverage(int[] scores2) {
		double total = 0.0;
		int times=0;

		for(int i=0;i<scores2.length;i++) {
			if( scores2[i]>0) {
				total+=scores2[i];
				times++;		
			}
		}

		return total/times;
		// TODO Auto-generated method stub


	}

	private static int[] showAndTestNegative() {
		int[] scores= new int[100];
		System.out.print("Enter scores 0-100,  enter negative number for end");
		for(int i=0;i<scores.length;i++) {
			scores[i]=input.nextInt();
			if( scores[i]<0) 				
				break;

		} 	
		return scores;
		// TODO Auto-generated method stub

	}

}

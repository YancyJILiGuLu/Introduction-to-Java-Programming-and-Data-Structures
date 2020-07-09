package chapter7;

import java.util.Scanner;

public class Q7_11 {
	static double[] number = new double[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers");
		for (int i=0;i<10;i++) {
			
			number[i]=input.nextDouble();

		}
		double mean=mean(number);
		
		System.out.printf("The mean of those number is: %.2f "
				,mean);
		System.out.print("\n");
		System.out.printf("The deviation of those number is: %.5f"
				,deviation(number,mean));


	}
	private static double deviation(double[] number2, double mean) {
		// TODO Auto-generated method stub
		double ans=0;
		double ans1=0;
		for(int i=0;i<number2.length;i++) {
			ans1+=Math.pow(number2[i]-mean, 2);
		}
		ans=Math.pow(ans1/(number2.length-1), 0.5);
		return ans;
	}
	private static double mean(double[] number2) {
		// TODO Auto-generated method stub
		double ans=0;
		//double length=number2.length;
		for(int i=0;i<number2.length;i++) {
			ans +=number2[i];
		}
		
		return ans/number2.length;
	}
}

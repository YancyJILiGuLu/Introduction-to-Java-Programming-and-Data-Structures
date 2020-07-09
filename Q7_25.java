package chapter7;

import java.util.Scanner;

public class Q7_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double[] eqn= new double[3];
		System.out.print("Enter  values for a,b,and c ");
		for (int i=0;i<3;i++) {
			eqn[i] =input.nextDouble();
		}
		double[] roots= new double[2];
		roots=getRoot(eqn);
		for(int i=0;i<roots.length;i++) {
			System.out.print(roots[i]+" ");
		}
		
	}

	private static double[] getRoot(double[] eqn) {
		double[] roots= new double[2];
		
		double a=eqn[0];
		double b=eqn[1];
		double c=eqn[2];
		System.out.print(a+" \n");
		System.out.print(b+" \n");
		System.out.print(c+" \n");
		double judge =Math.pow(b,2)-4*a*c;
		System.out.print(judge+" \n");
		if(judge<=0)
			judge=0;
		
		roots[0]=(-b+Math.pow(judge, 0.5))/(2*a);
		roots[1]=(-b-Math.pow(judge, 0.5))/(2*a);
		System.out.print(roots[0]+" \n");
		System.out.print(roots[1]+" \n");
		
			if(judge<=0) {
				System.out.print("This equation only has one solution."
						+ "It is "+roots[0]+"\n");
				
			}
			else if(judge > 0)
				System.out.print("This equation has two solutions."
						+ "There are "+roots[0]+ " and "+roots[1]);
		return roots;
		// TODO Auto-generated method stub
		
	}

}

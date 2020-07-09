package chapter7;

import java.util.Scanner;

public class Q7_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a string");
		String s = input.next();
		char[] ch= new char[s.length()];
		//System.out.print(s+" \n");
		
		
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
			//System.out.print(ch[i]+" \n");
		}
		
		int[] chInt= new int[s.length()];
		for(int i=0;i<s.length();i++) {
			chInt[i]=(int)(ch[i]);
			System.out.print(chInt[i]+" \n");
		}
		
		System.out.print(" \n");
		show(chInt,ch);
			
	}

	private static void show(int[] chInt, char[] ch) {
		// TODO Auto-generated method stub
		for(int i=0;i<chInt.length;i++) {
			
			if(chInt[i]<chInt[i+1]) {
				int tem=chInt[i];
				chInt[i]=chInt[i+1];
				chInt[i+1]=tem;
				
				char charTem=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=charTem;
			}
			
			System.out.print(chInt[i]+" "+"\n");
			System.out.print(ch[i]+" ");
		}
		
		
		
	}
	
}

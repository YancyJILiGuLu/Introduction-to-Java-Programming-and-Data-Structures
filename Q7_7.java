package chapter7;

public class Q7_7 {
	
	
     static int countArray[]=new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			int x=(int) (Math.random()*10);
			countArray[x]++;
		}
		
		for(int i=0;i<10;i++)
		System.out.print( i+ " occurate " +countArray[i]+"\n");

	}

	
}

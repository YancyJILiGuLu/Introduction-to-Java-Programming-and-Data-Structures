package chapter7;

public class Q7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] openOrClose = new boolean[100];
		for(int k=0;k<100;k++) {
			openOrClose[k]=true;
		}
		for(int i=1;i<=100;i+=i+1) {
			if(openOrClose[i]=true) {
				openOrClose[i]=false;
				
			}
			else 
				openOrClose[i]=true;
			
		}
		for(int a=0;a<100;a++) {
			if(a%10==0)
			System.out.println(openOrClose[a]+" ");
			else 
				System.out.print(openOrClose[a]+" ");
		}
	}

}

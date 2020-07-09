package chapter7;

public class Q7_6 {
	static boolean primeNumber=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int number=2;
		while (counter<50) {

			if (primeNumber(number)) {
				counter++;
				if(counter%10==0)
					System.out.println(number+"\t");
				else 
					System.out.print(number+"\t");

			}
			number++;
		}

	}
	private static boolean primeNumber(int i) {
		// TODO Auto-generated method stub


		double sqrt=Math.sqrt(i);
		for (int k=2;k<=sqrt;k++) {
			if(i%k==0) {
				return false;

			}			

		}

		return true;
	}

}

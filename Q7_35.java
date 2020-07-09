package chapter7;

public class Q7_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] randomStrings= {"apple","Big","close","heart",
				"love","java","program","professor","university"};
		
		//System.out.print((int)(Math.random()*(randomStrings.length+1))+"\n");
		
		
		System.out.print("Enter a letter in word: " + randomStrings 
		[(int)(Math.random()*randomStrings.length)]);
		
		
		for( int i=0;i<randomStrings.length;i++) {
			
			
			//System.out.print(randomStrings[4]+" ");
		}
		

	}

}

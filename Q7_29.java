package chapter7;

public class Q7_29 {
	static int[] deck = new int[52];
	static String[]suits= {"Spades","Heart","Diamonds","Clubs"};
	static String[]ranks= {"Ace","2","3","4","5","6",
			"7","8","9","10","Jack","Queen","King"};



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for(int i=0;i<52;i++) {
			deck[i]=i+1;
		}
		shuffle(deck);

		pick(deck);

		int[]pickedNumber=new int[4];
		int sum=0;
		while(true) {

			for(int i=0;i<pickedNumber.length;i++) {
				pickedNumber[i]=pick(deck);
				
				 sum+=pickedNumber[i];
				 
				if(sum==24)
					break;

				
			}
		}


	}

	private static int pick(int[] deck) {
		int i=(int) (Math.random()*deck.length);
		String suit=suits[deck[i]/13];
		String rank=ranks[deck[i]%13];
		System.out.print("This time you picked card number "
				+ deck[i] +" :"+ rank +" of "+suit+"\n");

		switch(rank) {
		case "Ace": return 1;
		case "2": return 2;
		case "3": return 3;
		case "4": return 4;
		case "5": return 5;
		case "6": return 6;
		case "7": return 7;
		case "8": return 8;
		case "9": return 9;
		case "10": return 10;
		case "Jack": return 11;
		case "Queen": return 12;
		case "King": return 13;		
		}
		
		return i;
		// TODO Auto-generated method stub

	}

	private static void shuffle(int[] deck) {
		// TODO Auto-generated method stub
		for(int i=0;i<deck.length;i++) {
			int index=(int)Math.random()*deck.length;
			int tem=deck[i];
			deck[i]=deck[index];
			deck[index]=tem;

		}


	}

}

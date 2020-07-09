package chapter7;

public class Q7_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] list = new long[100000];
		int key=666;
		for (long i=0;i<list.length;i++) {
			list[(int) i]=(long) (1+Math.random()*(1000+1));
		}
		
		System.out.print("The time used by linner search is :"
		+performTestInLinnerSearch(list,key)+" nanoseconds \n");
		System.out.print("The time used by Binary search is :"
				+performTestInBinarySearch(list,key)+" nanoseconds ");
		

	}

	private static long performTestInLinnerSearch(long[] list, int key) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		
		long endTime=0;
		int low=0;
		int high=list.length-1;
		for (long i=0;i<list.length;i++) {
			if(key==list[(int) i])
				 endTime=System.nanoTime();
		}
	
		//long endTime=System.nanoTime();
		
		
		return endTime-startTime;
	}

	private static long performTestInBinarySearch(long[] list, int key) {
		// TODO Auto-generated method stub
		//long executionTime=0;
		long startTime=System.nanoTime();
		
		int low=0;
		int high=list.length-1;
		
		while(high>=low) {
			int mid=(low+high)/2;
			if(key<list[mid])
				high=mid-1;
			else 
				low=mid+1;
		}
		
		long endTime=System.nanoTime();
		
		return endTime-startTime;
		
		
	}

}

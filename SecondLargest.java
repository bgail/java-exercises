package ex;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = { 5, 4, 7, 10, 2, 3, 23 };
		int[] b = { 5, 4, 3, 2, 1 };
		int[] c = { 1, 2, 3, 4, 5 };
		System.out.println( "Expecting 10, Returned: " +secondLargest(a));
		System.out.println( "Expecting 4, Returned: " +secondLargest(b));
		System.out.println( "Expecting 4, Returned: " +secondLargest(c));
	}

	public static int secondLargest(int[] arr){
		int largest = 0;
		int large = 0;
		for(int i=0; i<arr.length; i++){
			if( largest <= arr[i] ){
				large = largest;
				largest = arr[i];
			}else{
				if( large < arr[i]){
					large = arr[i];
				}
			}
		}
		return large;
	}
}

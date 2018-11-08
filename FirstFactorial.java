package ex;

public class FirstFactorial {

	public static void main(String[] args) {
		System.out.println("input: 4\noutput: " +firstFactorial(4));
		System.out.println();

		System.out.println("input: 1\noutput: " +firstFactorial(1));
		System.out.println();
		
		System.out.println("input: 2\noutput: " +firstFactorial(2));
		System.out.println();
		
		System.out.println("input: 5\noutput: " +firstFactorial(5));
		System.out.println();
	}
	public static int firstFactorial(int num){
		int result = 1;
		for(int i=num; i>0; i--){
			result *= i;
		}
		return result;
	}

}

package ex;

public class Palindromes {

	public static void main(String[] args) {
		String sentence = "I never saw a purple cow";
		String palindrome = "rotavator";
		String p1 = "a";
		String p2 = "aa";
		String p3 = "ab";
		String p4 = "aba";

		System.out.println("Expecting false, returned " + isPalindrome(sentence));
		System.out.println("Expecting true, returned " + isPalindrome(palindrome));
		System.out.println("Expecting true, returned " + isPalindrome(p1));
		System.out.println("Expecting true, returned " + isPalindrome(p2));
		System.out.println("Expecting false, returned " + isPalindrome(p3));
		System.out.println("Expecting true, returned " + isPalindrome(p4));
	}

	private static boolean isPalindrome(String str) {
		int end = str.length()-1;
		for(int i=0; i < str.length()/2; i++){
			if( str.charAt(i) != str.charAt(end)) return false;
			end--;
		}
		return true;
	}

}

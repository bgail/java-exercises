package ex;

public class EqualIsNot {

	public static void main(String[] args) {
		System.out.println("Expected: false, Returned: " + equalIsNot("This is not"));
		System.out.println("Expected: true, Returned: " + equalIsNot("This is notnot"));
		System.out.println("Expected: true, Returned: " + equalIsNot("noisxxnotyynotxisi"));
	}
	public static boolean equalIsNot(String str){
		int is = 0;
		int not = 0;
		for(int i=0 ; i < str.length()-1; i++){
			if(str.charAt(i) == 'i' && str.charAt(i+1)=='s') is++;
		}
		for(int i=0 ; i < str.length()-2; i++){
			if(str.charAt(i) == 'n' && str.charAt(i+1)=='o' && str.charAt(i+2)=='t') not++;
		}
		return is == not;
	}
}

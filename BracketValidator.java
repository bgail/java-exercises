package ex;
import java.util.*;

public class BracketValidator {

	public static void main(String[] args) {
		System.out.println("{ [ ] ( ) } should return true:" + validateBracket("{[]()}"));
		System.out.println("{ [ ( ] ) } should return false:" + validateBracket("{[(])}"));
		System.out.println("] { [ ( ] ) } should return false:" + validateBracket("]{[(])}"));

	}
	
	public static boolean validateBracket(String str){
		Stack<Character> openings = new Stack();
		HashMap<Character, Character> map = new HashMap();
		map.put('}', '{');
		map.put(']',  '[');
		map.put(')', '(');
		
		for(int i = 0; i <str.length(); i++){
			char curr = str.charAt(i);
			if( curr!='}' && curr!=']' && curr!=')'){
				openings.push(curr);
			}
			else {
				if( openings.isEmpty() ) return false;
				if(map.get(curr) != openings.pop().charValue()) {
					return false;
				}
			}
		}
		return true;
	}

}

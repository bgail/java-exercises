package ex;

import java.util.Arrays;

public class LongestWord {

	public static void main(String[] args) {
		String a = "fun&!! time";
		String b = "I love dogs";
		System.out.println(longestWord(a));
		System.out.println(longestWord(b));

	}
	public static String longestWord(String sen){
		String word = "";
		String[] arr = new String[sen.length()];
		int j = 0;
		for(int i=0; i<sen.length();i++){
			if( (sen.charAt(i) >= 'A' && sen.charAt(i) <= 'Z') || (sen.charAt(i) >= 'a' && sen.charAt(i) <= 'z'))
			{
				word += sen.charAt(i);
			}else{
				if(!word.isEmpty()){
					arr[j++] = word;
				}
				word = "";
			}
		}
		arr[j++] = word;
		
		String longest = "";
		for(int i=0; i < j; i++){
			if( arr[i].length() > longest.length()){
				longest = arr[i];
			}
		}
		return longest;
	}

}

package ex;

public class ReverseWords {

	public static void main(String[] args) {
		char[] message = { 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };
		reverseWords(message);
		System.out.println(message);

	}
	public static void reverseWords(char[] message) {
	    reverseCharacters(message, 0, message.length - 1);

	    int currentWordStartIndex = 0;
	    for (int i = 0; i <= message.length; i++) {
	        if (i == message.length || message[i] == ' ') {
	            reverseCharacters(message, currentWordStartIndex, i - 1);
	            currentWordStartIndex = i + 1;
	        }
	    }

	    return;
	}

	private static void reverseCharacters(char[] message, int leftIndex, int rightIndex) {
	    while (leftIndex < rightIndex) {
	        char temp = message[leftIndex];
	        message[leftIndex] = message[rightIndex];
	        message[rightIndex] = temp;
	        leftIndex++;
	        rightIndex--;
	    }
	}

}

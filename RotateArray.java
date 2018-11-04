package ex;

import java.util.Arrays;
public class RotateArray {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(rotateArray(ar, 2)));

	}
	public static int[] rotateArray(int[] ar, int rotation){
		int[] result = new int[ar.length];
		int index = 0;
		for( int i=ar.length-rotation; i < ar.length; i++ ){
			result[index++] = ar[i];
		}
		for( int i=0; i < ar.length - rotation; i++ ){
			result[index++] = ar[i];
		}	
		return result;
	}

}

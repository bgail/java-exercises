package ex;

import java.util.Arrays;

public class MergeSortArrays {

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4 };
		int[] ar2 = { 5, 15, 25, 33 };
		int[] ar3 = { 1, 2, 45, 55, 100 };
		int[] result = mergeSort(ar1, ar2);
		System.out.println(Arrays.toString(result));
		result = mergeSort(ar2, ar3);
		System.out.println(Arrays.toString(result));
		result = mergeSort(ar3, ar2);
		System.out.println(Arrays.toString(result));
		result = mergeSort(ar3, new int[]{});
		System.out.println(Arrays.toString(result));
		result = mergeSort(new int[]{}, ar1);
		System.out.println(Arrays.toString(result));
		result = mergeSort(null, ar1);
		System.out.println(Arrays.toString(result));
	}

	public static int[] mergeSort(int[] ar1, int[] ar2){
		if( ar1 == null || ar2 == null ){
			System.out.println("One or more arrays are null");
			return new int[]{};
		}
		int i1 = 0;
		int i2 = 0;
		int index = 0;
		int resultLen = ar1.length + ar2.length;
		int[] result = new int[resultLen];
		int curr1;
		int curr2;
		while(index < resultLen){
			if( i1 < ar1.length){
				curr1 = ar1[i1];
			}else{
				curr1 = ar2[ar2.length-1];
			}
			if( i2 < ar2.length){
				curr2 = ar2[i2];
			}else{
				curr2 = ar1[ar1.length-1];
			}
			if( curr1 < curr2 ){
				result[index] = curr1;
				i1++;
			}else{
				result[index] = curr2;
				i2++;
			}
			index++;
		}
		return result;
	}
}

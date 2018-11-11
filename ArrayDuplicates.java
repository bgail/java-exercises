package ex;

import java.util.*;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 1};
		Integer[] result = findAllDuplicates(arr);
		System.out.println(Arrays.toString(result));
	}
	// find all duplicates in O(n) time
	public static Integer[] findAllDuplicates(int[] arr) {
		Set<Integer> res = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++){
			if(arr[ Math.abs(arr[i]) ] >= 0) {
				arr[ Math.abs(arr[i]) ] = -arr[ Math.abs(arr[i]) ];
			}else{
				res.add(Math.abs(arr[i]));
			}
		}
		return res.toArray(new Integer[0]);
	}

}

package com.simplilearn.technic;

public class RangeQueries {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		int output = RangeQueries.sumRange(arr, 0, 4);
		System.out.println(output);
	}

	static int sumRange(int[] arr, int left, int right) {
		int sum = 0;

		for (int i = left; i <= right; i++) {
			sum += arr[i];
		}
		return sum;
	}


}

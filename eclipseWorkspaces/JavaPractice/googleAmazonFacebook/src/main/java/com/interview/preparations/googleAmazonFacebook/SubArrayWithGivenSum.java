package com.interview.preparations.googleAmazonFacebook;

import java.util.Scanner;

public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases_num = Integer.parseInt(sc.nextLine());
		for ( int i = 0 ; i < testCases_num ; i++) {
			
		}
	}

	
	public int subArray_with_Sum( int[] arr, int size, int sum) {
		if(arr == null || k < 1 ) {
			return 0;
		} else if (k > arr.length) {
			return sumArray(arr, 0, arr.length);
		} else {
			int left = 0 , right = k , maxSum = sumArray(arr, 0, k), sum = 0;
			while ( right + 1 < arr.length) {
				sum = maxSum + arr[right+1] - arr[left];
				if(sum > maxSum) {
					maxSum = sum;
				}
			}
			return maxSum;
		}
	}
	
	public int max_sum_subArray( int[] arr, int k) {
		if(arr == null || k < 1 ) {
			return 0;
		} else if (k > arr.length) {
			return sumArray(arr, 0, arr.length);
		} else {
			int left = 0 , right = k , maxSum = sumArray(arr, 0, k), sum = 0;
			while ( right + 1 < arr.length) {
				sum = maxSum + arr[right+1] - arr[left];
				if(sum > maxSum) {
					maxSum = sum;
				}
			}
			return maxSum;
		}
	}
	
	public int sumArray(int[] arr, int low, int high) {
		if(arr == null) {
			return 0;
		}
		if(low < 0 || high > arr.length) {
			return sumArray(arr, 0 , arr.length);
		}
		int sum = 0 ;
		for ( int i = low ; i <= high ; i++ ) {
			sum += arr[i];
		}
		return sum;
	}
}

/**
 * 
 */
package com.star.sud;

/**
 * @author Sudarshan
 *
 */
public class Solution1 {

	public static void main(String[] args) {
		int a[] = { 10, 4, 8, 2 };
		int result = sumOfTwoLargestElements(a);
		System.out.println(result);
	}

	public static int sumOfTwoLargestElements(int[] a) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		for (int value : a) {
			if (value > max) {
				secondMax = max;
				max = value;
			} else if (value > secondMax && value < max) {
				secondMax = value;
			}
		}
		int sum = max + secondMax;
		return sum;
	}

}

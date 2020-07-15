/**
 * 
 */
package com.star.sud;

import java.util.Arrays;

/**
 * @author Sudarshan
 *
 */
public class Solution2 {

	public static void main(String[] args) {
		int a[] = { 10, 4, 8, 2 };
		int result = getClosestToZero(a);
		System.out.println(result);
	}

	public static int getClosestToZero(int[] a) {
		int currentValue = 0;
		int closestVal = a[0];
		Arrays.sort(a);
		for (int index = 0; index < a.length; index++) {
			currentValue = a[index] * a[index];
			if (currentValue <= (closestVal * closestVal)) {
				closestVal = a[index];
			}
		}
		return closestVal;
	}

}

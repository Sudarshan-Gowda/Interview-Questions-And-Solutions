/**
 * 
 */
package com.star.sud;

import java.util.ArrayList;

/**
 * @author Sudarshan
 *
 */
public class Solution3 {

	public static void main(String[] args) {

		first1500NaturalNumbers();

	}

	public static void first1500NaturalNumbers() {
		int index = 1;
		for (int i = 2; index <= 1500; i++) {
			ArrayList<Integer> remainder = new ArrayList<Integer>();
			int number = i;
			while (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {

				if (number % 2 == 0) {
					number = number / 2;
					remainder.add(2);
				} else if (number % 3 == 0) {
					number = number / 3;
					remainder.add(3);
				} else if (number % 5 == 0) {
					number = number / 5;
					remainder.add(5);
				}
			}
			if (number != 1) {
				remainder.add(10);
			}
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
			} else if (remainder.contains(10)) {
			} else {
				System.out.println(i + ":" + remainder);
				index++;
			}
		}
	}
}

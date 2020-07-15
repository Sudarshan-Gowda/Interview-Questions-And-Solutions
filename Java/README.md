-------------- 
### Question 1
```
1. Implement the following function
public static int sumOfTwoLargestElements(int[] a) {
 /*
 Please implement this method to return the sum of the
 two largest integer numbers in a given array.
 */
}

2. Implement the following function
public static int getClosestToZero(int[] a) {
 /*
 Please implement this method to return the integer number in a
 given array that is closest to zero.
 If there are two equally closest to zero elements like 2 and -2
 consider the positive element, i.e. 2, to be "closer" to zero.
 */
}

3. Write a Java program to list out the first 1500 natural numbers
whose factor(s) is/are either ONLY 2, 3, or 5. The faster your program
can complete the calculation the better, but it should not run more
than 2 minute.
For your reference, the first 20 numbers are (factors listed after
semicolon): 

2 : 2
3 : 3
4 : 2 2
5 : 5
6 : 2 3
8 : 2 2 2
9 : 3 3
10 : 2 5
12 : 2 2 3
15 : 3 5
16 : 2 2 2 2
18 : 2 3 3
20 : 2 2 5
24 : 2 2 2 3
25 : 5 5
27 : 3 3 3
30 : 2 3 5
32 : 2 2 2 2 2
36 : 2 2 3 3
40 : 2 2 2 5
PS: 21 (3*7), 22 (2*11), 26 (2*13) are numbers that should not be in the list. 
```
 
```
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
```

```
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
```

```
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
```

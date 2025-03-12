package Prep;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 1334, sum = 0;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("sum of the given number is " + sum);
		/*
		 * Let's say num = 1334.
		 * 
		 * Iteration 1: sum += 1334 % 10; => sum += 4; (last digit of 1334 is 4) num =
		 * 1334 / 10; => num = 133; (removing the last digit) Iteration 2: sum += 133 %
		 * 10; => sum += 3; (last digit of 133 is 3) num = 133 / 10; => num = 13;
		 * Iteration 3: sum += 13 % 10; => sum += 3; (last digit of 13 is 3) num = 13 /
		 * 10; => num = 1; Iteration 4: sum += 1 % 10; => sum += 1; (last digit of 1 is
		 * 1) num = 1 / 10; => num = 0; Now num is 0, so the loop exits.
		 * 
		 * The sum of the digits (sum) is 4 + 3 + 3 + 1 = 11.
		 */
	}
}

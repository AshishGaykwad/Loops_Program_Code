package whileLoop;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class palindrome {

	public static void main(String[] args) {
		// mid.3

		int num = 123454321;

		int temp = num;

		int reverse = 0;

		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}

		if (temp == reverse)
			System.out.println("Palindrome number");
		else
			System.out.println("not palindrome number");
	}
}

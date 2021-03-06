package javaProgramming;

public class PalindromeString {

	public static boolean isPalindrome(String str) {

		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;

	}

	public static void main(String[] args) {

		if (isPalindrome("dipid"))
			System.out.println("It's is a palindrome");
		else
			System.out.println("nope.");

	}

}

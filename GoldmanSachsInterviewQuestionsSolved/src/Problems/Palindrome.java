package Problems;

import java.util.Scanner;

public class Palindrome {
	
	static boolean isPalindrome(String str) {
		
		int i=0,j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = in.nextLine();
		if(isPalindrome(str))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
		in.close();
	}
}

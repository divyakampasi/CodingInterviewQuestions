
package Problems;
import java.util.Scanner;
public class RunLengthEncoding {
	
	static void printString(String str) {
		int n = str.length();
		
		for(int i =0;i<n;i++) {
			int count =1;
			while(i<n-1 &&str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			System.out.print(str.charAt(i));
			System.out.print(count);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter String :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		printString(s);
	}

}

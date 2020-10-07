//Given an array of numbers, the task is to print those numbers in ascending order separated by 
//commas which have 1, 2 and 3 in their digits. 
//If no number containing digits 1, 2, and 3 present then print -1.

package Problems;

import java.util.*;

public class printNum {
	
	public static String printNumbers(int[] numbers) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int number : numbers) {
				if(findContainsOneTwoThree(number)) {
					array.add(number);
				}
		}
		Collections.sort(array);
		
		StringBuffer strbuf = new StringBuffer();
		Iterator<Integer> it = array.iterator();
		while(it.hasNext()) {
			int value = (int)it.next();
			if(strbuf.length()>0)
				strbuf.append(", ");
			strbuf.append(Integer.toString(value));
		}
		return((strbuf.length()>0)?strbuf.toString() :"-1");
		
		}

	
	public static boolean findContainsOneTwoThree(int num) {
		String str = Integer.toString(num);
		return(str.contains("1") && str.contains("2") && str.contains("3"));
	}
	public static void main(String[] args) {
		int[] numbers = { 123, 1232, 456, 234, 32145 };         
        System.out.println(printNumbers(numbers)); 
    } 


}

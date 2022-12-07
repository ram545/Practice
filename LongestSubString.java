import java.util.Scanner;
import java.util.HashSet;


class LongestSubString{

	static String longSubString(String input){
		int iter=0, start = 0, cStart = 0, cEnd = 0, len = input.length();
		HashSet<Character> check = new HashSet<Character>();

		while(iter < len){
			while(!check.add(input.charAt(iter))){
				check.remove(input.charAt(start));
				start++;
			}

			iter++;

			if( iter-start > cEnd-cStart){
				cStart = start;
				cEnd = iter;
			}
		}

		return input.substring(cStart, cEnd);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String output = longSubString(input);
		System.out.println(output);
	}
}
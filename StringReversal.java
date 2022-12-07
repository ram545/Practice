import java.util.*;
import java.io.*;

class StringReversal{

	static String reverse(String s){
		String output = "";
		int iter = 0;
		while(iter < s.length()){
			output = s.charAt(iter) + output;
			iter++;
		}
		return output;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String output = reverse(s);
		System.out.println(output);
	}
}
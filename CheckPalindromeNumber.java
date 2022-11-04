import java.lang.*;
import java.util.Scanner;
import java.lang.Math;

public class CheckPalindromeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long reverse = reverseInt1(N);
		if(reverse == -1)
			System.out.println("Unchecked");
		else if(N == reverse)
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}

	static boolean checkPalindrome(long N){
		int iter=0, length=0;
		long[] arr = new long[20];
		boolean check = true;
		while(N > 0){
			arr[iter++] = N%10;
			N = N/10;
			length++;
		}
		iter = 0;
		while(iter < length/2){
			if(arr[iter] != arr[length-iter-1]){
				check = false;
				break;
			}
			iter++;
		}
		return check;
	}

	static long reverseInt(long N){
		long result=0,mod, lMax = Long.MAX_VALUE;
		while(N > 0){
			mod = N%10;
			N = N/10;
			if(result > lMax/10 || (result == lMax/10 && mod > lMax%10)){
				System.out.println("Overflow Detected");
				return -1;
			}
			result *= 10;
			result += mod;
		}
		return result;	
	}

	static long reverseInt1(long N){
		long result = 0, prev_sum = 0, mod;
		while(N > 0){
			mod = N%10;
			result *= 10;
			result += mod;
			if( (result-mod)/10 != prev_sum){
				System.out.println("Overflow Detected 1");
				return -1;
			}
			prev_sum = result;
			N = N/10;
		}
		return result;
	}
}
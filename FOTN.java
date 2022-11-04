import java.io.*;
import java.util.*;
import java.lang.*;


public class FOTN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Integer numerator = sc.nextInt();
		Integer denominator = sc.nextInt();
		System.out.println(constructFraction(numerator, denominator));
	}

	static StringBuilder constructFraction(Integer num, Integer denom){
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		Integer rem=0, res;
		if( num == 0) 
			return new StringBuilder("0");
		if (denom == 0)
			return new StringBuilder("divison by zero not possible");

		res = num/denom;
		sb.add 	
		if( hm.add())

		return sb; 
	}
}
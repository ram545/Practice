import java.io.*;
import java.util.*;
import java.lang.*;


public class TZOF{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Integer factorialOfN = sc.nextInt();
		System.out.println(noOfZeros(factorialOfN));
	}

	static Integer noOfZeros(Integer N){
		Integer count = 0, temp=0, quo = 5;
		while(N >= quo){
			temp = N/quo;
			count += temp;
			quo *= 5;
		}	
		return count;
	}
}
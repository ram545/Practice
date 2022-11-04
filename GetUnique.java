import java.lang.*;
import java.util.*;
import java.io.*;

public class GetUnique{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer iter=0,N = sc.nextInt();
		Integer[] arr = new Integer[N];
		while(iter < N)
			arr[iter++] = sc.nextInt();
		getUnique(arr);
		getUnique1(arr);
	}

	// using O(n) space
	static void getUnique(Integer[] arr){
		HashSet<Integer> hs = new HashSet<Integer>();
		Integer iter = 0;
		while(iter < arr.length){
			if(!hs.add(arr[iter++])){
				hs.remove(arr[iter-1]);
			}
		}
		System.out.println(hs);
	}


	static void getUnique1(Integer[] arr){
		Integer result = 0, iter = 0;
		while( iter < arr.length){
			result = result^arr[iter];
			iter++;
		}
		System.out.println(result);
	}
}
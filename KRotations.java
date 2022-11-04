import java.lang.*;
import java.util.*;
import java.io.*;

public class KRotations{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int iter=0,N,K;
		N = sc.nextInt();
		K = sc.nextInt();
		int[] arr = new int[N];
		while(iter < N)
			arr[iter++] = sc.nextInt();
		AfterKrotations1(arr,K);
	}

	static void printArray(int[] arr){
		for(int a: arr){
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	// using O(n) space
	static void AfterKrotations(int[] arr,int K){
		int iter = 0, len = arr.length;
		int[] output = new int[len];
		for(iter = 0; iter < len; iter++){
			output[(iter+K)%len] = arr[iter]; 
		}
		printArray(output);
	}

	// using reverse
	static void AfterKrotations1(int[] arr,int K){
		int len = arr.length,temp=0,iter;

		for(iter = 0; iter < K/2; iter++){
			temp = arr[len-K+iter];
			arr[len-K+iter] = arr[len-iter-1];
			arr[len-iter-1] = temp;
		}

		for(iter = 0; iter < (len-K)/2; iter++){
			temp = arr[iter];
			arr[iter] = arr[len-iter-K-1];
			arr[len-iter-K-1] = temp;
		}

		for(iter = 0; iter < len/2; iter++){
			temp = arr[iter];
			arr[iter] = arr[len-iter-1];
			arr[len-iter-1] = temp;
		}
		
		printArray(arr);
	}

}
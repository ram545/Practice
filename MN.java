import java.lang.*;
import java.util.*;
import java.io.*;

public class MN{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer iter=0,N;
		N = sc.nextInt();
		Integer[] arr = new Integer[N-1];
		while(iter < N-1)
			arr[iter++] = sc.nextInt();
		System.out.println(missingNumber(arr,N));
	}

	static void printArray(Integer[] arr){
		for(Integer a: arr){
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	// can cause overflow
	static long sumOfMethod(Integer arr[], Integer N){
		long sum = 0, expectedSum = 0;
		Integer iter = 0, len = arr.length;
		while( iter < len){
			sum += (long)arr[iter++];
		}
		expectedSum = (N*(N+1))/2;
		return expectedSum-sum;
	}

	// to avoid overflow
	static long individualSum(Integer arr[], Integer N){
		Integer iter = 0, len = arr.length;
		long sum = 0;
		while(iter < len){
			sum -= arr[iter++];
			sum += iter;
		}
		return sum+N;
	}

	//using XOR Method
	static long usingXOR(Integer arr[], Integer N){
		long missingNumber=0;
		Integer iter = 0, len = arr.length;
		while( iter < len){
			missingNumber ^= arr[iter++];
			missingNumber ^= iter;
		}
		missingNumber ^= N;
		return missingNumber;
	}

	static Integer missingNumber(Integer arr[], Integer N){
		Integer iter = 0, len = arr.length,temp,temp1;
		while(iter < len){
			temp = arr[iter];
			if( temp == N){
				iter++;
				continue;
			}
			while(temp > 0 && arr[temp-1] > 0){
				temp1 = arr[temp-1];
				arr[temp-1] = -1;
				temp = temp1;
				if(temp == N)
					break;
			}
			iter++;
		}
		for(iter = 1 ; iter < N; iter++){
			if(arr[iter-1] > 0)
				break;
		}
		return iter;
	}

}
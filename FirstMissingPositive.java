import java.lang.*;
import java.util.*;
import java.io.*;

public class FirstMissingPositive{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer iter=0,N;
		N = sc.nextInt();
		Integer[] arr = new Integer[N];
		while(iter < N)
			arr[iter++] = sc.nextInt();
		System.out.println(formatArray(arr));
	}

	static Integer usingHashKey(Integer[] arr){
		Integer iter=0,len = arr.length;
		HashSet<Integer> hs = new HashSet<Integer>();
		while(iter < len){
			if( arr[iter] > 0)
				hs.add(arr[iter]);
			iter++;
		}
		for(iter = 1; iter < len+1; iter++){
			if(!hs.contains(iter))
				break;
		}
		if( iter == len+1 )
			return len+1;
		else
			return iter;
	}


	static void printArray(Integer[] arr){
		for(Integer a: arr){
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	static Integer formatArray(Integer[] arr){
		Integer iter,temp,len = arr.length,temp1;
		for( iter = 0; iter < len; iter++){
			if( arr[iter] < 0 || arr[iter] > len)
				arr[iter] = 0;
		}

		// loop through indexing
		for(iter = 0; iter < len; iter++){
			temp = arr[iter];
			while(temp > 0 && arr[temp-1] > 0){
				temp1 = arr[temp-1];
				arr[temp-1] = -1;
				temp = temp1;
			}
			if(temp > 0)
				arr[temp-1] = -1;
		}
		return findfirstMissingPositive(arr);
	}


	static Integer findfirstMissingPositive(Integer[] arr){
		Integer iter,len = arr.length;
		for(iter = 0 ; iter < len; iter++){
			if(arr[iter] != -1)
				break;
		}
		return iter+1;
	}

}
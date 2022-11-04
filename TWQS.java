import java.lang.*;
import java.util.*;
import java.io.*;

public class TWQS{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer iter=0,N;
		N = sc.nextInt();
		Integer[] arr = new Integer[N];
		while(iter < N)
			arr[iter++] = sc.nextInt();
		quickSortAlgo(arr, 0, arr.length-1);
		printArray(arr);
	}

	static void printArray(Integer[] arr){
		for(Integer a: arr){
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	static void swap(Integer[] arr, Integer s1, Integer s2){
		Integer temp;
		temp = arr[s1];
		arr[s1] = arr[s2];
		arr[s2] = temp;
	}

	static Integer[] partition(Integer[] arr, Integer low, Integer high){
		Integer l = low, m = low, h = high-1, key = arr[high];
		Integer[] result = new Integer[2];
		while(m <= h){
			if( arr[m] > key ){
				swap(arr,h,m);
				h--;
			}
			else if( arr[m] < key){
				swap(arr,l,m);
				l++;
				m++;
			}
			else
				m++;
		}
		h++;
		swap(arr,h,high);
		result[0] = l;
		result[1] = h;
		return result;
	}

	static void quickSortAlgo(Integer[] arr, Integer low, Integer high){
		if(low == high - 1){
			if(arr[low] >= arr[high])
				swap(arr,low,high);
		}
		else if(low < high){
			Integer[] arr1 = partition(arr,low,high);

			quickSortAlgo(arr, low, arr1[0]-1);
			quickSortAlgo(arr, arr1[1]+1, high);
		}
	}
}
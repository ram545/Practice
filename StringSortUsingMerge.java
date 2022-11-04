import java.lang.*;
import java.util.*;
import java.io.*;

public class StringSortUsingMerge{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "";
		Integer iter = 0;
		while(sc.hasNextLine()){
			str = str.concat(sc.nextLine() + " ");
		}
		StringTokenizer token = new StringTokenizer(str);
		String[] arr = new String[token.countTokens()];
		while(token.hasMoreTokens()){
			arr[iter++] = token.nextToken();
		}
		mergeSort(arr,0,(arr.length-1));
		printArray(arr);
	}

	static void printArray(String arr[]){
		for(String a: arr){
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	static boolean compare(String s1, String s2){
		Integer lenS1 = s1.length(), lenS2 = s2.length(), iter=0;
		boolean gtFlag = false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		while( iter < lenS1 && iter < lenS2){
			if(s1.charAt(iter) > s2.charAt(iter))
				return true;
			else if(s1.charAt(iter) < s2.charAt(iter))
				return false;
			iter++;
		}
		if(lenS1 < lenS2)
			return false;
		else
			return true;
	}

	static void mergeSort(String[] arr,Integer low, Integer high){
		if(low < high){
			Integer mid = (low+high)/2;
			mergeSort(arr,low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr,low,mid,high);
		}
	}

	static void merge(String[] arr,Integer low, Integer mid, Integer high){
		Integer rLen, lLen, lIter = 0, rIter = 0, aIter = low;
		lLen = mid-low+1;
		rLen = high-mid;
		String[] rArr = new String[rLen];
		String[] lArr = new String[lLen];
		while(rIter < rLen){
			rArr[rIter] = arr[mid+1+rIter];
			rIter++;
		}
		while(lIter < lLen){
			lArr[lIter] = arr[low+lIter];
			lIter++;
		}
		rIter = 0;
		lIter = 0;
		while( rIter < rLen && lIter < lLen){
			if(compare(rArr[rIter], lArr[lIter]))
				arr[aIter++] = lArr[lIter++];
			else
				arr[aIter++] = rArr[rIter++];
		}
		while(rIter < rLen)
			arr[aIter++] = rArr[rIter++];
		while(lIter < lLen)
			arr[aIter++] = lArr[lIter++];
	}
}
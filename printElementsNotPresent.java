import java.util.LinkedHashSet;


class printElementsNotPresent{

	public static void main(String[] args){
		int[] arr = new int[]{ 4,5,6,20,30,58,100};
		int size = 100, iter=0;
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for( int i : arr)
			set.add(i);

		while(iter < size){
			if(!set.contains(iter))
				System.out.print(iter + " ");
			iter++;
		}	
		System.out.println("");
	}

}
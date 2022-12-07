import java.util.List;
import java.util.ArrayList;

class StringStartingP{

	public static void main(String[] args){
		List<String> myList = new ArrayList<>();
		myList.add("pqr");
		myList.add("stu");
		myList.add("pvwx");
		myList.add("yza");
		myList.add("bcd");
		myList.add("Pefg");
		myList.add("vwxy");
		myList.forEach( s -> { if(s.charAt(0) == 'p' || s.charAt(0) == 'P') System.out.println(s); } );
	}
}
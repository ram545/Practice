import java.util.Scanner;


/**
 *  input : jat2
 *  output : jatjat
 * 
 * 	input : jnut2jat2
 *  output : jnutjnutjatjat
 * 
 * 
 * */
class StringRepeat{


	public static String repeatString(String input){
		StringBuilder output = new StringBuilder();
		String tempString = "";
		int iter = 0, len = input.length(), repeat, iter1 = 0;

		while(iter < len){
			if(input.charAt(iter) >= '0' && input.charAt(iter) <= '9'){
				repeat = input.charAt(iter) - '0';
				iter1 = 0;
				while(iter1 < repeat){
					output.append(tempString);
					iter1++;
				}
				tempString = "";
			}
			else{
				tempString += input.charAt(iter);
			}
			iter++;
		}

		if(tempString != "")
			output.append(tempString);

		return output.toString();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String output = repeatString(input);
		System.out.println(output);
	}
}



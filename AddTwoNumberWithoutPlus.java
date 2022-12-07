
public class AddTwoNumberWithoutPlus {

	static int addNum(int a, int b){
		if(b==0)
			return a;
		else 
			return addNum((a^b), (a&b)<<1);
	}

	static int addNumIter(int a, int b){
		int carry;

		while(b!=0){
		carry = a&b;

		a = a^b;

		b = carry<<1;

		}

		return a;
	}


    public static void main(String... args){
    	System.out.println(addNumIter(15,20));
    }
}

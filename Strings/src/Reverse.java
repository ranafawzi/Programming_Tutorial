import java.util.Scanner;

//intermediate

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input="", rev="";
		
		//todo: take an String as input and reverse it. Then print it.
		input = scan.nextLine();
		rev = new StringBuffer(input).reverse().toString();
        System.out.println("The orignal Stringd:"+input);
        System.out.println("String after reverse:"+rev);
		
		
    	scan.close();		
	}

}

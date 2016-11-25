import java.util.Scanner;

public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		 System.out.println(factorial(x));
    }
	
	 private static long factorial(int num) {
		 
	        if(num<0)  throw new IllegalArgumentException("The number must be >= 0"); 
	        return num==0||num==1? 1:num*factorial(num-1);
	    }
	
	
}

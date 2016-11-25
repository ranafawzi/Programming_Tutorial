import java.util.Scanner;

public class Fibonacci {
	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		 System.out.println("Faibonacci " + x + " =  " + fibonacci(x));
    }
	
	 private static long fibonacci(int num) {
		 
	        if(num<0)  throw new IllegalArgumentException("The number must be >= 0"); 
	        return num==0||num==1? 1: fibonacci(num-1)+fibonacci(num-2);
	    }
	



}

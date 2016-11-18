import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int res;
		
		for(int i=0; i<= x; i++)
		{
		  res= i % 2;
			if( res != 0)
			{
				System.out.println("The odd numbers are" + i );
			}
			
		}
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	scan.close();	
	}
	
}

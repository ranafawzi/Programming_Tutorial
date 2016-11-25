import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int total=0,x=0;		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		
		 while(!scan.hasNext("s")){
			 
			if( scan.hasNextInt() )				
			x= scan.nextInt();
			total = total + x;	
			
		 }		
		System.out.println("The Total =  " + total );
		
		scan.close();	
		
		}
	
}

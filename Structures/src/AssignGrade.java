import java.util.Scanner;

//if-else



public class AssignGrade {
	

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		System.out.println(x);
		
		//todo: when executing the program you will be ask to write a score.		
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)		
		
		if(x >= 0 && x < 50)			
		{
			
			System.out.println("Score = " + x + " Grade = 5.0  "  );
		
		} 			
		else if(x >= 50 && x < 65)
		{
			
			System.out.println("Score = " + x + " Grade = 4.0  "  );
		} 
		else if (x >= 65 && x < 80){
			
			System.out.println("Score = " + x + " Grade = 3.3"  );
		}
		else if (x >= 80 && x < 90){
			System.out.println("Score = " + x + " Grade = 2.3"  );
		}
		else if (x >= 90 && x < 100){
			System.out.println("Score = " + x + " Grade = 1.3"  );
		}			
		
	}
}

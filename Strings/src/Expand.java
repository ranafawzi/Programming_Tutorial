import java.util.Scanner;


//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input="", res="";
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
		//
		input=scan.next();
		System.out.println("The original  " + input+ "the length is " +input.length());	
		
		int i=0;	
		
		while(i < input.length()-1)
		{
			
			 if (Character.isDigit(input.charAt(i)) && !Character.isDigit(input.charAt(i+1)))
			{
				//System.out.println("the number is "+input.charAt(i));
				int count = (int)input.charAt(i);
				for(int j=0; j< Character.getNumericValue(count); j++)
				{
					res= res + Character.toString(input.charAt(i+1));
					
				}				
							
				 } 	
				
				else if (Character.isDigit(input.charAt(i)) && Character.isDigit(input.charAt(i+1)))
				{
					int count = (int)input.charAt(i) + (int)input.charAt(i+1);
					System.out.println("secind cond: count "  + Character.getNumericValue(count));
					if (!Character.isDigit(input.charAt(i+2)))
				
					System.out.println("secind loop the number is "  +input.charAt(i));
				
					for(int j=0; j< Character.getNumericValue(count); j++)
					{
						res= res + Character.toString(input.charAt(i+2));
						
					}
					
					i=i+2;
					
				}
			 
				else 
				{
					res= res + input.charAt(i);
				}
			 
				
			
			i++;}	// end while
		
		
			
		System.out.println("the final result is" + res);
		
		
	scan.close();	
		
	}
	
}

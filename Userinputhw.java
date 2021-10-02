package workplace ;
import java.util.Scanner;

public class Userinputhw {

	public static void main(String[] args) {
		
//		User entered inputs (Scanner): 
//
//
//			1. Write Fibonnaci series between the user entered start and end values
		
		
		  int count;
		  int num1 = 0;
		  int num2 = 1;
	        System.out.println("How may numbers you want in the sequence:");
	        Scanner scan = new Scanner(System.in);
	        count = scan.nextInt();
	       
	        System.out.print("Fibonacci Series of "+count+" numbers:");

	        int i=1;
	        while(i<=count)
	        {
	            System.out.print(num1+" ");
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	            i++;
	        }
		
		
		
		
		
		
	        System.out.println("       ");
	        System.out.println("----------------");
	        System.out.println("       ");
	        
//			2. Determine whether a user entered number is an Armstrong number
	        
	        int n;
	        int copy;
	        int remainder;
	        int sum=0;
	        System.out.println("Enter a number to determine if it is an Armstrong number: ");
	        
	            n=scan.nextInt();
	                   	copy=n;
	                      while(copy!=0)
	           	       {
	        remainder=copy%10;
	              sum=sum+remainder*remainder*remainder;
	                copy=copy/10;
	            }
	        
	        if(sum==n)
	                System.out.println(n+" is an Armstrong number");
	            else
	                System.out.println(n+" is not an Armstrong number");
	        
	        
	       
	        
	        System.out.println("       ");
	        System.out.println("----------------");
	        System.out.println("       ");
//
//			3. Write a program to see if a user entered string is a palindrome or not
	      //Allows for another input after problem 2
	    	scan.nextLine();
	     
	     System.out.println("Enter a word to check if it is a palindrome: ");
	      
	        String origString = scan.nextLine();
	        String reverseString = "";
	         
	        char[] characters = origString.toCharArray();
	 
	        for( int p = characters.length - 1 ; p >= 0 ; p-- ) {
	            reverseString = reverseString + characters[p];
	        }
	 
	        //Check palindrome string
	        // .equals verifies the boolean true or false
	        if (origString.equals(reverseString)) {
	            System.out.println("String is a palindrome.");
	        } else {
	            System.out.println("String is not a palindrome.");
	        }
	        
	        
	        
	        scan.close();
	}

}
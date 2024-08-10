

import java.util.*;

public class Challeange3{
    public static void main(String[] args)
    {
        // Enter the input from the user "racecar"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Output the result
        if (isPalindrome) {
            System.out.println("The string'" + input + "'is a palindrome.");
        } else {
            System.out.println("The string'" + input + "' is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) 
    {
	  int i,j;
		for( i=0, j=str.length()-1; i<j; i++,j--)  
		{
			char left=str.charAt(i);
			char right=str.charAt(j);
			
			if(left!=right)
				break;
		}
		if(i<j)
			return false;
		else
		return true;
    }}



import java.util.*;
import java.lang.*;
import java.io.*;

class Vowelconstant
{
	public static void main (String[] args)
	{
		char sam;
	
		System.out.println("enter a character");
		Scanner s=new Scanner(System.in);
		sam=s.next().charAt(0); 
		
		if(sam =='$')
		{
		System.out.println("invalid");
		}
		else if(sam=='a'||sam=='e'||sam=='i'||sam=='o'||sam=='u')
		{
	System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		} 

	
}
}

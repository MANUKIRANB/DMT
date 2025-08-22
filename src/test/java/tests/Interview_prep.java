package tests;

import org.testng.annotations.Test;

public class Interview_prep {

	@Test
	public void RemoveSpace_and_reversestring() 
	{
		String name = "This is a java program";

		String nospace = name.replaceAll("\\s+", "");
		String reversed = new StringBuilder(nospace).reverse().toString();
		System.out.println(reversed);

	}
	@Test
	public void reverseString()
	{
		String s1 = "mukundha";
		String Reversed = "";
		
		for (int i = s1.length()-1 ; i>=0; i--) 
		{
			Reversed += s1.charAt(i);
			
		}
		System.out.println(Reversed);
	}
	
	@Test
	public void removeDuplicates()
	{
		String s1 = "mukundhaaa";
		String Result ="";
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch = s1.charAt(i);
			if (Result.indexOf(ch)==-1) 
			{
				Result += ch;
			}
		}
		System.out.println(Result);
	}
	
}

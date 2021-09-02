package com.bridgelabz.algorithmproblems;
import java.util.*;
public class Anagram {
		static boolean areAnagram(String string1, String string2)
		{
			string1 = string1.toLowerCase();
			string2 = string2.toLowerCase();
			char firstString[] = string1.toCharArray();
			char secondString[] = string2.toCharArray();
			int  firstStringLength = string1.length();
			int secondStringLength = string2.length();
			
			if (firstStringLength != secondStringLength)
				return false;
			
			Arrays.sort(firstString);
			Arrays.sort(secondString);
			
			for (int index = 0; index < firstStringLength; index++)
				if (firstString[index] != secondString[index])
					return false;

			return true;
		}

		public static void main(String args[])
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the first string");
			String string1 = scanner.next();
			System.out.println("Enter the second string");
			String string2 = scanner.next();
			if (areAnagram(string1, string2))
				System.out.println("The two strings are anagram of each other");
			else
				System.out.println("The two strings are not anagram of each other");
								
		}
	}


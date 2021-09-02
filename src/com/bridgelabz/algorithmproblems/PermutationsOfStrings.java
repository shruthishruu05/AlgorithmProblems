package com.bridgelabz.algorithmproblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationsOfStrings
{

	private static void findPermutationIteratively(String word) 
	{
		if (word == null || word.length()==0)
		{
			return;
		}
		List<String> permuteList = new ArrayList<String>();
		permuteList.add(String.valueOf(word.charAt(0)));
		for(int index1=1; index1<word.length(); index1++)
		{
			for(int index2 = permuteList.size()- 1;index2>=0;index2--)
			{
				String currentString = permuteList.remove(index2);
				for (int index3 = 0;index3<=currentString.length();index3++)
				{
					permuteList.add(currentString.substring(0,index3) + word.charAt(index1)+currentString.substring(index3));
				}
					
			}
		}
		System.out.println(permuteList);
	}
	
	private static void findPermutationRecursively(String permuteWord ,String remainingWord)
	{
		if(remainingWord == null)
		{
			return;
		}
		if(remainingWord.length() ==0)
		{
			System.out.println(permuteWord);
		}
		for(int index1 =0; index1<remainingWord.length();index1++)
		{
			String newPermuteWord = permuteWord+remainingWord.charAt(index1);
			String newRemainingWord = remainingWord.substring(0,index1)+ remainingWord.substring(index1+1);
			findPermutationRecursively(newPermuteWord,newRemainingWord);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String word = scanner.next();
		System.out.println("The permutation obtained through iterative approach -->");
		findPermutationIteratively(word);
		System.out.println("The permutation obtained through recursive approach -->");
		findPermutationRecursively(" ",word);
	}
}

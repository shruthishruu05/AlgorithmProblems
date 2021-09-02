package com.bridgelabz.algorithmproblems;
import java.util.ArrayList;
import java.util.Scanner;
public class BinarySearch<T extends Comparable <T>>
{
	private int binarySearch(ArrayList<T> array,int lowerIndex,int upperIndex,T searchValue)
	{
		if(upperIndex>=lowerIndex)
		{
			int midIndex = lowerIndex+ (upperIndex- lowerIndex )/2;
			if(array.get(midIndex).equals(searchValue))
			{
				return midIndex;
			}
			if(array.get(midIndex).compareTo(searchValue)>0)
			{
				return binarySearch(array, midIndex+1, upperIndex, searchValue);
			}
				return binarySearch(array, lowerIndex, midIndex-1, searchValue);

		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Binary search program");
		Scanner scanner = new Scanner(System.in);
		BinarySearch<Integer> searchObject = new BinarySearch<Integer>();
		ArrayList<Integer> arrayToBeSearched = new ArrayList<Integer>();
		
		System.out.println("Enter the size of The Array");
		int sizeOfArray = scanner.nextInt();
		
		System.out.println("Enter Array Elements in sorted order to perform binary search");
		for (int index = 0; index < sizeOfArray; index++) {
			Integer word = scanner.nextInt();
			arrayToBeSearched.add(word);
		}

		System.out.println("Enter the element to be searched");
		Integer ElementToSearch = scanner.nextInt();
		scanner.close();
		
		System.out.println("The array is : " + arrayToBeSearched);
		int indexOfWord = searchObject.binarySearch(arrayToBeSearched, 0, sizeOfArray-1, ElementToSearch);
		System.out.println("Element " + ElementToSearch + " found at index: " + indexOfWord);

	}

}














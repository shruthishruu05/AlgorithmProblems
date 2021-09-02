package com.bridgelabz.algorithmproblems;

public class BinarySearch 
{
	private int binarySearch(int[] array,int lowerIndex,int upperIndex,int searchValue)
	{
		if(upperIndex>=lowerIndex)
		{
			int midIndex = lowerIndex+ (upperIndex- lowerIndex )/2;
			if(array[midIndex]==searchValue)
				return midIndex;
			
			if(array[midIndex]<searchValue)
				return binarySearch(array, midIndex+1, upperIndex, searchValue);
			if(array[midIndex]>searchValue)
				return binarySearch(array, lowerIndex, midIndex-1, searchValue);

		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Binary search program");
		int array[]= {5,8,11,16,20,25,30,44,50};
		int arrayLength = array.length;
		int searchValue = 8;
		BinarySearch binarySearchObject = new BinarySearch();
		int searchResult = binarySearchObject.binarySearch(array,0,arrayLength-1,searchValue);
		if(searchValue == -1)
			System.out.println("Value not found");
		else 
			System.out.println("value found at index  " +searchResult);
	}
}

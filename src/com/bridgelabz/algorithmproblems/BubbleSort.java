package com.bridgelabz.algorithmproblems;

import java.util.Scanner;

public class BubbleSort 
{
	private void printArray(int[] array,int sizeOfArray)
	{
		for(int index =0 ;index<sizeOfArray;index++)
		{
			System.out.println(array[index]);
		}	
	}
	private void bubbleSort(int[] array) 
	{
		
	        int sizeOfArray = array.length;
	        for (int index1 = 0; index1 < sizeOfArray-1; index1++)
	        {
	            for (int index2 = 0; index2 < sizeOfArray-index1-1; index2++)
	            {
	                if (array[index2] > array[index2+1])
	                {
	                    int temprory = array[index2];
	                    array[index2] = array[index2+1];
	                    array[index2+1] = temprory;
	                }
	            }
	        }
	        System.out.println("The sorted elements using bubble sort is");
	        printArray(array, sizeOfArray);
	 }
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BubbleSort sortObject = new BubbleSort();
		
		System.out.println("Enter the size of the array");
		int sizeOfArray = scanner.nextInt();
		int[] array = new int[sizeOfArray];
		
		System.out.println("Enter the array elements");
		for(int index =0 ; index < sizeOfArray; index++)
		{
			int arrayInputs = scanner.nextInt();
			array[index]= arrayInputs;
		}
		System.out.println("The entered array is ");
		sortObject.printArray(array,sizeOfArray);
		sortObject.bubbleSort(array);
	}	
}

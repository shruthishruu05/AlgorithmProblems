package com.bridgelabz.algorithmproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort<T extends Comparable <T>> 
{
	private void printArray(T[] array,int sizeOfArray)
	{
		for(int index =0 ;index<sizeOfArray;index++)
		{
			System.out.println(array[index]);
		}	
	}
	private void bubbleSort(T[] array) 
	{
		
	        int sizeOfArray = array.length;
	        for (int index1 = 0; index1 < sizeOfArray-1; index1++)
	        {
	            for (int index2 = 0; index2 < sizeOfArray-index1-1; index2++)
	            {
	                if (array[index2].compareTo(array[index2+1])>0)
	                {
	                    T temprory = array[index2];
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
		BubbleSort<Integer> sortObject = new BubbleSort<Integer>();
		
		System.out.println("Enter the size of the array");
		int sizeOfArray = scanner.nextInt();
		Integer[] array = new Integer[sizeOfArray];
		
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

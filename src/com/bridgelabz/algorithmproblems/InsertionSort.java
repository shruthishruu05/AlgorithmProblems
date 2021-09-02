package com.bridgelabz.algorithmproblems;

import java.util.Scanner;

public class InsertionSort {
	
	private void printArray(int[] array,int sizeOfArray)
	{
		for(int index =0 ;index<sizeOfArray;index++)
		{
			System.out.println(array[index]);
		}	
	}
	public void insertionSort(int[] array) {

		int sizeOfArray = array.length;
		for (int index = 1; index < sizeOfArray; ++index) {
			int current = array[index];
			int previousIndex = index - 1;

			while (previousIndex >= 0 && array[previousIndex]>current) {
				array[previousIndex + 1] = array[previousIndex];
				previousIndex = previousIndex - 1;
			}
			array[previousIndex + 1] = current;
		}
		System.out.println("The sorted array is ");
		printArray(array,sizeOfArray);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		InsertionSort sortObject = new InsertionSort();
		
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
		sortObject.insertionSort(array);
	}	
}

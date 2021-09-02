package com.bridgelabz.algorithmproblems;

import java.util.Scanner;
import java.lang.String;

public class InsertionSort<T extends Comparable <T>> {
	
	private void printArray(T[] array,int sizeOfArray)
	{
		for(int index =0 ;index<sizeOfArray;index++)
		{
			System.out.println(array[index]);
		}	
	}
	public void insertionSort(T[] array) {

		int sizeOfArray = array.length;
		for (int index = 1; index < sizeOfArray; ++index) {
			T current = array[index];
			int previousIndex = index - 1;
			
			while (previousIndex >= 0 && array[previousIndex].compareTo(current)>0) {
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
		InsertionSort<String> sortObject = new InsertionSort<String>();
		
		System.out.println("Enter the size of the array");
		int sizeOfArray = scanner.nextInt();
		String[] array = new String[sizeOfArray];
		
		System.out.println("Enter the array elements");
		for(int index =0 ; index < sizeOfArray; index++)
		{
			String arrayInputs = scanner.next();
			array[index]= arrayInputs;
		}
		System.out.println("The entered array is ");
		sortObject.printArray(array,sizeOfArray);
		sortObject.insertionSort(array);
	}	
}

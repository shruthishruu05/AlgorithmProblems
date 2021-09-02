package com.bridgelabz.algorithmproblems;

import java.util.*;

public class MergeSort<E extends Comparable <E>> 
{
		public void printArray(E[] array)
		{
			int sizeOfArray = array.length;
			for (int index = 0; index < sizeOfArray; index++)
			{
				System.out.print(array[index] + " ");
			}
		}
		void merge( E array[], int left, int middle, int right) 
		{

		int sizeOfLeft = middle - left + 1;
		int sizeOfRight = right - middle;

		E[] leftArray = (E[]) new Comparable[sizeOfLeft];
		E[] rightArray = (E[]) new Comparable[sizeOfLeft];

		for (int leftIndex = 0; leftIndex < sizeOfLeft; leftIndex++)
			leftArray[leftIndex] = array[left + leftIndex];

		for (int rightIndex = 0; rightIndex < sizeOfRight; rightIndex++)
			rightArray[rightIndex] = array[middle + 1 + rightIndex];

		int index1 = 0, index2 = 0;
		int sortedindex = left;

		while (index1 < sizeOfLeft && index2 < sizeOfRight) {
			if (leftArray[index1].compareTo(rightArray[index2]) <= 0) {
				array[sortedindex] = leftArray[index1];
				index1++;
			} else {
				array[sortedindex] = rightArray[index2];
				index2++;
			}
			sortedindex++;
		}

		while (index1 < sizeOfLeft) {
			array[sortedindex] = leftArray[index1];
			index1++;
			sortedindex++;
		}

		while (index2 < sizeOfRight) {
			array[sortedindex] = rightArray[index2];
			index2++;
			sortedindex++;
		}
	}

	
	void mergeSort(E array[], int left, int right) {
		if (left < right) {

			int middle = left + (right - left) / 2;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}

	}

	public static void main(String[] args) {

		MergeSort<String> sortObject = new MergeSort<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of words: ");
		int sizeOfArray = scanner.nextInt();
		String[] array = new String[sizeOfArray];

		System.out.println("Enter the number of words to perform sorting");
		for (int index = 0; index < sizeOfArray; index++) {
			String word = scanner.next();
			array[index] = word;
		}

		System.out.println("The array of words");
		sortObject.printArray(array);
		sortObject.mergeSort(array, 0, sizeOfArray - 1);

		System.out.println("The sorted array of words is");
		sortObject.printArray(array);

	}
}

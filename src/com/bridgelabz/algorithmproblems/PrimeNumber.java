package com.bridgelabz.algorithmproblems;
import java.util.*;
public class PrimeNumber 
{
	public static void checkForPrime(int lowerBound,int upperBound)
	{
		int index1, index2,flag;
		boolean prime = true;
		for (index1 = lowerBound; index1 <= upperBound; index1++) 
		{

			if (index1 == 1 ||index1 == 0)
				continue;
			flag =1;
	
			for (index2 = 2; index2 <= index1 / 2; ++index2) 
			{
				if (index1 % index2 == 0) {
					flag =0;
					break;
				}
			}
			if(flag ==1)
				System.out.println(index1);
		}
		
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int lowerBound,upperBound;
		
		System.out.printf("Enter lower bound of the interval: ");
		lowerBound = scanner.nextInt();

		System.out.printf("\nEnter upper bound of the interval: ");
		upperBound = scanner.nextInt(); 
		
		 checkForPrime(lowerBound,upperBound);
	}
}
	

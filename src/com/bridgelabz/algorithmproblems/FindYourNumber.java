package com.bridgelabz.algorithmproblems;
import java.util.Scanner;
public class FindYourNumber {
static Scanner scanner = new Scanner(System.in);
	public void findNumber(int low, int high) {
		
		int choice;
		int middle = (low+high)/2;
		if(low == high) {
			System.out.println("then middle value will be your number which is " +middle  );
			return;
		}
		System.out.println("select choice 1 if the  number is between : "+low+" and "+middle+ "or any other choice,might be present between" +(middle+1)+" and "+high);
		choice = scanner.nextInt();
		if(choice == 1) {
			findNumber(low, middle);
		}
		else {
			findNumber(middle+1, high);
		}
	}
	
	public static void main(String[] args) {
		
		FindYourNumber object = new FindYourNumber();
		int number = Integer.parseInt(args[0]);
		object.findNumber(0, number-1);
		scanner.close();

	}
}


		
	
	
	



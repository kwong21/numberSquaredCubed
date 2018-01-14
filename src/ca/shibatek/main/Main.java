package ca.shibatek.main;

import java.util.Scanner;

public class Main {
	private static final int MODIFIER = 2;
	private static String border = "------------------------------";
	
	public static void main(String[] args) {
		int number = 0, square = 0, cube = 0;
		int sumNumber = 0 , sumSquare = 0, sumCube = 0;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Upper limit: ");
		int upperLimit = reader.nextInt();
		
		System.out.printf("%8s %8s %8s\n", "number", "squared", "cubed");
		System.out.println(border);
		
		while (number <= upperLimit)
		{
			sumNumber += number;
			sumSquare += square;
			sumCube += cube;
			
			System.out.printf("%8s %8s %8s\n", number, square, cube);
			
			number += MODIFIER;
			square = number * number;
			cube = number * number * number;
			
		}
		
		System.out.println(border);
		System.out.printf("%8s %8s %8s\n", sumNumber, sumSquare, sumCube);
		
		reader.close();
	}

}

package learning.java.core.day3;

import java.util.Scanner;

/**
 * Reverse a String
 * @author Lohith.Samaga
 *
 */
public class PrintOddNumbers {

	public PrintOddNumbers() {
		
	}
	
	public void printOddNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("J001");
		int start = sc.nextInt();
		System.out.println("J002");
		int end = sc.nextInt();
		System.out.println("J003");
		sc.close();
		System.out.println("J004");

		for(int i = start; i <= end; i++) {
			if (i %2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		PrintOddNumbers p = new PrintOddNumbers();
		p.printOddNumbers();
	}
	
 }

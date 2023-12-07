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
	
	private void printEvenNumbers(int start, int end) {
		for(int i = start; i <= end; i++) {
			if (i %2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		PrintOddNumbers p = new PrintOddNumbers();
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		p.printEvenNumbers(start, end);
		sc.close();
	}
	
 }

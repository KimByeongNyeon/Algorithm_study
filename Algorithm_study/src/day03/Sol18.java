package day03;

import java.util.Scanner;

public class Sol18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String input = sc.next();
		int index = sc.nextInt();
		
		System.out.println(input.charAt(index - 1));
	}
}

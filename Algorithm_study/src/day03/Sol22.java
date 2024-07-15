package day03;

import java.util.Scanner;

public class Sol22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int input = sc.nextInt();
		String str = sc.next();
		for(int i = 0;  i < input; i++) {
			char arr = str.charAt(i);
			
			int result = Character.getNumericValue(arr);
			sum += result;
		}
		System.out.println(sum);
	}
}

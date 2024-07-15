package day02;

import java.util.Scanner;


public class Sol15 {
	public static void main(String[] args) {

		int[] arr = new int[31];

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 29; i++) {
			int input = sc.nextInt();

			arr[input] = 1;

		}
		

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != 1) {
				System.out.println(j);
			}
		}
		sc.close();
	}
}

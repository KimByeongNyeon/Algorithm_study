package day02;

import java.util.Scanner;

public class Sol13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int M = sc.nextInt();
		
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		
		
		for(int i = 0; i < M; i++) {
			input1 = sc.nextInt();
			input2 = sc.nextInt();
			input3 = sc.nextInt();
			
			for(int j = input1 - 1; j < input2; j++) {
				arr[j] = input3;
			}
			
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}

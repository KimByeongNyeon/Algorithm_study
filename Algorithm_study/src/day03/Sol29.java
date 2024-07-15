package day03;

import java.util.Scanner;

public class Sol29 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[] {1, 1, 2, 2, 2, 8};
		int[] temp = new int[6];
		
		for(int i = 0; i < 6; i++) {
			temp[i] = sc.nextInt();
			int result = input[i] - temp[i];
			
			System.out.print(result + " ");
		}
	}
}

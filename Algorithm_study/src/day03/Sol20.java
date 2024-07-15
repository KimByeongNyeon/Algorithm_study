package day03;

import java.util.Scanner;

public class Sol20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		String[] arr = new String[input];
		for(int i=0; i < input; i++) {
			arr[i] = sc.next();
			System.out.print(arr[i].charAt(0));
			System.out.println(arr[i].charAt(arr[i].length()-1));
		}
	}
}

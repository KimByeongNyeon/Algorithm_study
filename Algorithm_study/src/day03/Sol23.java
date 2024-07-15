package day03;

import java.util.Scanner;

public class Sol23 {
	public static void main(String[] args) {
		int[] arr = new int[26];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String input = sc.next();
		
		for(int i = 0; i < input.length(); i++) {
			char result = input.charAt(i);
			if(arr[result - 'a'] == -1) {
				arr[result - 'a'] = i;
			}
		}
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
	}
}

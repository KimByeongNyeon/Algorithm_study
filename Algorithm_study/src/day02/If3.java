package day02;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 10 != 0)||(year % 400 == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}		
	}
}

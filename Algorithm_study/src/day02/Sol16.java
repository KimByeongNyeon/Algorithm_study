package day02;

import java.util.Scanner;

public class Sol16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean [] a = new boolean[42];
		int cnt = 0;

		for (int i = 0; i < 10; i++) {
			int input = sc.nextInt();
			a[input % 42] = true;
		}
			cnt = 0;
			for(boolean value : a) {
				if(value) {
					cnt ++;
				}
			}

		

		System.out.println(cnt);
	}
}

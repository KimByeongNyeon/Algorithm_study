package day03;

import java.util.Scanner;

public class Sol24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=0; i < num; i++) {
			int input1 = sc.nextInt();
			String input2 = sc.next();
			
			for(int j = 0; j < input2.length(); j++) {
				for(int k = 0; k < input1; k++ ) {
					// ��ø for������, j���� �ε����� �ش��ϴ� ���� k�� �ݺ� �ϱ� ����
					System.out.print(input2.charAt(j));
				}
			}
			System.out.println();
		}
				
	}
}

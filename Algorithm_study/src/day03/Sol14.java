package day03;

import java.util.Scanner;

public class Sol14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// N, M, temp ��  �ʱ�ȭ
		int N = 0;
		int M = 0;
		int temp = 0;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		// N ���� ũ�⸦ ���� �迭 ����
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			//arr�� �� �Ҵ�
			arr[i] = i + 1;
		}
		for (int j = 0; j < M; j++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			
			// �񱳸� ���� temp ����
			temp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = temp;
			
		}
		sc.close();
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}

package day03;

import java.util.Scanner;

public class Sol14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// N, M, temp 값  초기화
		int N = 0;
		int M = 0;
		int temp = 0;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		// N 값의 크기를 갖는 배열 생성
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			//arr에 값 할당
			arr[i] = i + 1;
		}
		for (int j = 0; j < M; j++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			
			// 비교를 위해 temp 생성
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

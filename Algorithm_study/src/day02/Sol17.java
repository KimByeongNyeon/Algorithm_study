package day02;

import java.util.Scanner;

public class Sol17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 개수, 줄 입력 값 생성
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// N만큼의 값을 갖는 배열 생성
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			//배열은 0부터 시작하므로 index에 해당하는 i 의 값에 1을 더해 주고 배열 값 초기화
			arr[i] = i + 1;
		}
		for (int i = 0; i < M; i++) {
			// 배열은 0 부터 시작하기 때문에 I, J 의 값은 1을 빼줘야 함
			int I = sc.nextInt() - 1;
			int J = sc.nextInt() - 1;
			
			while(I < J) {
				// 출력을 위한 int 값 설정 arr[I] 해당하는 값 설ㅈㅇ
				int temp = arr[I];
				
				//arr의 1을 더한 값을 arr[J] 에 저장 (왼쪽의 값, 오른쪽의 값 설정)
				arr[I++] = arr[J];
				arr[J--] = temp;
			}

		}
		sc.close();
		// 향상된 for문을 통해 간결하게 arr의 값을 result에 저장
		for(int result : arr) {
			System.out.print(result + " ");
		}
	}
}

package day02;

import java.util.Scanner;

public class Sol17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����, �� �Է� �� ����
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// N��ŭ�� ���� ���� �迭 ����
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			//�迭�� 0���� �����ϹǷ� index�� �ش��ϴ� i �� ���� 1�� ���� �ְ� �迭 �� �ʱ�ȭ
			arr[i] = i + 1;
		}
		for (int i = 0; i < M; i++) {
			// �迭�� 0 ���� �����ϱ� ������ I, J �� ���� 1�� ����� ��
			int I = sc.nextInt() - 1;
			int J = sc.nextInt() - 1;
			
			while(I < J) {
				// ����� ���� int �� ���� arr[I] �ش��ϴ� �� ������
				int temp = arr[I];
				
				//arr�� 1�� ���� ���� arr[J] �� ���� (������ ��, �������� �� ����)
				arr[I++] = arr[J];
				arr[J--] = temp;
			}

		}
		sc.close();
		// ���� for���� ���� �����ϰ� arr�� ���� result�� ����
		for(int result : arr) {
			System.out.print(result + " ");
		}
	}
}

package ABC_124.C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();

		int A = 0;
		int B = 0;

		for (int i = 0; i < arr.length; i++) {
			//i�Ԗڂ̗v�f�������ł���A����i�������ł���ꍇ�ƁA
			//i�Ԗڂ̗v�f����ł���A����i����ł���ꍇ
			if (arr[i] == '0' ^ i % 2 == 0) {
				A++;
			//i�Ԗڂ̗v�f�������ł���Ai����ł���ꍇ�A
			//i�Ԗڂ̗v�f����ł���Ai�������̏ꍇ
			} else {
				B++;
			}
		}
		//����������...�ior ����������...)�ƂȂ�g�����͏�L��2�p�^�[���B
		//���Ȃ��񐔂Ŏ����ł�����̒l���o��
		System.out.println(Math.min(A, B));

	}
}

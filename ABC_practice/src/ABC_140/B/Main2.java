package ABC_140.B;

import java.util.Scanner;

//自分の提出した解放よりもシンプルに記述できたので写経

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				sum += d[i] * d[j];
			}
		}
		System.out.println(sum);
	}
}

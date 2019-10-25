package ABC_124.C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();

		int A = 0;
		int B = 0;

		for (int i = 0; i < arr.length; i++) {
			//i番目の要素が偶数であり、かつiが偶数である場合と、
			//i番目の要素が奇数であり、かつiが奇数である場合
			if (arr[i] == '0' ^ i % 2 == 0) {
				A++;
			//i番目の要素が偶数であり、iが奇数である場合、
			//i番目の要素が奇数であり、iが偶数の場合
			} else {
				B++;
			}
		}
		//●○●○●...（or ○●○●○...)となる組合せは上記の2パターン。
		//少ない回数で実現できる方の値を出力
		System.out.println(Math.min(A, B));

	}
}

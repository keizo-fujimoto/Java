
package step09;

import java.util.Scanner;

public class TEST {

	//製品AYAXは部品Aが5個、部品Bが2個、部品Cが7個で1個製造できます。
	int AYAX[] = { 5, 2, 7 };
	{
		for (int m = 0; m < AYAX.length; m++) {
		}
	}
	//A.B.Cの個数が必要・最大製造数・部品の構成数、残りの部品名称と数

	/*
			public static int nouhin(int j, int k, int l) {
				System.out.println("A部品の納品数を入力してください");
				Scanner stdIn = new Scanner(System.in);
				int ain = stdIn.nextInt();
				System.out.println("B部品の納入数を入力してください");
				int bin = stdIn.nextInt();
				System.out.println("C部品の納品数を入力してください");
				int cin = stdIn.nextInt();

				nouhin(j, k, l);
				j = ain / 5 - 1;
				k = bin / 2 - 1;
				l = cin / 7 - 1;
				System.out.println(nouhin(j, k, l));
				return nouhin(j, k, l);
			}
			*/

	public static void main(String[] args) {

		nouhin();

	}

	private static void nouhin() {
		//	数値の入力（A/B/C)

		//Aの在庫が増える（在庫に加算）
		//B"
		//C";
		System.out.println("A部品の納品数を入力してください");
		Scanner stdIn = new Scanner(System.in);
		int ain = stdIn.nextInt();
		System.out.println("B部品の納入数を入力してください");
		int bin = stdIn.nextInt();
		System.out.println("C部品の納品数を入力してください");
		int cin = stdIn.nextInt();
		int a = ain / 5;
		int b = bin / 2;
		int c = cin / 7;

		//		System.out.println("A部品" + a + "個");
		//		System.out.println("B部品" + b + "個");
		//		System.out.println("C部品" + c + "個");

		make(a, b, c, ain, bin, cin);
	}

	private static void make(int a, int b, int c, int ain, int bin, int cin) {
		//・製造機能AYAXが何個作れるかを表示して
		//公約数を求める
		//	最大の製造数がわかる表示
		//製造したら消費される。
		//AYAXは増える
		int[] array = { a, b, c };
		//incArray(array);
		int min = 501;
		for (int i : array) {

			for (i = 0; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];

				}
			}

		}
		print(a, b, c, min, ain, bin, cin);
	}

	private static void print(int a, int b, int c, int min, int ain, int bin, int cin) {
		//		・表示
		//		製造個数を出す
		//割り算にするべき。引数の呼び出しには公約数と製造数を返す
		//		あまりを出す
		System.out.println("製造数=" + (min + "個"));
		System.out.println("A部品残り:" + (ain - min * 5));
		System.out.println("B部品残り:" + (bin - min * 2));
		System.out.println("C部品残り:" + (cin - min * 7));
	}

}

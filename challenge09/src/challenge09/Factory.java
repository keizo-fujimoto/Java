package challenge09;

import java.util.Scanner;

public class Factory {
	static int ain;
	static int bin;
	static int cin;
//	static int a;
//	static int b;
//	static int c;
	static int min;
	//製品AYAXは部品Aが5個、部品Bが2個、部品Cが7個で1個製造できます。
	//int AYAX[] = { 5, 2, 7 };
//	{
//		for (int m = 0; m < AYAX.length; m++) {
//		}
//	}
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
		make();
		print();
		//変数の持ち回り

	}

	private static void nouhin() {
		//	数値の入力（A/B/C)
		//Aの在庫が増える（在庫に加算）
		//B"
		//C";
		System.out.println("A部品の納品数を入力してください");
		Scanner stdIn = new Scanner(System.in);
		ain = stdIn.nextInt();
		System.out.println("B部品の納入数を入力してください");
		bin = stdIn.nextInt();
		System.out.println("C部品の納品数を入力してください");
		cin = stdIn.nextInt();


		//		System.out.println("A部品" + a + "個");
		//		System.out.println("B部品" + b + "個");
		//		System.out.println("C部品" + c + "個");

	}

	private static void make() {
		//・製造機能AYAXが何個作れるかを表示して
		//公約数を求める
		//	最大の製造数がわかる表示
		//製造したら消費される。
		//AYAXは増える
		//ABCをここでだすともちまわる
		int [] array = new int [3];
		array[0] = ain / 5;
		array[1] = bin / 2;
		array[2] = cin / 7;


		//incArray(array);
		min = 501;
		for (int i : array) {

			for (i = 0; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];

				}
			}

		}

	}

	private static void print() {
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
/*
			//AYAXはAが5 Bが2 Cが7個にて作成が可能
			//AYAXはAが5 Bが2 Cが7個にて作成が可能
			//製品AYAXは部品Aが5個、部品Bが2個、部品Cが7個で1個製造できます。
			//スキャナーABCを入力させる
			//仕入先から納品される、部品A、部品B、部品Cの個数を入力してください。（10～500までの数字を入力）
			//製品AYAXを最大数製造してください。
			//製造した製品AYAXの数と残り部品の個数を表示してください。
}
	//製品AYAXは部品Aが5個、部品Bが2個、部品Cが7個で1個製造できます。
	//スキャナーABCを入力させる
	//仕入先から納品される、部品A、部品B、部品Cの個数を入力してください。（10～500までの数字を入力）
	//製品AYAXを最大数製造してください。
	//製造した製品AYAXの数と残り部品の個数を表示してください。
*/
//12/13

package challenge10;

import java.util.Scanner;

public class Jidouhannbaiki {

	int コーヒー = 150; int お茶 =110; int 炭酸飲料 =120;
	public static void main(String[] args) {
//		自動販売機の処理をプログラム化します。自動販売機には次の商品が入っています。

		System.out.println("1.　コーヒ-");
		System.out.println("2.　お茶");
		System.out.println("3.　炭酸飲料");
		System.out.println("-------------");
		Scanner stdIn = new Scanner(System.in);

		for (;;) {
			int z = stdIn.nextInt();
			if (z == 99) {
				break;
				System.out.println();//（1.　コーヒー＋在庫）2本
				System.out.println();//(２．お茶　　　+1本　)
				System.out.println();//(３．炭酸飲料　+3本　　)

		//
//				売上：1130円
			}

		Syouhin syouhin = new Syouhin();
		System.out.println();

//		public class Jihanki{
//			String syouhin;
//			int price;
//			int inventory
//		}




//		public static void
//			static String お茶;
//			static String コーヒー;
//			static String 炭酸飲料;

//			int [] price = new int [] { 150, 110,  120};


//			String [] shouhin = new String [] {コーヒー,お茶,炭酸飲料};


		}
//		コーヒー
//		150円
//		5本
//		お茶
//		110円
//		5本
//		炭酸飲料
//		120円
//		5本



//		商品
//		金額
//		数

//		販売はコンソールに商品を表示して対応する番号を入力してもらいます。
		//Scanner stdIn = new Scanner(System.in);
		//int syouhinn = stdIn.nextInt();


//		アンサー
//		1.コーヒー int 1. = 1. + コーヒー
//		2.お茶		int2. = 2. + お茶
//		3.炭酸飲料	int3. = 3. + 炭酸飲料
//		表示例
//
//
//
//
//		アンサー
//		1．コーヒー
//		2．お茶
//		3．炭酸飲料
//		-------------
//
//		もし売り切れなら商品を表示しないようにします。コーヒーが売り切れた場合の例です。
//
//		表示例
//
// zaiko = zaiko = stdIn
// zaiko = zaiko = stdIn
// zaiko = zaiko - stdIn
// この考えだと表示しないのが難しい
//
//		Java
//
//		1
//		2
//		3
//		２．お茶
//		３．炭酸飲料
//		-------------
//
//		99を入力するとプログラム終了です。その際に商品毎の残数と合計売上高を表示します。表示例です。
//
//		表示例
//
//
//
//
//
//		Java
//
//		1
//		2
//		3
//		4
//		5
//		１．コーヒー　2本　
//		２．お茶　　　1本　
//		３．炭酸飲料　3本　　
//
//		売上：1130円



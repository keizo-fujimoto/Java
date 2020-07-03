package challenge10;

public class Jidouhannbaiki {

	public static void main(String[] args) {

		//入力した数値input
		java.util.Scanner input = new java.util.Scanner(System.in);
		//商品
		String name = "コーヒー";
		int price = 150;
		String name1 = "お茶";
		int price1 = 110;
		String name2 = "炭酸飲料";
		int price2 = 120;
		//合計金額を覚えておく変数の準備。初期値は０円に設定。
		int total = 0;
		//繰り返し 14章
		do {
			//商品一覧を表示する
			System.out.println("1." + name);
			System.out.println("2." + name1);
			System.out.println("3." + name2);
			System.out.println("-------------");

			//選ぶやつも14章のselect
			int select = input.nextInt();
			//もし99の値を入れたら終了する
			if (select == 99) {

				break;
			}
			//商品が売れる
			switch (select) {
			case 1: {
				//売上計算。売上合計変数:totalに今回の売上をプラスして更新させます。
				total = total + price;
			}
				break;
			case 2: {

				total = total + price1;
			}
				break;
			case 3: {

				total = total + price2;
			}
			}

		} while (true);
		//売上
		System.out.println("売上:" + total);
	}

}
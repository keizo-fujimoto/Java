package challenge11;

public class Ad {

		// 商品の名前

		//車種
		String name;
		//燃費
		int fuel;
		//乗車人数
		int passengers;
		//金額
		int price;
		//エアコン有無
		String ac;

		//コンストラクタ（複数の情報を取り込んで設定）

		//name 商品名
		//price金額
		//stock在庫
		Ad(String name, int price,int fuel, int passengers,  String ac) {
			this.name = name;
			this.price = price;
			this.fuel = fuel;
			this.passengers = passengers;
			this.ac = ac;

		//}

		//public Ad(String string, int i, int j, int k, int l, String string2) {
			// TODO 自動生成されたコンストラクター・スタブ
		}

}
	//ゲッターとセッター
	//在庫をこっちに持ってくる
	//クラスを使用して作成してから



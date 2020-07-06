package challenge10;

public class Item {
	// 商品の名前
	String name;
	//金額
	int price;
	//在庫
	int stock;

	//コンストラクタ（複数の情報を取り込んで設定）

	//name 商品名
	//price金額
	//stock在庫
	Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;

	}
}
//ゲッターとセッター
//在庫をこっちに持ってくる
//クラスを使用して作成してから

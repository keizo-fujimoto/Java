package Vender;

public class Item {
	/**
	 * 商品の名前
	 */
	String name;
	
	/**
	 *商品の単価
	 */
	int price;
	
	/**
	 *商品の在庫数を実装
	 */
	int stock;
	
	/**
	 * 商品のコンストラクタ（複数の情報を取り込んで仕事をする設定に変更）
	 * これにより、商品名と価格をコンパクトにまとめることが可能となった。
	 * @param name 記録する商品名
	 * @param price 記録する金額
	 * @param stock 販売開始時の在庫数
	 */
	Item(String name, int price, int stock){
		this.name = name;
		this.price = price;
		this.stock = stock;
		
	}
}
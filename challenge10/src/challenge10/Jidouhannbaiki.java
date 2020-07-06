package challenge10;

public class Jidouhannbaiki {
	/**
	 * プログラムのメインメソッド。ここから始まる。
	 * @param args　起動時引数
	 */
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		//商品情報を覚えておくところ（変数）の準備
		Item[] items = prepareItems();
		//購入金額　初期値は0。
		int total = 0;
		//繰り返し
		do {
			//商品一覧を表示
			showMenu(items);
			System.out.println("-------------");
			//入力値（商品番号:select）
			int select = input.nextInt();

			//99終了
			if (select == 99) {
				//在庫を表示させる
				showZaiko(items);
				System.out.println();
				break;
				//普通の入力値（1-3）
			} else {
				select = select - 1;
			}
			//番号の商品販売
			if (!canSell(items, select)) {
				continue;
			}
			//販売したら売上計上
			total += sell(items, select);
			//在庫が１個減る
			items[select].stock--;
			//商品が売り切れているかをチェック

		} while (true);
		//自動販売機、終了
		showEndMessage(total, items);
	}

	public static void showEndMessage(int total, Item[] a) {
		//売上表示
		System.out.println("売上:" + total + "円");
	}

	public static int sell(Item[] items, int select) {
		//商品が売れる、売り上げが増える
		System.out.println();
		//売り上げの計算totalに計上
		return items[select].price;
	}

	public static boolean canSell(Item[] items, int select) {

		if (items[select].stock > 0) {

		}
		return true;
	}

	//a は、商品一覧のデータが入っている配列

	public static void showMenu(Item[] a) {
		//商品一覧を表示
		for (int i = 0; i < a.length; i++) {
			//iをどうすればi+1にできるか？その場合totalにも＋１表記が必要 ※そもそもselectから1引けば1は0になる
			if (a[i].stock > 0) {
				System.out.println(a[i].name);//+ a[i].stock + "本"
			//商品が0より大きい場合のみ表示する
			}
		}
	}
	public static void showZaiko(Item[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].name+ a[i].stock + "本");
		}
	}
	public static Item[] prepareItems() {
		// 商品の準備(商品名,価格,在庫数)
		Item[] a = new Item[] {
				new Item("1. コーヒー", 150, 5),
				new Item("2. お茶", 110, 5),
				new Item("3. 炭酸水", 120, 5),
		};
		return a;
	}

}
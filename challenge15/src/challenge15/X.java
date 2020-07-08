package challenge15;

public class X {

	public static void main(String[] args) {
		int total = 0;
		int totalb = 0;
		int totalc = 0;
		List[] lists = prepareList();
		List[] listsb = prepareListb();
		List[] listsc = prepareListc();
		//				do {
		//					//商品一覧を表示
		//					//showLista(lista);

		//					//入力された番号の商品は販売可能か？
		//					if(!canSell(lista,select)) {
		//						continue;
		//					}
		//					//販売したら売上を計上
		////					total += sell(items,select);
		////					//在庫が１個減る
		////					items[select].stock--;
		////		      //商品が売り切れているかをチェック
		////						if(checkSoldout(items)) {
		////							break;
		//						}
		////				}while(true);

		////				showEndMessage(total);

		//NumberFormat nfNum = NumberFormat.getNumberInstance();
		do {
			showMenu(lists);
			System.out.println("-------------");
			showEndMessage(total);
			System.out.println();

			showMenu(listsb);
			System.out.println("-------------");
			showEndMessageb(totalb);
			System.out.println();

			showMenu(listsc);
			System.out.println("-------------");
			showEndMessageb(totalc);
			System.out.println();
		} while (true);

	}

	//tal += sell(items, select);
	private static void showEndMessage() {
		// TODO 自動生成されたメソッド・スタブ

	}

	private static void showEndMessage(int total) {
		//売上表示
		System.out.println("合計:" + total);
		System.out.println("資金残高:" + total);
		System.out.println("手数料:" + total);
	}

	private static void showEndMessageb(int totalb) {
		//売上表示
		System.out.println("合計:" + totalb);
		System.out.println("資金残高:" + totalb);
		System.out.println("手数料:" + totalb);
	}

	private static void showEndMessagec(int totalc) {
		//売上表示
		System.out.println("合計:" + totalc);
		System.out.println("資金残高:" + totalc);
		System.out.println("手数料:" + totalc);
	}
	//			private static int sell(List[] items, int select) {
	//				//商品が売れる、売り上げが増える
	//				System.out.println();
	//				//売り上げの計算totalに計上
	//				return items[select].price;
	//			}
	//
	//				public static void showEndMessage(int total) {
	//					System.out.println("本日の営業を終了します♪ ( ◠‿◠ )");
	//					System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	//					//売上表示
	//					System.out.println("今回の売上合計は" + total + "円でした！お疲れサマー！");
	//				}

	private static void showMenu(List[] a, List[] b, List[] c) {
		//商品一覧を表示
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {

					System.out.println(a[i].goods + a[i].price);
					System.out.println(b[j].goods + b[j].price);
					System.out.println(c[k].goods + c[k].price);
					//private static void showMenub(List[] b) {

					//商品が0より大きい場合のみ表示する
				}
			}
		}
	}

	//商品一覧を表示

	//商品が0より大きい場合のみ表示する

	//ivate static void showMenuc(List[] c) {
	//商品一覧を表示

	//商品が0より大きい場合のみ表示する

	private static List[] prepareList() {
		// アイテムの準備(商品名,価格,在庫数)
		List[] a = new List[] {
				new List("【Cさん】", 0),
				new List("江戸時代の小判が入っている陶磁器：", 290, 000),
				new List("平安時代のきらびやかな陶磁器:", 14, 000),
				new List("明治時代の陶磁器:", 3, 000),
				new List("昭和時代の陶磁器:", 2, 400),
				new List("平成時代の陶磁器:", 1, 400),
		};
		return a;
	}

	//

	//		購入方法に沿って、購入可能リストから希望品の購入を行う
	//		得意先毎に購入報告を表示する。内容は物品名、金額、合計金額、資金残高、支払手数料合計とする。
	//		※金額はカンマ形式で表示
	//		Xの収入を得意先名、物品名、手数料で表示し、手数料合計額を最後に表示する。
	//		※金額はカンマ形式で表示、※手数料の多い順で表示する

	//		【Aさん】
	//		江戸時代の小判が入っている陶磁器:290,000
	//		平安時代のきらびやかな陶磁器:14,000
	//		明治時代の陶磁器:3,000
	//		昭和時代の陶磁器:2,400
	//		平成時代の陶磁器:1,400
	//		------------------------
	//		合計:310,800
	//		資金残高:689,200
	//		手数料:31,080

	//Aさんのクラス作成　陶磁器と値段をNewでリスト化してfor文で回す　
	//コンストラクトで表記してサム(インポート)で合計の　Money-sam 手数料（fee）＝total*0.1

	//
	//		【Bさん】
	//		安土桃山時代信長作の絵画:780,000
	//		平成時代の美咲さんが書いた絵画:10
	//		------------------------
	//		合計:780,010
	//		資金残高:19,990
	//		手数料:78,001
	//private static List[] prepareList() {
	// アイテムの準備(商品名,価格,在庫数)
	private static List[] prepareListb() {
		// アイテムの準備(商品名,価格,在庫数)
		List[] b = new List[] {
				new List("【Bさん】"),
				new List("安土桃山時代信長作の絵画：", 780, 000),
				new List("平成時代の美咲さんが書いた絵画:", 10),
		};
		return b;
	}

	//Bさんのクラス作成　絵画と値段をNewでリスト化してfor文で回す　
	//コンストラクトで表記してサム(インポート)で合計　Money-total　手数料はsam*0.1　fee　が必要

	//		【Cさん】
	//		日時計:48,000
	//		江戸時代の歯車式時計:12,000
	//		水時計:8,800
	//		デジタル式時計:1,250
	//		------------------------
	//		合計:70,050
	//		資金残高:229,950
	//		手数料:7,005
	//
	//Bさんのクラス作成　絵画と値段をNewでリスト化してfor文で回す　
	//コンストラクトで表記してサム(インポート)で合計　Money-total　手数料はsam*0.1　fee　が必要
	private static List[] prepareListc() {
		List[] c = new List[] {
				new List("【Cさん】", 0),
				new List("日時計：", 48, 000),
				new List("江戸時代の歯車式時計:", 12, 000),
				new List("水時計:", 8, 800),
				new List("デジタル式時計:", 1, 250),

		};
		return c;
	}
}
//A・B・Cのリストをがっちゃんこして、金額の高い順に並び替え（マージと同じ方法）

//		【収入】
//		Bさん 安土桃山時代信長作の絵画:78,000
//		Aさん 江戸時代の小判が入っている陶磁器:29,000
//		Cさん 日時計:4,800
//		Aさん 平安時代のきらびやかな陶磁器:1,400
//		Cさん 江戸時代の歯車式時計:1,200
//		Cさん 水時計:880
//		Aさん 明治時代の陶磁器:300
//		Aさん 昭和時代の陶磁器:240
//		Aさん 平成時代の陶磁器:140
//		Cさん デジタル式時計:125
//		Bさん 平成時代の美咲さんが書いた絵画:1
//		------------------------
//		合計:116,086

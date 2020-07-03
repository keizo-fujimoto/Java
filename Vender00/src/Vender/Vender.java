package Vender;
//
//
//
public class Vender {
//
	public static void main(String[] args) {
//
//
//				//入力した数値input
//				java.util.Scanner input = new java.util.Scanner(System.in);
//				//商品
//				String name = "コーヒー";
//				int price = 150;
//				String name1 = "お茶";
//				int price1 = 110;
//				String name2 ="炭酸飲料";
//				int price2 = 120;
//				//合計金額を覚えておく変数の準備。初期値は０円に設定。
//				int total = 0;
//				//繰り返し構文。購入をやめたいと言われるまで営業し続ける
//				do {
//					//商品一覧を表示する
//					System.out.println("1." + name );
//					System.out.println("2." + name1);
//					System.out.println("3." + name2);
//					System.out.println("-------------");
//
//					//今回の入力値をselectに記録
//					int select = input.nextInt();
//					//もし99の値を入れたら終了する
//					if(select == 99 ) {
//
//						break;
//					}
//					//商品が売れる
//					switch(select){
//						case 0:{
//							//売上計算。売上合計変数:totalに今回の売上をプラスして更新させます。
//							total = total + price;
//						}break;
//						case 1:{
//
//							total = total + price1;
//						}break;
//						case 2:{
//
//							total = total + price2;
//						}
//					}
//
//				}while(true);
//				//売上を表示する
//				System.out.println("売上:" + total );
//	}
//
//
//}

	 ShowStartMessage();
		// 読み取りinput
		java.util.Scanner input = new java.util.Scanner(System.in);
		//商品情報
		Item[] items = prepareItems();
		//購入金額
		int total = 0;
		//繰り返し
		do {
			//商品一覧を表示
			showMenu(items);
			//今回の入力値（商品番号:select）を記録
			int select = input.nextInt();
			//もしユーザがマイナスの値を入力した場合、閉店する。
			if(select == 99) {
				break;
			}
//入力された番号の商品は販売可能か？
			if(!canSell(items,select)) {
				continue;
			}
//販売したら売上を計上
			total += sell(items,select);
			//在庫が１個減る
			items[select].stock--;
      //商品が売り切れているかをチェック
				if(checkSoldout(items)) {
					break;
				}
		}while(true);
    //自動販売機、終了
		showEndMessage( total);
	}

		public static void showEndMessage(int total) {

			//売上表示
			System.out.println( + total );
			System.out.println("売上:" + total );
			System.out.println("売上:" + total );

		}

		/**
		 * すべての商品が売り切れているかどうかをチェックします。
		 * その結果をメインプログラムに教えてあげるため、voidをboolean(真偽)に変更。
		 * @param items　は、管理している商品の一覧です
		 * @return　売り切れている場合は true。まだ残っている場合は false とする。
		 */
		public static boolean checkSoldout(Item[] items) {
			//真偽値(boolean)で状態をチェックする
			boolean flag = false;
			//もし、商品在庫がいくつか残っていれば営業継続
			//全商品の在庫をチェックして在庫が残っていれば営業継続
			for( int i = 0; i < items.length; i++) {
				//もし、今チェック中の商品の在庫があるなら、フラグはtrueに
				if(items[i].stock > 0 ) {
					//在庫ありの商品を発見次第、即座に在庫探しは終了
					flag = true;
				}
			}
			//売った結果、それがラストワンだった時に販売終了にする。
			if(flag == false) {
				System.out.println("全商品が売り切れたので閉店します。お買い上げありがとうございました！");
				//売り切れ発見をレポートする。breakと同じく、以下のプログラムを実行せず、冒頭に戻ります。
				return true;
			}
			//売り切れじゃなかった
			return false;
		}

		/**
		 * 商品の情報処理を行い、今回の売り上げ金額を返します
		 * @param items　商品一覧
		 * @param select　選択された商品番号
		 * @return　売れた商品の単価
		 */
		public static int sell(Item[] items, int select) {
			//商品が売れる、売り上げが増える
			 ;
			//売り上げの計算（売り上げが増える）売り上げ合計変数:totalに今回の売上を計上し更新していく。
			return items[select].price ;
		}

		/**
		 * 選択された番号の商品が販売可能かどうかを判断して答えを出す。
		 * @param items　商品一覧
		 * @param select　選択番号
		 * @return　販売可能ならtrue
		 */
		public static boolean canSell(Item[] items, int select) {
			//もし変な番号を入力したら中断して、冒頭から再開したい処理を作成します。
			if( select > items.length ) {
				System.out.println();
				return false;
			}
			//在庫があれば売ってもいいという構文を作成。
			//裏を返せば、在庫なかったら売れません。
			if( items[select].stock > 0) {
				//ここは空欄でOK.
			}else {
				//在庫がなければ売らないよ
				System.out.println("在庫がなくなったので売れませんねん");
				//また冒頭から実行してね。
				return false;
			}
			return true;
		}

		/**
		 * 商品の一覧を表示して、選択を促します。
		 * @param a は、商品一覧のデータが入っている配列
		 */
		public static void showMenu(Item[] a) {
			//商品一覧を表示
			for(int i = 0; i<a.length; i++ ) {
				System.out.println(i+1+"."+ a[i].name );
			}

		}

		/**
		 * 自動販売機システムに使う商品の準備をします。
		 * @return　準備済みの商品一覧
		 */
	public static Item[] prepareItems() {
	// アイテムの準備(商品名,価格,在庫数)
		Item[]a = new Item[] {
				new Item(" コーヒー",150,5),
				new Item(" お茶",110,5),
				new Item(" 炭酸飲料",120,5)
		};
		return a;
	}

	private static void ShowStartMessage() {
//		System.out.println("1." + Items[0]);
//		System.out.println("2." + name1);
//		System.out.println("3." + name2);
//		System.out.println("-------------");
	}
}
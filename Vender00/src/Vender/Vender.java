package Vender;



public class Vender {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

				// 入力読み取り装置に準備(入力した数値を覚えておく変数名をinputにする)
				java.util.Scanner input = new java.util.Scanner(System.in);
				//商品情報を覚えておく変数の準備
				String name = "コーヒー";
				int price = 150;
				String name1 = "お茶";
				int price1 = 110;
				String name2 ="炭酸飲料";
				int price2 = 120;
				//合計金額を覚えておく変数の準備。初期値は０円に設定。
				int total = 0;
				//繰り返し構文。購入をやめたいと言われるまで営業し続ける
				do {
					//商品一覧を表示する
					System.out.println("1." + name  + price + "円です");
					System.out.println("2." + name1 + price1 + "円です");
					System.out.println("3." + name2 + price2 + "円です");
					//今回の入力値をselectに記録
					int select = input.nextInt();
					//もし99の値を入れたら終了する
					if(select == 99 ) {

						break;
					}
					//商品が売れる
					switch(select){
						case 0:{
							//売上計算。売上合計変数:totalに今回の売上をプラスして更新させます。
							total = total + price;
						}break;
						case 1:{

							total = total + price1;
						}break;
						case 2:{

							total = total + price2;
						}
					}

				}while(true);
				//売上を表示する
				System.out.println("売上:" + total );
	}


}




//package Vender;
//public class vender {
//
//
//	public static void main(String[] args) {
//		//自動販売機、開始
//    ShowStartMessage();
//		// 入力読み取り装置の準備（覚える変数名をinputにします）
//		java.util.Scanner input = new java.util.Scanner(System.in);
//		//商品情報を覚えておくところ（変数）の準備
//		Zaiko[] zaiko = preparzaiko();
//		//購入金額をおぼえるところの準備。初期値はもちろんゼロ。
//		int total = 0;
//		//繰り返し構文（やめたいと言われるまで）営業の開始
//		do {
//			//商品一覧を表示
//			//showMenu(zaiko);
//			//今回の入力値（商品番号:select）を記録
//			int select = input.nextInt();
//			//もしユーザがマイナスの値を入力した場合、閉店する。
//			if(select < 99) {
//				System.out.println("マイナスの値が入力されたので閉店しま〜す♪");
//				break;
//			}
////入力された番号の商品は販売可能か？
//			if(!canSell(zaiko,select)) {
//				continue;
//			}
////販売したら売上を計上
//			total += sell(zaiko,select);
//			//在庫が１個減る
//			zaiko[select].stock--;
//      //商品が売り切れているかをチェック
//				if(checkSoldout(zaiko)) {
//					break;
//				}
//		}while(true);
//    //自動販売機、終了
//		showEndMessage(total);
//	}
//
//		private static Zaiko[] preparzaiko() {
//	// TODO 自動生成されたメソッド・スタブ
//	return null;
//}
//
//		public static void showEndMessage(int total) {
//
//			//売上表示
//			System.out.println("売上；" + total + "円");
//		}
//
//
//		public static boolean checkSoldout(Zaiko[] zaiko) {
//			//真偽値(boolean)で状態をチェックする
//			boolean flag = false;
//			//もし、商品在庫がいくつか残っていれば営業継続
//			//全商品の在庫をチェックして在庫が残っていれば営業継続
//			for( int i = 0; i < zaiko.length; i++) {
//				//もし、今チェック中の商品の在庫があるなら、フラグはtrueに
//				if(zaiko[i].stock > 0 ) {
//					//在庫ありの商品を発見次第、即座に在庫探しは終了
//					flag = true;
//				}
//			}
//			//売った結果、それがラストワンだった時に販売終了にする。
//			if(flag == false) {
//				System.out.println("全商品が売り切れたので閉店します。お買い上げありがとうございました！");
//				//売り切れ発見をレポートする。breakと同じく、以下のプログラムを実行せず、冒頭に戻ります。
//				return true;
//			}
//			//売り切れじゃなかった
//			return false;
//		}
//
//
//		public static int sell(Zaiko[] zaiko, int select) {
//			//商品が売れる、売り上げが増える
//			//System.out.println( zaiko[select].name + "のお買い上げ、ありがとうございます！");
//			//売り上げの計算（売り上げが増える）売り上げ合計変数:totalに今回の売上を計上し更新していく。
//			return zaiko[select].price ;
//		}
//
//
//
//		public static boolean canSell(Zaiko[] zaiko, int select) {
//			//もし変な番号を入力したら中断して、冒頭から再開したい処理を作成します。
//			if( select > zaiko.length - 1) {
//				System.out.println("存在しない番号は入れちゃダメだぞ！");
//				System.out.println();
//				return false;
//			}
//			//在庫があれば売ってもいいという構文を作成。
//			//裏を返せば、在庫なかったら売れません。
//			if( zaiko[select].stock > 0) {
//				//ここは空欄でOK.
//			}else {
//				//在庫がなければ売らないよ
//				System.out.println("");
//				//また冒頭から実行してね。
//				return false;
//			}
//			return true;
//		}
//
////		/**
////		 * 商品の一覧を表示して、選択を促します。
////		 * @param a は、商品一覧のデータが入っている配列
////		 */
//		public static void showMenu(Zaiko[] a) {
//			System.out.println("番号で商品を選択してください");
//			//商品一覧を表示
//			for(int i = 0; i<a.length; i++ ) {
//				System.out.println(i + "番の商品は"
//						+ a[i].name + "で" + "価格は"
//						+ a[i].price + "円です。"
//						+ a[i].stock + "本残っているよ");
//			}
//			System.out.println("99入力で終了");
//		}
//
//		/**
//		 * 自動販売機システムに使う商品の準備をします。
//		 * @return　準備済みの商品一覧
//		 */
//	public static Zaiko[] prepareItems() {
//	// アイテムの準備(商品名,価格,在庫数)
//		Zaiko[]a = new Zaiko[] {
//				new Zaiko("コーヒー",150,5),
//				new Zaiko("お茶",110,5),
//				new Zaiko("炭酸飲料",120,5),
//
//		};
//		return a;
//
//	}
//	private static void ShowStartMessage() {
//		System.out.println("1. コーヒー");
//		System.out.println("2. お茶");
//		System.out.println("3. 炭酸飲料");
//	}
//}
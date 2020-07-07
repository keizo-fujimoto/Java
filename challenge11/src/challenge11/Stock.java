package challenge11;

public class Stock {

	public static void main(String[] args) {

		Ad[] Ads = prepareAds();
		showMenu(Ads);
		//		トラブルメーカー社は中古車販売を始めました。現在は3台のみで「軽自動車」、「ファミリーカー」の車種を扱っています。
		//		広告掲載として軽自動車は、車種名、燃費、乗員、金額、エアコン有無の5項目掲載します。
		//		ファミリーカーは、車種名、燃費、乗員、金額、排気量、自動運転有無の6項目表示します。
		//		この広告表示をプログラムで行ってください。
		//		また将来的には台数を増やしますし、スーパーカー、トラックなども取り扱う予定ですので、
		//		その際にプログラム修正が少なくすむように考慮してください。
	}

	public static void showMenu(Ad[] j) {
		//商品一覧を表示
		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i].name);
			System.out.println("金額："+j[i].price);
			System.out.println("燃費："+j[i].fuel);
			System.out.println("乗員："+j[i].passengers);
			System.out.println("エアコン"+j[i].ac);
			System.out.println();
		}
	}

	//
	//		現在保有車種
	//
	//		車種名：A
	//		種別：軽自動車
	//		燃費：22
	//		乗員：4
	//		金額：300000
	//		エアコン有無：有り
	//
	//		車種名：B
	//		種別：軽自動車
	//		燃費：23
	//		乗員：4
	//		金額：280000
	//		エアコン有無：無し
	//
	//		車種名：H
	//		種別：ファミリーカー
	//		燃費：18
	//		乗員：5
	//		金額：450000
	//		排気量：1000
	//		自動運転有無：有//@Override
	//
	//private static Item[] prepareItems() {
	// 商品の準備(商品名,価格,在庫数)

	//		広告表示例

	//		A
	//name

	//		金額：300000
	//price

	//		燃費：22
	//fuel

	//		乗員4
	//passengers

	//		エアコン：有り
	//		ac 有り
	//

	//		B
	//		金額：280000
	//		燃費：23
	//		乗員4
	//		エアコン：無し
	//
	//		H
	//		金額：450000
	//		燃費：18　
	//		乗員：5
	//		排気量：1000
	//		自動運転有無：有 @Override

	private static Ad[] prepareAds() {
		Ad[] j = new Ad[] {
				new Ad("A", 300000, 22, 4, "有り"),
				new Ad("B", 280000, 23, 4, "無し"),
				//new Ad("H", 450000, 18, 5, 1000, "有り"),
				// TODO 自動生成されたメソッド・スタブ
		};
		return j;
	}
}

package challenge11;

public class Stock {

	public static void main(String[] args) {

		Ad[] Ads = prepareAds();
		Ad[] Add = prepareAdd();
		showFlyer(Ads, Add);

		//		トラブルメーカー社は中古車販売を始めました。
		//現在は3台のみで「軽自動車」、「ファミリーカー」の車種を扱っています。
		//		広告掲載として軽自動車は、車種名、燃費、乗員、金額、エアコン有無の5項目掲載します。
		//		ファミリーカーは、車種名、燃費、乗員、金額、排気量、自動運転有無の6項目表示します。
		//		この広告表示をプログラムで行ってください。
		//		また将来的には台数を増やしますし、スーパーカー、トラックなども取り扱う予定ですので、
		//		その際にプログラム修正が少なくすむように考慮してください。
	}
	public static void showFlyer(Ad[] j, Ad[] k) {
		//商品一覧を表示
		for (int i = 0; i < j.length; i++) {
			for (int l = 0; l < k.length; l++) {
				if (j[i].ac != null) {
					System.out.println(j[i].name);
					System.out.println("金額：" + j[i].price);
					System.out.println("燃費：" + j[i].fuel + " " + "乗員" + j[i].passengers);
					System.out.println("エアコン：" + j[i].ac);
					System.out.println();
				} else {
					System.out.println(j[i].name);
					System.out.println("金額：" + j[i].price);
					System.out.println("燃費：" + j[i].fuel + " " + "乗員:" + j[i].passengers);
					System.out.println("排気量：" + k[l].exhaust);
					System.out.println("自動運転有無：" + k[l].selfdrive);
				}
			}
			//		@Override
			//		public static void
			//			System.out.println(j[i].name);
			//			System.out.println("金額："+j[i].price);
			//			System.out.println("燃費："+j[i].fuel+" "+"乗員："+j[i].passengers);
		}
	}
	private static Ad[] prepareAds() {
		Ad[] j = new Ad[] {
				new Ad("A", 300000, 22, 4, "有り"),
				new Ad("B", 280000, 23, 4, "無し"),
				new Ad("H", 450000, 18, 5, null),
				// TODO 自動生成されたメソッド・スタブ
		};
		return j;
	}
	private static Ad[] prepareAdd() {
		Ad[] k = new Ad[] {
				new Ad(1000, "有")
		};
		return k;
	}
}
//
//public static void showAd(Ad[] k) {
//	for (int l = 0; l < k.length; l++) {
//		System.out.println("排気量：" + k[l].exhaust);
//		System.out.println("自動運転有無：" + k[l].selfdrive);
//	}
//}
package challenge111;

public class Ad {
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
	//排気量
	int exhaust;
	//自動運転有無
	String selfdrive;

	//コンストラクタ
	Ad(String name, int price, int fuel, int passengers, String ac) {
		this.name = name;
		this.price = price;
		this.fuel = fuel;
		this.passengers = passengers;
		this.ac = ac;
	}
	Ad(String name, int price, int fuel, int passengers) {
		this.name = name;
		this.price = price;
		this.fuel = fuel;
		this.passengers = passengers;
	}
	//public Ad(String string, int i, int j, int k, int l, String string2) {
	// TODO 自動生成されたコンストラクター・スタブ

	Ad(int exhaust, String selfdrive) {
		this.exhaust = exhaust;
		this.selfdrive = selfdrive;
	}
}
//	public Ad(String string, int i, int j, int k) {
//		// TODO 自動生成されたコンストラクター・スタブ
//	}
package challenge11;

public class Main {

	static Car[] kei = {
			new KeiCar("A",300000,24,4,1),
			new KeiCar("B",280000,23,4,0),
			new FamilyCar("H",450000,18,5,1000,1),

	};

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		print();

	}

	/*
	 *広告表示
	 */
	public static void print() {
		System.out.println();
		for(int i=0;i<kei.length;i=i+1) {
			kei[i].print();
			kei[i].other_print();
			System.out.println();
		}
	}

}

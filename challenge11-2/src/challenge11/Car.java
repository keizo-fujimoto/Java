package challenge11;

abstract class Car {

	String name;	//車種名
	int price;		//価格
	int fuel;		//燃費
	int num;		//乗員

	public  Car(String name,int price,int fuel,int num) {
		this.name = name;
		this.price = price;
		this.fuel = fuel;
		this.num = num;
	}
	/*
	 * 広告表示　ベース部分のみ
	 */
	public void print() {
		System.out.println(name);
		System.out.println("金額:"+price);
		System.out.println("燃費:"+fuel+":"+"乗員:"+num);
	}

	abstract void other_print(); //車種特有の広告表示

}
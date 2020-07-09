package challenge11;

public class KeiCar extends Car{

	int air;		//エアコン有無 1:有り 0:無し

	public KeiCar(String name, int price, int fue, int num,int air) {
		super(name, price, fue, num);
		this.air = air;
	}
	@Override
	void other_print() {
		if(air==1) {
			System.out.println("エアコン:有り");
		}else {
			System.out.println("エアコン:無し");

		}

	}

}

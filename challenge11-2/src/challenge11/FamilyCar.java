package challenge11;

public class FamilyCar extends Car{
	int displace;	//排気量
	int auto;		//自動運転 1:有り、2:なし

	public FamilyCar(String name, int price, int fue, int num,int displace,int auto) {
		super(name, price, fue, num);
		this.displace = displace;
		this.auto = auto;
	}

	@Override
	void other_print() {
		System.out.println("排気量:"+displace);
		if( auto == 1) {
			System.out.println("自動運転:有り");
		}else {
			System.out.println("自動運転:有り");
		}

	}

}

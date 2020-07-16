package step12;

public class Child extends Parent implements Curve.Fork{
	public void child01() {
		System.out.println("child01");
	}
	public void child02() {
		System.out.println("child02");
	}
	public void parent02() {
		System.out.println("child-parent02");
	}
	void parent03() {
		// TODO 自動生成されたメソッド・スタブ
 
	}
	public void fork01() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(Curve.PI);
 
	}
	@Override
	public void curve01() {
		// TODO 自動生成されたメソッド・スタブ
 
	}
}


package step11;

public class Child extends Parent {
	public void child01() {
		System.out.println("child01");
	}

	public void child02() {
		System.out.println("child02");
	}

	@Override
	public void parent02() {
		System.out.println("child-parent02");
	}

	@Override
	void parent03() {

	}
}
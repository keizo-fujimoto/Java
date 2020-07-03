package step10;

import step11.Child;

public class Main {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.child01();
		ch.child02();
		ch.parent01();
		ch.parent02();
 
		Sub hensu = new Sub(7);
		hensu.print();
		System.out.println(Sub.getNum());
	}

}



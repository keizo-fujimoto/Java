package compute;

import java.util.Scanner;

public class Keisan {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.println("数値を入力してください");
	    double suji1 = scan.nextDouble();
		System.out.println("数値を入力してください");
	    double suji2 = scan.nextDouble();

	    double kotae = suji1 + suji2;
	    System.out.println(suji1 + "+" + suji2 + "=" + kotae);

	    kotae = suji1 - suji2;
	    System.out.println(suji1 + "-" + suji2 + "=" + kotae);

	    kotae = suji1 * suji2;
	    System.out.println(suji1 + "*" + suji2 + "=" + kotae);

	    kotae = suji1 / suji2;
	    System.out.println(suji1 + "/" + suji2 + "=" + kotae);
	}

}

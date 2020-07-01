package input;

import java.util.Scanner;

public class Hensu2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name;
		String age;
		String str = "です。";

		Scanner scan = new Scanner(System.in);
		System.out.println("名前を入力してください");
		name = scan.next();
		System.out.println("年齢を入力してください");
		age = scan.next();

		System.out.println("私の名前は、");
		System.out.println(name);
		System.out.println(str);

		System.out.println("年齢は、");
		System.out.println(age);
		System.out.println(str);

	}

}

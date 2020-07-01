package step05;

import java.util.Scanner;

public class Handan3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.println("好きな果物を入力してください");
		String str = scan.next();

		boolean b;
		b = str.equals("みかん");
		if(b==true){
			System.out.println("1:私も好きです！");
		}
		if(b==false){
			System.out.println("1:ジュースにしてもおいしそうですね");
		}
	}

}

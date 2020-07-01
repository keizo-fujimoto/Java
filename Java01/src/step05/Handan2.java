package step05;

import java.util.Scanner;

public class Handan2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int target = 100;
		System.out.println("数値を入力してください");
		int num = scan.nextInt();

		if(num == target){
			  String message = "=:" + num + "は" + target + "と等しいです。";
			  System.out.println(message);
		}

		if(num != target){
			  String message = "!=:" + num + "は" + target + "と等しいくないです。";
			  System.out.println(message);
		}

		if(num < target){
			  String message = "<:" + num + "は" + target + "より小さいです。";
			  System.out.println(message);
		}

		if(num <= target){
			  String message = ">=:" + num + "は" + target + "以下です。";
			  System.out.println(message);
		}

		if(num > target) {
			String message = ">:" + num + "は" + target + "より大きいです。";
			System.out.println(message);
		}

		if(num >= target) {
			String message = ">=:" + num + "は" + target + "以上です。";
			System.out.println(message);
		}
	}

}
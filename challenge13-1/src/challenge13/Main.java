package challenge13;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		System.out.println("数値を入力してください");

		Scanner scan = new Scanner(System.in);

		try {
			int input = scan.nextInt();
			System.out.println("入力された値は" + input + "です。");

		}catch (InputMismatchException e){

			System.out.println("数値以外が入力さました。再度実行してください。" + e);
		}
		catch(Exception e) {
			System.out.println("異常な状態になりました。再度実行してください。");
		}
	}
}
//エクセプションにて他のエラーをキャッチ
//商品を増やしたり広告を増やしたりして練習すること
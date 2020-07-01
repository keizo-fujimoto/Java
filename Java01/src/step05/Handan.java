package step05;

import java.util.Scanner;

public class Handan {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);

			System.out.println("リンゴはおいくらですか？");
		    int price = scan.nextInt();

			if(price > 100){
			  System.out.println("高いですね。まけてください。");
			}
	}

}
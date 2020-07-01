package step03;

import java.util.Scanner;

public class Moji3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字列,文字列　の形式で入力してください");
		Scanner scan = new Scanner(System.in);
		String moji = scan.next();

		int ichi = moji.indexOf(",");
		String one = moji.substring(0,ichi);

		System.out.println(one);
	}

}

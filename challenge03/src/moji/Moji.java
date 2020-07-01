package moji;

import java.util.Scanner;

public class Moji {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字を入力してください");
	    Scanner scan = new Scanner(System.in);
	    String moji = scan.next();

		int kazu = moji.length();
		System.out.println("入力文字数は"+kazu + "文字です。");

		String moji2 = moji.replace("です。","だなも。");
		System.out.println(moji2);

		int ichi = moji.indexOf("「");
		String moji3 = moji.substring(ichi+1,ichi+4);
		System.out.println(moji3);


	}

}

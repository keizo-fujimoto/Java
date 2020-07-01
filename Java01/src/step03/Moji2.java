package step03;

import java.util.Scanner;

public class Moji2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字を入力してください");
		Scanner scan = new Scanner(System.in);
		String moji = scan.next();

		int le = moji.length();
	    System.out.println(le);

		String re = moji.replace("い","ABC");
		System.out.println(re);

		int lo = moji.indexOf("か");
	    System.out.println(lo);

		moji = moji.substring(0,1);
		System.out.println(moji);
		System.out.println("あいうえお".indexOf("いう"));
	}

}

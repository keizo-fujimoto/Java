package challenge12;

import java.util.Scanner;

public class Main {
	//各項目比較用のクラスを作成
	static Yomi yomi = new Yomi();		//よみがな
	static Tensu tensu = new Tensu();		//平均点数
	static Height height = new Height();	//身長
	//生徒リスト
	static Students students = new Students();

	public static void main(String[] args) {
		int sel = select();
		sort(sel);
		students.list();		//ソート結果表示
	}

	/*
	 * 並べる項目を選択
	 */
	public static int select() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("並び替える項目を選択してください");
	    System.out.println("1.名前");
	    System.out.println("2.テスト");
	    System.out.println("3.身長");
	    System.out.println("-------------");
	    return scan.nextInt();
	}

	/*
	 * ソート処理呼び出し
	 */
	public static void sort(int sel) {
		//選択された項目によりソート処理の比較クラスを入れ替える
		if( sel == 1) {		//名前
			students.changeItem(yomi);
		}
		if( sel == 2) {		//点数
			students.changeItem(tensu);
		}
		if( sel == 3) {		//身長
			students.changeItem(height);
		}
		//ソート処理呼び出し
		students.sort();

	}

}

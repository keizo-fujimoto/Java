package challenge6;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		for (;;) {
			System.out.println("数値を入力してください。終了時は99を入力してください");
			int j = stdIn.nextInt();
			if (j == 99) {
				break;
			}

			String formula;
			int sum = 0;
			for (int i = 1; i <= j; i++) {
				sum += i;
				if (i >= 2) {
					int middle = i - 1;
					formula = middle + "+";
					System.out.print(formula);
				}
			}

			System.out.println(j + "=" + sum);

		}
	}
}

/* TODO 自動生成されたメソッド・スタブ
Scanner scan = new Scanner(System.in);

for(;;) {
	//99が入力されたらループを抜ける
	System.out.println("数値を入力してください。終了時は99を入力してください");
	int num = scan.nextInt();
	if(	num == 99){
		break;
	}

	int count = 0;                  	//和を計算する変数
	String str = "";                   	//計算結果表示用の変数

	//1から入力された数値までを足す
	for(int i = 1;i<=num;i++){
		count = count + i;
		str = str + i + "+";         	/*結果を表示するため「1+2+・・・」
                                       	  の文字列を作成　*/
//	}

	/*文字列の最後が「+」になっているので省く
   		例)  1+2+3+  -> 1+2+3                   */
/*	int len = str.length() - 1;
	String str2 = str.substring(0,len);	//最後の「+」を除いて別の変数に格納
	str2 = str2 + "=" + count;
	System.out.println(str2);           //結果の表示
}
System.out.println("終了しました");           //結果の表示
*/

package step05;

import java.util.Scanner;

public class Handan5 {

	public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

			System.out.println("免許取得から何年ですか？");
			int keika = scan.nextInt();;
			System.out.println("何年無事故無違反ですか？");
			int mujiko =  scan.nextInt();

			if( keika >= 5 ){
				if(mujiko >= 5){
				    	System.out.println("ゴールド免許です");
				}else{
				    	System.out.println("あと"+(mujiko-1)+"年無事故無違反で、ゴールド免許です。");
				    }
				}
		}

}

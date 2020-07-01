package step05;

import java.util.Scanner;

public class Handan4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.println("数学のテストの点数を入力してください");
		int ten = scan.nextInt();

		if(ten >= 80){
			System.out.println("合格");
		}else{
			System.out.println("不合格");
		}
	}

}

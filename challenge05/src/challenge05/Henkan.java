package challenge05;

import java.util.Scanner;

public class Henkan {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		{// 西暦を和暦に変換する
			int year;
			int num = 0;
			String japaneseYear;
			// 西暦を入力する
			System.out.println("西暦年を入力してください");
			year = scan.nextInt();

			// 西暦を和暦に変換する

			if (year >= 2019) {
				num = year - 2019;
				japaneseYear = "令和";
			}

			else if (year >= 1989) {
				num = year - 2019;
				japaneseYear = "平成";
			} else {
				japaneseYear = "昭和";
				num = year - 2019;
			}
			num = num + 1;
			System.out.println("num="+num);
			System.out.println("year="+year);
			System.out.println("japaneseYear="+japaneseYear);

			System.out.println(japaneseYear + num);
			if (num == 1) {
				japaneseYear = japaneseYear + "元";
			}else {
				japaneseYear=japaneseYear + num;
			}
			//1年は宿題
			System.out.println(year + "年は" + japaneseYear + "年");
		}
	}
}

package challenge08;

import java.util.Scanner;


public class Kiban {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1〜8の数値を入力してください");
		int a = stdIn.nextInt();
		System.out.println("1〜8の数値を入力してください");
		int b = stdIn.nextInt();
		int table[][] = new int[8][8];
		String [] k = {"〇","●"};
		table [0][0] = 1;
		table [0][1] = 1;
		table [a-1][b-1] = 1;
		/*
		for (int i = 1; i < table[1].length; i++) {
			for (int j = 1; j < table[1].length; j++) {
				if (a-1 == i && b-1 == j) {
					table[i][j] = 1;
				}else {
					table[i][j] = 0;

				}
			}
		}
		*/
		for (int i = 0; i < table[1].length; i++) {
			for (int j = 0; j < table[1].length; j++) {
				String cell = null;
				cell = k [table[i][j]];
//				//if (table[i][j] == 0) {
//					cell = "◯";
//				}else {
//
//					cell = "●";
//				}
				System.out.print(cell);
			}
			System.out.println();
		}
	}
}


/*

package challenge08;

import java.util.Scanner;


public class Kiban {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1〜8の数値を入力してください");
		int a = stdIn.nextInt();
		System.out.println("1〜8の数値を入力してください");
		int b = stdIn.nextInt();
		int table[][] = new int[8][8];
		for (int i = 0; i < table[0].length; i++) {
			for (int j = 0; j < table[1].length; j++) {
				if (a == i && b == j) {
					table[i][j] = 1;
				}else {
					table[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < table[0].length; i++) {
			for (int j = 0; j < table[1].length; j++) {
				String cell = null;
				if (table[i][j] == 0) {
					cell = "◯";
				}
				if (table[i][j] == 1) {
					cell = "●";
				}
				System.out.print(cell);
			}
			System.out.println();
		}
	}
}
*/

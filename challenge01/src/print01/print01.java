package print01;

import java.util.Scanner;

public class print01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.println("数値を入力してください。終了時は99を入力してください");
		int num = scan.nextInt();
		String str ="";

		for(int i=0;i<num;i=+1){
			str =  str + i;
			str = i + str;

		    if(i > 10) {
		    	break;
		    }
		    System.out.println(i + str);

		    System.out.println("数値を入力してください。終了時は99を入力してください");
		}
	}
}

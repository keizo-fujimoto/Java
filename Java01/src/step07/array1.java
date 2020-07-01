package step07;

public class array1 {

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			int[] kin = {100,120,200,80,500,220,300};//商品毎の購入金額
			int kei = 0;
			int i;

			//配列の個数分ループを行う
			for(i=0; i<kin.length; i=i+1){
			   kei = kei + kin[i];         //金額の合計を計算
			}

			System.out.println("残高は" + (2000-kei) +"円です");

		}

	}
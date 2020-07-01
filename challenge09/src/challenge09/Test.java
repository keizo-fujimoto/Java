package challenge09;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
				//税抜価格
				int price1 = 800;
				int[] price2 = {200,600,400};
				int price3[][] = {
				               {240,600},
				               {440,800},
		 
				};
		 
				System.out.println(tax(price1));
		 
				for(var i = 0;i < price2.length;i = i + 1 ){
					System.out.println(tax(price2[i]));
				}
		 
				for(var i = 0;i < price3.length;i = i + 1){
				    for(var j = 0;j < price3[0].length;j = j + 1){
				    	System.out.println(tax(price3[i][j]));
				    }
				}
			}
			// 消費税計算
			public static int tax(int price) {//型とメソッド名前
				int ans = (int) (price * 1.1);//ansは消費税の計算する値の型で、宣言式は計算した引数を受け取る変数
				return ans;
			}
		 
		}
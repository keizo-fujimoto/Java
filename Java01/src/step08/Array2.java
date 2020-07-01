
package step08;

public class Array2 {

	public static void main(String[] args) {


			String[][] hairetsu = {
					{"あ","い"},//1行目
					{"か","き"},//2行目
					{"さ","し"} //3行目
			};

			//行数分ループ
			for(int i = 0;i < hairetsu.length;i = i + 1){
				//列数分ループ
				for(int j = 0;j< hairetsu[0].length;j = j + 1){
					System.out.println(i+"行"+j+"列="+hairetsu[i][j]);
				}
			}

		}
	}
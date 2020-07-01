package step06;

public class Loop3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;

		for(;;){
		    i = i + 1;
		    if( i > 10){
		       break;
		    }
		    System.out.println("i="+i);
		}
		System.out.println("終了しました。");
	}

}

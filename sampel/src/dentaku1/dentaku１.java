package dentaku1;

public class dentaku１ {
	public static void main(String args[]) {
		
	
	int val1 = 0; //最初の数字
	int val2 = 0; //次の数字
	String ope; //演算子
	
	if (args.length !=3) {
		System.out.println("Usage : Java dentaku 数値　演算子　数値");
		System.out.println("演算子は kake waru tasu hiikuの4つです");
		System.exit(0); //プログラムを終了する
	}
	
	val1 = Integer.parseInt(args[0]);
	val2 = Integer.parseInt(args[2]);
	ope = args[1];
	
	System.out.println("入力された式は" + val1 + " " + ope + " " + val2 + "です");
	}
}

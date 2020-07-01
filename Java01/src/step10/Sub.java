package step10;
			//クラス名
public class Sub {
	static private int num = 1;
	//mainでし要することができない
		public Sub(int num1) {
			System.out.println("Sub Start");
			num = num1;
		}

		static int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}
			static public void print() {
				System.out.println("Sub");

	}
}
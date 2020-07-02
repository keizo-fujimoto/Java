package step13;

public class Main {

	public static void main(String[] args) {
		try {
			Sub sub = new Sub();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("エラーが発生しました。");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("何らかのエラーが発生しました。");
			System.out.println(e.getMessage());

		}
		finally {
			System.out.println("finally");
		}
	}
}

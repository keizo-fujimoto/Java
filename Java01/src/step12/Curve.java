package step12;

public class Curve {
	public interface Curve {
		void curve01();
		double PI = 3.14;
		Curve cur;
		Child ch = new Child();
		cur = ch;
		cur.curve01();
		System.out.println(cur.PI);
		
	 
	}
}

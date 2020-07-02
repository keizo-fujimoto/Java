package challenge10;

public class Syouhin {

	private static String name;
	static int price;
	static int zaiko;

	 public Syouhin() {
	Syouhin[] syouhin = new Syouhin[3];
	Syouhin st = new Syouhin();
	Syouhin.setName("お茶");
	Syouhin.price = 110;
	Syouhin.zaiko = 5;
	syouhin[0] = st;
	System.out.println(Syouhin.getName());
	System.out.println(Syouhin.price);
	System.out.println(Syouhin.zaiko);
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Syouhin.name = name;
	}
}

//public class Student{
//	String name;
//	int english;
//	int suugaku;
//}

//Student[] students = new Student[10];  innsutannsu
//Student st = new Student();　　　　　　ｓｔインスタンス
//st.name = "山田";			ネームに山田
//st.english = 80;			英語の点数に
//st.suugaku = 45;
//students[0] = st;
//System.out.println(students[0].name);
//System.out.println(students[0].english);
//System.out.println(students[0].suugaku);
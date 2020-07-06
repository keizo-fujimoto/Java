package challenge12;
/*
 * 生徒クラス(1名分)
 */
public class Student {
	private String name;	//名前
	private String yomi;	//よみがな
	private int tensu;		//平均点数
	private double height;//身長

	//ゲッター／セッターメソッド　行が長くなるので改行を省略しています。
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getYomi() {return yomi;}
	public void setYomi(String yomi) {this.yomi = yomi;}
	public int getTensu() {return tensu;}
	public void setTensu(int tensu) {this.tensu = tensu;}
	public double getHeight() {return height;}
	public void setHeight(double height) {this.height = height;}

	//コンストラクタ
	public Student(String name,String yomi,int tensu,double height) {
		this.name = name;
		this.yomi = yomi;
		this.tensu = tensu;
		this.height = height;
	}

}

package challenge12;
/*
 * 生徒用クラス
 */
public class Students {

	SortItem item;			//比較処理を格納するインタフェース変数

	Student[] students = {	//クラスstudentを配列にし生徒を表現
			new Student("佐藤","さとう",80,168.5),
			new Student("鈴木","すずき",20,156.0),
			new Student("高橋","たかはし",55,170.2),
			new Student("田中","たなか",35,145.5),
			new Student("伊藤","いとう",70,168.7),
	};

	/*
	 * リスト表示
	 */
	public void list() {
		for(int i=0;i<students.length;i=i+1) {
			System.out.println(students[i].getName()+"("+students[i].getYomi()+
							"):点数="+students[i].getTensu()+":身長="+students[i].getHeight());
		}
	}

	/*
	 * 比較処理の変更
	 */
	public void changeItem(SortItem item) {
		this.item = item;
	}

	/*
	 * ソート処理
	 */
	public void sort() {
		for(int i=0;i<students.length;i=i+1) {
			for(int j=students.length-1;j>i;j=j-1) {
				if(item.compare(students[i], students[j])){ //インタフェース変数により比較処理を呼び出す
					Student s = students[i];
					students[i] = students[j];
					students[j] = s;

				}
			}
		}
	}
}

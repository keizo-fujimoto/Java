package challenge12;
//身長で比較するためのクラス
public class Height implements SortItem{

	@Override
	public boolean compare(Student student1, Student student2) {
		if( student1.getHeight() > student2.getHeight()) {
			return false;
		}
		return true;
	}
}

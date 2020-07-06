package challenge12;
//点数でソートするためのクラス
public class Tensu implements SortItem{

	@Override
	public boolean compare(Student student1, Student student2) {
		if( student1.getTensu() > student2.getTensu()) {
			return false;
		}
		return true;
	}
}

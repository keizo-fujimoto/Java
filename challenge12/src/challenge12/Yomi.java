package challenge12;
//よみがなでソートするためのクラス
public class Yomi implements SortItem{

	@Override
	public boolean compare(Student student1, Student student2) {
		if( student1.getYomi().compareTo(student2.getYomi()) > 0 ) {
			return false;
		}
		return true;
	}

}

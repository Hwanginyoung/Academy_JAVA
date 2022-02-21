package Ch21;

import java.util.HashMap;
import java.util.Map;

public class C08Map {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap();
		
		map.put("이것이 리눅스다", 1010); //key,value (책이름,책코드)
		map.put("DOITJAVA", 2020); //key,value (책이름,책코드)
		map.put("혼자공부하는JAVA", 3030); //key,value (책이름,책코드)
		
		//1)개수확인
		System.out.println("개수 : "+ map.size());
		//2)전체 책정보 출력
		
		//3)DOITJAVA 삭제
		int rmval = map.remove(2020);
		System.out.println("삭제확인 : "+ rmval);
		System.out.println("삭제이후개수 : "+ map.size());

	}

}

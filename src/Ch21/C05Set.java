package Ch21;

class Person {
	String name;
	String addr;
	
	//생성자(모든필드)
	//toString() : 모든필드 출력
}

public class C05Set {

	public static void main(String[] args) {

		Set<Person> Set = new HashSet();
		
		//삽입
		set.add(new Person("홍길동", "대구"));
		set.add(new Person("홍길동", "대구"));
		set.add(new Person("강남구", "서울"));
		
		//개수확인
		System.out.println("개수 : "+ set.size());
		
	}

}

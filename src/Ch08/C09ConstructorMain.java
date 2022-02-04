package Ch08;

//생성자
//객체 생성시에 멤버의 초기값을 설정하는데 사용되는 메서드(함수)
//생성자메서드는 반환자료형ㅇ르 가지지 않고 클래스명과 동일하다
//객체생성시에 한번 호출
//Simple obj = new Simple();

//디폴트 생성자
//클래스 내에 생성자가 명시되지 않았을때 컴파일러에 의해 삽입된는 기본 생성자
//디폴트 생성자는 멤버의 초가깂ㅇ르 0(or NULL)로 초기화
//정수자료형 : 0
//실수자료형 : 0.0
//char : '\0'
//string : null

class C09Simple {
	//속성
	int x;		//정수자료형
	double y;	//실수자료형
	char z;		//char자료형
	String str;	//String클래스 자료형

	//생성자 (기본생성자의 형태)
	C09Simple() {
		System.out.println("디폴트 생성자 호출!");
		x=10;
	}
	//기능
	void ShowMember {
		Ststem.out.println("정수멤버 : "+ x);
		Ststem.out.println("실수멤버 : "+ y);
		Ststem.out.println("단일문자멤버 : "+ z);
		Ststem.out.println("문자열멤버 : "+ str);
	}
}

public class C09ConstructorMain {
	public static void main(String[] args) {

		C09Simple obj = new C09Simple();
		System.out.println("obj.x = "+ obj.x);
		//System.out.println("obj.x = "+ obj.x);
		obj.ShowMemver();
	}

}

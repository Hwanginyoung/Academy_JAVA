package Ch13;

//오버라이딩
//상위클래스로 부터 물려받은 메서드를
//하위클래스에 재정의하는 방식
//메서드의 헤더는 고정으로 두고
//메서드의 본체{}를 수정을 허용

//오버로딩 vs 오버라이딩
//오버로딩?  함수의 이름은 고정, 메개변수와 반환형은 변하도록 허용한 문법, 상속을 전제로 하지 않는다.
//오버라이딩? 상속관계를 전제로 하여 상위클래스로부터 물려받은 메서드의 헤더(머리)는 고정, 본체({})는 수정할수도 있도록 허용하는 문법

class Animal {
	public void Sound() {System.out.println("소리를 냅니다!");}
}

class Dob extends Animal{
	public void Sound() {System.out.println("멍멍 소리를 냅니다!");}
	
}
class Cat extends Animal{
	
	@Override
	public void Sound() {
		public void Sound() {System.out.println("냐용 소리를 냅니다!");}
	}
}

public class C05OverridingMain {
	public static void main(String[] args) {

		Dob poppi = new Dob();
		poppi.Sound();
		Cat yummi = new Cat();
		yummi.Sound();
	
	}

}

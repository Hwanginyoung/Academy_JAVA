package Ch08;

//메서드 오버로딩
//메서드의 이름은 그대로 두고 매개변수 타입이나, 개수, 반환자료형을 다양하게
//지정할 수 있도록 허용한 문법
//함수명의 통일을 위해 사용(개발자의 편의성을 위해)


import java.util.Scanner

class C07Calc {
	Scanner sc = new Scanner(System.in);
	
	int sum(int x, int y) {
		return x+y;
	}
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	double sum(double x, double y) {
		return x+y;
	}
}

public class C07MethodOverloadingMain {
	public static void main(String[] args) {

		C07Calc cal = new C07Calc();
		System.out.println("sum(x,y) : "+ sum(10,20));
		System.out.println("sum(x,y) : "+ sum(10,20,30));
		System.out.println("sum(x,y) : "+ sum(10,20,20.2));
		
		
	}
}

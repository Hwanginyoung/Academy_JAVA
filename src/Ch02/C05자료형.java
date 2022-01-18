package Ch02;

public class C05자료형 {
	public static void main(String[] args) {
		//--------
		//정수 자료형
		//--------
		//<<int (4byte정수)>>
//		int var1=0b1011;	//2진수
//		int var2=0206;		//8진수
//		int var3=365;		//10진수
//		int var4=0xB3;		//16진수
//		
//		System.out.println("var1 :" + var1);
//		System.out.println("var2 :" + var2);
//		System.out.println("var3 :" + var3);
//		System.out.println("var4 :" + var4);
		
		
		//<<byte(1byte)>>
//		byte var1 = -128;
//		byte var2 = -30;
//		byte var3 = 30;
//		byte var4 = 127;
		//byte var5 = 128; //불가능. byte의 정수 허용범위를 초과
							//-128 ~ 127
		//byte var6 = -129; //같은 이유
		//int var7 = 1000000000;
		//int는 약 -21억 ~ 21억까지 저장 가능
		
	
		//<<long(8byte)>>
//		long var=10;
//		long var2=20L; //L : 리터럴접미사(리터럴상수값뒤에 붙이는 기호,L,l:long, f,F:float) 
//		//long var3=10000000000; //에러발생? 리터럴상수의 기본자료형 ing형 (-21억 ~+21익)
//		long var4=10000000000L;
		
		
		
		//------------
		//실수 자료형
		//------------
		//<<float : 4byte 실수 저장(소수점이하 6~9자리까지)>>
		//<<double: 8byte 실수 저장(소수점이하 16~18자리까지)>>
		
		//정밀도 테스트
//		float var1 = 0.1111111111111111F; //F,f접미사 :리터럵밧을 float형으로 저장 //0.11111111
//		double var2 = 0.1111111111111111; //리터럴실수값은 실수기본료형 double 저장 //0.1111111111111111
//		
//		System.out.println("var1 : " + var1);
//		System.out.println("var2 : " + var2);
		
		//지수형
//		double var3 =3e6; //3* 10^6, 저장자료형은double
//		double var4 =3e6F; //3*10^6, 저장자료형은 float
//		double var5 =2e-3; //2*10-3, 저장자료형은 double
//		System.out.println("var3 : " + var3); //3000000.0
//		System.out.println("var4 : " + var4); //3000000.0
//		System.out.println("var5 : " + var5); //0.002
		
		
		
		//------------
		//단일문자
		//------------
		//<<char 자료형 :2byte 정수 저장>>
		
//		char ch1='A';
//		char ch2='가';
//		System.out.println("ch1");
//		System.out.println("ch2");
//		//강제형변한(정수로)
//		System.out.println((int)ch1);
//		System.out.println((int)ch2);
//		//강제형변환(char)
//		System.out.println((char)4444);
//		System.out.println((char)3000);
		
		
		
		//------------
		//문자열
		//------------
		//<<string :클래스자료형을 문자열저장>>
		
//		String name = "홍길동"; //클래스자료형으로 변수를 만들게 되면 실제 데이터값이 
//							  //저장되는것이 아니라 실제 값이 있는 위치정보(참조값)가 저장됨
//		String job = "포르그래머";
//		System.out.println(name);    
//		System.out.println(job);
		
		
		
		//------------
		//Boolean
		//------------
		//<<boolean :true/false 저장, 1byte size>>
		
//		boolean flag = true; //or false;
//		flag = false;
		
		
		
	}

}

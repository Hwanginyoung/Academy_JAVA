package Ch03;

public class C02typeChange {
	public static void main(String[] args) {
		//강제형변환
		//넓은범위공간에 있는 값을 좁은공간에 대입하려고 하는 경우 컴파일 에러가 발생
		//이렇나 경우에 강제적으로 형변환을 프로그램에 의한 개입으로 처리
		//강제변환하는 경우에는 데이터손실 가능성이 높다
		
		int intval =44032;
		System.out.printf("%c\n",intval); //가
		char charval = (char)intval;
		System.out.printf("%c\n", charval); //가
		
		long longval = 500;
		intval = (int)longval;
		System.out.printf("%d\n", intval); //500
		
		double doubleval = 3.14;
		intval = (int)doubleval;
		System.out.println(intval); //3
		
		int num=129;				//00000000 00000000 00000000 10000001
		byte byteval = (byte)num;	//							 10000001
		System.out.println(num); //129
		System.out.println(byteval); //-127
		
	}
}

package Ch17;

public class C01NullPointerException {

	public static void main(String[] args) {

		try {
			String str = null;		//Null참조변수
			str.toString();			//객체정보 표시 String 메서드
		}
		catch (NullPointerException e) {
			//System.out.println("예외발생!...처리구간")
			//System.out.println(e.getCause()); //뭐땜에 발생했는지
			//System.out.println(e.toString()); //객체지향정보 확인
			//System.out.println(e.getStackTrace()); //예외객체의 위치정보
			e.printStackTrace();
		}
		
		System.out.println("실행해야되는 코드1")
		System.out.println("실행해야되는 코드2")

	}

}

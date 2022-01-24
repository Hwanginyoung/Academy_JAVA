package Ch06;

public class C05Prac {
	
	public static void main(String[] args) {
		
		//정수 하나 입력 받습니다
		//3의 배수 이면서 5의 배수라면 출력
		//3의 배수이면서 5의 배수는 아니면서 4의 배수라면 출력
		//3의 배수가 아니면서 4의 배수라면 출력
		//&&연산자는 쓰지 않습니다.
		Scanner sc = new Scanner(system.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		if(n%3==0) {
			if(n%5==0) {
				System.out.println("3과 5의 배수");
			} else if(n%4==0) {
				System.out.println("3과 4의 배수");
			}
		} else if(n%4==0) {
			System.out.println("4의 배수");
		} 
		
	
	}
}

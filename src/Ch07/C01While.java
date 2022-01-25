package Ch07;

public class C01While {

	public static void main(String[] args) {
		
		//01 while기본
		//탈출요소 추가
		//1)탈출용 변수
		//2)탈출조건식
		//3)조건식을 거짓으로 만들어주기위한 연산처리
//		int i=0;		//1)탈출용 변수
//		while(i<10) {	//2)조건식(거짓이되면 박복해제)
//			System.out.println("Hello World\n");
//			i++;		//3)조건식을 거짓으로 만들어주기위한 연산
//		}
		
		
		//02 1-10까지 합 구하기
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			System.out.println(i);
//			sum+=i; //sum=sum+i
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 : "+ sum);
		
		
		
		//<<<문제>>>
		//키보드로 정수하나 입력받아 1부터 n까지 합 구합니다.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		int n=nextInt();
//		int i=1, sum=0;
//		while(i<=n) {
//			sum+=i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d\n", n, sum);
		
		
		
		//키보드로 정수두개(n,m)을 입력받아 n부터 m까지의 합을 구합니다.
		//단, 처음입력할때 n<m조건을 만족해야 합니다.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 두 개 입력 : ");
//		int n=nextInt();
//		int m=nextInt();
//		
//		//swap
//		if(n>m) {
//			int tmp=n;	//tmp에 n값을 저장하고
//			n=m;		//n값에 m값을 넣고
//			m=tmp;		//m값에 tmp값을 넣는다.
//		}
//		
//		int sum=0;
//		int i=n;		//초기값
//		while(n<=m) {	//조건식
//			sum+=i;		//sum = sum + i;
//			i++;		//증감연산
//		}
//		System.out.print("%d부터 %d까지의 합 : %d\n", n, m, sum)
		
		
		
		//구구단
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 입력 : ");
//		int dan=nextInt();
//		int i=1;
//		while(i<=9) {
//			System.out.println(dan+" X "+i+" = "+(dan*i));
//			i++;
//		}
		
		
		
		//구구단 역순 (시작 : 9, 끝 : 1, 반복Interval : 1씩 감소)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 입력 : ");
//		int dan=nextInt();
//		int i=9;
//		while(i>=1) {
//			System.out.println(dan+" X "+i+" = "+(dan*i));
//			i--;
//		}
		
		
		
		//1부터 입력한 수까지 중에 짝수의 합 구하기
//		int i=0;
//		int sum=0;
//		while(i<=10) {
//			if(i%2==0) {
//				System.out.println("i : "+ i);
//				sum+=i;
//			} else {
//				
//			}
//			i++;
//		}
		
		
		
		//1부터 n까지의 수중에 3의 배수의 합만 구해서 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		int n = nextInt();
//		
//		int i=1;
//		int sum=0;
//		
//		while(i<=n) {
//			if(i%3==0) {
//				System.out.println("i : "+ i);//확인
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println("1부터 %d까지의 합 : %d\n", n,sum);
		
		
		

	}

}

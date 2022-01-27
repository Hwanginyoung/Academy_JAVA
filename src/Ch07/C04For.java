package Ch07;

public class C04For {
	
	public static void main(String[] args) {
		
		//hello world 10번 찍기
		// 초기값 , 조건식 , 탈출연산
		
//		int i=0; //초기값
//		while(i<10) { //조건식
//			System.out.println("Hello world");
//			i++; //탈출연산
//		}
		
//		for(int i=0; i<10; i++) {
//			System.out.println("Hello world");
//		}
		
		
		
		//for문을 이용해서 정수를 5개를 받고 합을 출력
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("정수 입력 : ");
//			int n=nextInt();
//			sum+=n;
//		}
//		System.out.println("합 : "+sum);
		
		
		
		//구구단수를 하나 받아서 for문으로 출력
//		Scanenr sc = new Scanner(System.in);
//		System.out.println("단 입력 : ");
//		int dan=nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+"X"+i+"="+(dan*i));
//		}
		
		
		
		//집가서 해보기(중첩 for~)
		//전체구구단 출력
//		for(int dan=2; dan<=9; dan++) {
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan+"X"+i+"="+(dan*i));
//			}
//		}
		
		//전체구구단 출력(역순)
//		for(int dan=9; dan>=2; dan--) {
//			for(int i=9; i>=1; i--) {
//				System.out.println(dan+"X"+i+"="+(dan*i));
//			}
//		}
		
		
		//while에서 했던 별찍기 for문으로도 해보기
		//*****
		//*****
		//*****
		//*****
		//i=행, j=별
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//*
		//**
		//***
		//****
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<=i; j++) {|
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//****
		//***
		//**
		//*		
//		for(int i=0; i<4; i++) {
//			for(int j=3; j<=3-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
	}

}

package Ch07;

public class C02While {

	public static void main(String[] args) {

		//중첩 while 기본
		//전체 구구단 출력
		//2단 ~ 9단
		
		//dan		i
		//2		1-9
		//3		1-9
		//4		1-9
		//5		1-9
		//...
		//9		1-9
		//--------------
		//dan=2		i=1
		//dan<=9		i<=9
		//dan++		i++
		
		
		
//		int dan=2;
//		int i=1;
//		
//		while(dan<=9) {
//			i=1; //초기값
//			
//			while(i<=9) { //조건식
//				System.out.println(dan+" X "+i+" = "(dan*i));
//				i++; //탈출연산
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		
		//전체 구구단 역순출력 (9단부터 1단출력)
//		int dan=9;
//		int i=1;
//		
//		while(dan>=2) {
//			i=1;
//			
//			while(i<=9) {
//				System.out.println(dan+" X "+i+" = "(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		
		//구구단 9X9부터 출력
//		int dan=9;
//		int i=1;
//		
//		while(dan>=2) {
//			i=9;
//			
//			while(i>=1) {
//				System.out.println(dan+" X "+i+" = "(dan*i));
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		
		//단수를 입력받아 단수보터 9단까지 출력
		
		
		
		//*****
		//*****
		//*****
		//*****
//		int i=0; //행
//		int j=0; //별
//		
//		while(i<4) {
//			
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//*
		//**
		//***
		//****
//		int i=0;
//		int j=0;
//		
//		while(i<4) {
//			j=0;
//			
//			while(j<=i) {
//				System.out.print("*")
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//****
		//***
		//**
		//*
//		int i=0;
//		int j=0;
//		
//		while(i<4) {
//			 j=0;
//			 
//			 while(j<=3-i) {
//				System.out.print("*")
//				j++;
//			 }
//			 
//			System.out.println();
//			i++;
//		}
		
		
		
		//   *
		//  ***
		// *****
		//*******
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		
//		while(i<4) {
//			//공백
//			j=0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			//별
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//*******
		// *****
		//  ***
		//   *
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		
//		while(i<4) {
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			//별
//			k=0;
//			while(k<=6-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//입력한 수만큼의 높이의 삼각형 찍기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = nextInt();
//		
//		int i=0; //행
//		int j=0; //별
//		
//		while(i<h) {
//			j=0;
//			
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++:
//		}
		
		
		
		//입력한 높이만큼 정삼각형을 찍어봅시다.
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 : ");
		int h = nextInt();
		
		int i=0; //행
		int j=0; //공백
		int k=0; //별
		
		while(i<=h-1) {
			//공백
			j=0;
			while(j<=(h-2)-i) {
				System.out.print(" ");
				j++;
			}
			
			//별
			k=0;
			while(k<=2*i) {
				System.out.print("*");
				k++;
			}
			
			System.out.println();
			i++;
		}
		
		
		
		
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		
		
		
		
		
		
	}

}

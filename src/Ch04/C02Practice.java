package Ch04;

public class C02Practice {
	
	public static void main(String[] args){
		//문제1
		//국어,영어,수학점수를 각각 입력받아 세수의 합(총점)을 구하시오
		//국어 :kor, 영어 :eng, 수학 :mat 라고 변수명을 정합니다.
		//총점변수명 : int sum
		//평균변수명 : double avg
		//스캐너장치 만들어서 sc.nextInt() 사용합니다.
		//평균의 소숫점은 유지될수있도록 형변환합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 점수 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		int sum = (kor+eng+mat);
		double avg = sum/3;
		System.out.println("세과목의 평균 : " + avg);
		
		sc.close();
		
	}

}

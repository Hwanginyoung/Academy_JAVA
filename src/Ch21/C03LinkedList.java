package Ch21;

class BOOK {
	int code;
	String title;
	
	//생성자 추가(모든 필드를 받습니다)
	public BOOK(int code,String title) {
		super();
		this
	}
	//toString()추가
}

public class C03LinkedList {

	public static void main(String[] args) {

		List<BOOK> list = new LinkedList();
		
		//키보드로부터 몇개의 책정보를 넣을지 입력(N)받은 다음
		//입력한 만큼의 책정보(code, title)을 받아서 list에 저장합니다
		//총저장된 책의 개수를 출력하고
		//list에 저장된 각 index의 code와 title을 출력합니다
		//삭제할 책이름(title)을 받아서 해당 책이름(title)을 가지는 BOOK객체를 list에서 제거(remove(i))합니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("개수 입력 : ");
		int no = sc.nextInt();
		
		while(true) {
			System.out.println("--------------MENU--------------");
			System.out.println("1 BOOK 정보 삽입");
			System.out.println("2 BOOK 정보 확인");
			System.out.println("3 종료");
			System.out.println("--------------MENU--------------");
			System.out.print("메뉴번호 : ");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("개수 입력 : ");
				int no = sc.nextInt();
				//입력받기
				int code = 0;
				String title = null;
				Book tmp = null;
			
				for(int i=0; i<no; i++) {
					System.out.printf("%d 번째 Code : ", i+1);
					code = sc.nextInt();
					System.out.printf("%d 번째 Title : ", i+1);
					title = sc.next();
				
					tmp = new BOOK(code, title);
					list.add(tmp);
				
					System.out.println();
				}
			}
			else if(menu == 2) {
				//출력하기
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).toString());
			}
			else if(menu == 3) {
				
			}
			else {
				System.out.println("번호 잘못 입력!");
			}
			
			

			
			}
		}
	}

}

package Ch21;

class BOOK {
	int code;
	String title;
	
	//생성자 추가(모든 필드를 받습니다)
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
		
		List<Profile> list = new Vector();
		Scanner sc = new Scanner(System.in);
		int n = null;
		String code = null;
		String title = null;
		Profile tmp = null;
		
		for(int i=0; i<n; i++) {
			System.out.print("제목 : ");
			title = sc.next();
			System.out.print("코드 : ");
			code = sc.next();
		}
		
		list.add(tmp);
		System.out.println();
		
		//책의 개수 출력
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%s, %s\n", list.get(i).code, list.get(i).title);
		}
		
		//삭제
		System.out.println("삭제할 책 제목 : ");
		list.remove()

	}

}

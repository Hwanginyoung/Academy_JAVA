package Ch21;

class StdInfo {
	int id;
	String name;
	String major;
	String addr;
	//생성자(모든필드)
	public StdInfo(int id, String name, String major, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.addr = addr;
	}
	//toString(모든필드)
	@Override
	public String toString() {
		return "StdInfo [id=" + id + ", name=" + name + ", major=" + major + ", addr=" + addr +"]";
	}
	//hashCode(id값 리턴)
	@Override
	public int hashCode() {
		return id;
	}
	//equals(id만 일치여부 확인)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StdInfo) {
			StdInfo down = (StdInfo)obj;
			return this.id == down.id;
		}
		return false;
	}
	
}

public class C09Map {
	public static void main(String[] args) {

		Map<Integer, StdInfo> map = new HashMap();
		//값삽입
		map.put(1010, new StdInfo(1010,"홍길동","컴퓨터공학","대구"));
		map.put(1010, new StdInfo(2020,"동길동","정보보호학과","서울"));
		map.put(1010, new StdInfo(3030,"서길동","미생물학과","부산"));
		map.put(1010, new StdInfo(4040,"남길동","국어국문학과","천안"));
		//개수확인
		System.out.println("개수 : "+ map.size());
		//조회
		Iterator<StdInfo> iter = set.iterator();
		while(iter.hasNext()) {
			StdInfo tmp = iter.next();
			System.out.println(tmp.toString());
		}
		//삭제
		map.remove("홍길동")
		//삭제이후 확인
		System.out.println("개수 : "+ map.size());

	}

}

package Ch22;

class C04Swing extends JFrame {
	
	public C04Swing() {
		//프레임 처리
		super("두번째 창입니다");
		setBounds(100,100,300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//패널처리
		JPanel panel = new JPanel();			//패널 객체 생성
		//panel.setBackground(Color.DARK_GRAY);	//패널 BG 지정 (Color.decode("#______));색상코드 사용가능
		add(panel);	//프레임창에 추가
		
		//Btn추가
		JButton btn1 = new JButton("btn1");
		btn1.setBounds(10,10,80,30);
		panel.add(btn1);
		JButton btn2 = new JButton("btn2");
		btn2.setBounds(100,10,80,30);
		panel.add(btn2);
	}
}

public class C04Button {

	public static void main(String[] args) {

		new C04Swing;

	}

}

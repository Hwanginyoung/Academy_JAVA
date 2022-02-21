package Ch22;

import javax.swing.JFrame;

//panel
//컴포넌트들을 그룹별로 묶어서 처리할때 사용

class C03Swing extends JFrame {
	
	public C03Swing() {
		//프레임 처리
		super("두번째 창입니다");
		setBounds(100,100,300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//패널처리
		JPanel panel = new JPanel();			//패널 객체 생성
		//panel.setBackground(Color.DARK_GRAY);	//패널 BG 지정 (Color.decode("#______));색상코드 사용가능
		add(panel);	//프레임창에 추가
	}
}

public class C03Panel {

	public static void main(String[] args) {

		new C03Swing();

	}

}

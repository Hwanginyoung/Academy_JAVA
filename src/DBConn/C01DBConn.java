package DBConn;

import java.sql.*;

public class C01DBConn {

	public static void main(String[] args) {

		Connection conn=null;
		PreparedStatement pstmt = null;
		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3330/javatestdb";//localhost->네트워크번호? : 연결되있음 연결가능
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 적재 완료");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected...");
			pstmt = conn.prepareStatement("inser into std_tbl values('ccc','씨이','서울')");
			int result = pstmt.excuteupdate();
			if(result!=0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try{pstmt.close();} catch(Exception e) {}
			try{conn.close();} catch(Exception e) {}
		}

	}

}

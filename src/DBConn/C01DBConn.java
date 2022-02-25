package DBConn;

import java.sql.*;

public class C01DBConn {

	public static void main(String[] args) {

		Connection conn=null;
		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3330/javatestdb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이브 적재 완료");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}

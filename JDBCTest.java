package lesson.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCTest test = new JDBCTest();
		try {
			test.connectMYSQL();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connectMYSQL() throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://localhost:3306/gisa";
		String id = "root";
		String pwd = "1234";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
		if(con!=null) {
			System.out.println("connected");
			con.close();
		} else {
			System.out.println("fail");
		}
		
	}
	
	public boolean insertData(String data) throws SQLException {
		//data를 gisa테이블에 삽입
		boolean flag = false;
		//990001,addx, 17, 29, 16, 49, 43,154,C,A,C
		String[] temp = data.split(",");
		//테이블에서 정의한 데이터인지 확인하고 전처리
		
		// 테이블 삽입 쿼리 작성
		String sql = "";
		// 컨넥션 객체 가져오기
		Connection con= this.getConnection();
		// 삽입 준비하기
		Statement stmt = con.createStatement();
		// 삽입하기
		int affectedCount = stmt.executeUpdate(sql);
		// 삽입결과 확인하고 flag에 세팅
		if(affectedCount > 0) {
			flag = true;
		}
		return flag;
	}
	
	public Connection getConnection() {
		Connection con= null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://localhost:3306/gisa";
		String id = "root";
		String pwd = "1234";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(jdbcURL,id,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}

	
}

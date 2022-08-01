package lesson.jdbc.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import lesson.jdbc.day2.GisaDAO;
import lesson.jdbc.day2.StudentVO;

public class TestCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCenter tc= new TestCenter();
		try {
			tc.readyTest();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readyTest() throws SQLException, IOException {
		GisaDAO dao = new GisaDAO();
		boolean flag  = dao.deleteData();
		if(flag) {
			System.out.println("테이블 데이터가 모두 삭제되었습니다.");
			dao.insertDataV2(this.getFileData());
			System.out.println("테이블 데이터를 다시 입력했습니다.");
		}
	}
	
	private ArrayList<StudentVO> getFileData() throws IOException{
		ArrayList<StudentVO> list = null;
		/////////////////////////////////////
		list = new ArrayList<StudentVO>();
		///////////////////////////////////////
		File file = new File("./Abc1115.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line= null;
		//////////////////////////////
		StudentVO vo = null;
		////////////////////////////////
		while((line=br.readLine())!=null) { //null은 파일의 끝을 가리킴
			////////////////////////////////
			vo = new StudentVO(line);
			list.add(vo);
			/////////////////////////////////
		}
		br.close();
		fr.close();
		return list;
	}

}

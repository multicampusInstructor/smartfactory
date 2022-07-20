package lesson.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCode {
	
	public void testDate() {
		//Date 클래스의 객체 생성
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.toLocaleString());
		
		String pattern = "yyyy년MM월dd일 HH시mm분ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(date);
		System.out.println(now);
	}
}




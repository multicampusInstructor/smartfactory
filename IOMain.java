package lesson.day9;

import java.io.FileNotFoundException;
import java.io.IOException;

public class IOMain {
	public static void main(String[] args) {
		IOMain main =new IOMain();
		main.test1();
	}
	public void test1() {
		CodeIO ci =new CodeIO();
		try {
			ci.readFile();
		} catch(FileNotFoundException fe) {
			System.out.println("file이 존재하지 않습니다.");
		} catch(IOException ie) {
			System.out.println("파일을 읽는데 문제가 발생했습니다.");
		}
		
	}
}

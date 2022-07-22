package lesson.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import lesson.day8.DateTimeService;

public class StreamCode {
	public void readFile() throws IOException {
		//Abc1115.csv파일 내용 읽고 출력하기
		System.out.println("readFile");
		File file = new File("./Abc1115.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line= null;
		while((line=br.readLine())!=null) { //null은 파일의 끝을 가리킴
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
	
	public void writeFile() throws IOException {
		//해당파일이 없으면 만들어서 실행된다.
		File file = new File("./test.txt");
		FileWriter fw = new FileWriter(file,true);
		PrintWriter pw = new PrintWriter(fw);
		DateTimeService ds = new DateTimeService();
		pw.println(ds.getDateTime(DateTimeService.TIME_ONLY));
		pw.close();
		fw.close();
		
	}
	
	public void readAndWriteFile() {
		//Abc1115.csv파일을 Abc1115_copy.csv파일로 복사하는 코드 작성하시오.
	}
}








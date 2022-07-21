package lesson.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeIO {
	public void readFile() throws FileNotFoundException, IOException {
		//File
		File file = new File("./Abc1115.csv");
		boolean flag = file.exists();
		if(flag) {
			System.out.println("welcome file exist");
			long size = file.length();
			String name = file.getName();
			System.out.println(size+","+name);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close(); //나중에 열린 것을 먼저 닫는다.
			fr.close();
		} else {
			System.out.println("file not exist");
		}
	}
}

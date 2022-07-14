package lesson.day4;

import java.util.Random;
import java.util.Scanner;

public class BasicCode {
	
	public void testAPI2() {
		//Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("input please >>> ");
		//String cmd = scan.nextLine();
		int cmd = scan.nextInt();
		System.out.println(cmd*10);
		scan.close();
	}
	public void testAPI() {
		//Random
		// 6번 반복 for문 작성
		for(int i=0;i<6;i++) {
			Random  r = new Random();
			int number = r.nextInt(45)+1; //0<=number<45
			System.out.println(number);
		}
	}
	
	public boolean isPrimeNumber(int num) {
		boolean result = false;
		int number = num;
		int n = 0;
		int count = 0;
		for(int i=0;i<number;i++) {
			n = n + 1;
			if (number%n==0) {
				System.out.println("나누어 떨어짐 "+n);
				count++;
			}
		}
		
		if (count==2) {
			result = true;
		} 
		
		return result;
	}
	
	public void testWhile2() {
		// 소수판별
		// 소수란 1과 자기자신으로만 나누어지는 수
		int number = 5;
		// number가 소수임을 판별하는 코드를 작성하시오
		//n= 1~5
		int n = 0;
		int count = 0;
		for(int i=0;i<5;i++) {
			n = n + 1;
			if (number%n==0) {
				System.out.println("나누어 떨어짐 "+n);
				count++;
			}
		}
		
		if (count==2) {
			System.out.println(number+" 소수");
		} else {
			System.out.println(number+" 일반수");
		}
		
	}
	
	
	public void testWhile() {
		int number = 2391862;
		int total = 0;
		//반복문중에 while
		boolean isStop = false;
		while (!isStop) {
			int splitNumber = number % 10;
			System.out.println(splitNumber);
			total = total + splitNumber;
			number = number / 10;
			if (number==0) {
				isStop = true;
			}
		}
		System.out.println(total);
			
	}
}

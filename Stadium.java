package lesson.day9;

import java.util.Random;
import java.util.Scanner;

public class Stadium {
	private Umpire umpire;
	public Stadium() {
		umpire = new Umpire();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stadium ncpark = new Stadium();
		ncpark.playBall();
	}
	private int makeHiddenNumber() {
		// 4자리 숫자 생성 (중복없이)
		// 4자리 숫자 생성(1000~9999)-중복숫자 있으면 안된다.
		int number = 0;
		Random r = new Random();
		while(true) {
			number = r.nextInt(9000)+1000;
			int[] numbers = umpire.changeArray(number);
			boolean flag = this.isSameNumber(numbers);
			if(!flag) {
				//중복 숫자가 없음
				break;
			}
		}
		return number;
	}
	
	public boolean isSameNumber(int[] numbers) {
		boolean flag = false;
		
		return flag;
	}
	
	// 사용자와의 인터렉션 코드 작성
	public void playBall() {
		int hiddenNumber = this.makeHiddenNumber();
		int strike = 0;
		int ball = 0; // ball정보 추가
		
		umpire.setHiddenNumber(hiddenNumber);
		Scanner scan = new Scanner(System.in);
		while(true) {
			// 사용자로부터 4자리 숫자 입력(1000~9999)-중복숫자 있으면 안된다.
			System.out.print("예상 숫자를 입력하세요 >>> ");
			int tryNumber = scan.nextInt();
			// 입력숫자 판정 요청하고 결과 수령
			int[] result = umpire.judgeNumber(tryNumber);
			// 결과에 따라 반복 여부 결정
			strike = result[0];
			ball = result[1];
			if (strike==4 ) {
				break;
			}
			System.out.println(strike+" strike(s), "+ball+" ball(s)");
			System.out.print("계속 진행하겠습니까? [Yes:1, No:0]");
			int cmd = scan.nextInt();
			if(cmd==0) {
				System.out.println("감사합니다.\n 게임을 종료합니다.");
				break;
			}
		}
		scan.close();
		
	}

}

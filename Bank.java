package lesson.day4;

import java.util.Scanner;

public class Bank {
	// 사용자에게 메뉴를 보여 주고 선택한 메뉴에 맞게 처리를 하는 것
	// 사용자에게 입력 받고 내용을 바탕으로 작업한다.(잔액의 변화, 잔액의 출력)
	int balance;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.openBank();
	}
	
	public void openBank() {
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		while (!isStop) {
			// 메뉴을 보여준다.
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액 | 4. 종료");
			// 선택을 기다린다.
			System.out.print("메뉴 중 하나를 선택하세요 >>> ");
			
			int cmd = scan.nextInt();
			// 선택에 맞는 작업을 한다.
			switch(cmd) {
			case 1:
				System.out.println("입금 처리.");
				break;
			case 2:
				System.out.println("출금 처리.");
				break;
			case 3:
				System.out.println("잔금 확인.");
				break;
			case 4:
				isStop = true;
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			}
		}
		scan.close();
	}

}

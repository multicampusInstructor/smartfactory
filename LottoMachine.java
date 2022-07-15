package lesson.day5;

import java.util.Random;

public class LottoMachine {
	// 6개의 공을 선택하는 것
	private LottoBall[] balls;
	public LottoMachine() { /*기본 생성자와 동일하나 명시적으로 나타내었음*/	}
	public void setBalls(LottoBall[] balls) {
		this.balls = balls;
	}
	// 아래getter는 사용하지 않음. 단지 정보은닉성을 구성하는 방법을 보여주는 예임
	public LottoBall[] getBalls() {
		return this.balls;
	}
	
	public void startMachine() {
		this.selectBalls();
	}
	private void selectBalls() {
		// 선택된 6개의 볼을 출력한다.
		LottoBall[] selectedBalls = new LottoBall[6];
		for(int i=0;i<6;i++) {
			selectedBalls[i] = this.getBall();
		}
		System.out.println("이번주의 당첨번호는 >>> ");
		for(int i=0;i<selectedBalls.length;i++){
			System.out.print(selectedBalls[i].getNumber()+" ");
		}
		System.out.println(" 입니다.");
	}
	
	private LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		while(true) {
			int index = r.nextInt(45);
			ball = balls[index];
			if(!ball.isSelected()) { //중복처리 코드
				break;
			}
		}
		ball.setSelected(true);//뽑힌 공임을 표시함.
		return ball;
	}
}

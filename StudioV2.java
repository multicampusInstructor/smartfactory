package lesson.day8;

import java.util.ArrayList;

//로직+데이터를 가지고 목적을 이룸
//로또볼을 뽑으면 로또머신에서 밖으로 나오는 것으로 바꾸는 코드 작성하시오
//로또볼이 섞이는 것을 코드로 작성하시오
//제일 마지막에 뽑힌 공 모두를 오름차순으로 출력하는 코드를 작성하시오.
public class StudioV2 {
	private LottoMachine machine;
	public StudioV2() {
		machine = new LottoMachine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudioV2 mbc = new StudioV2();
		mbc.onAir();
	}
	
	public void onAir() {
		machine.setBalls(this.readyBalls());
		machine.startMachine();
	}
	
	public ArrayList<LottoBall> readyBalls() {
		ArrayList<LottoBall> balls = new ArrayList<LottoBall>();
		int ballNumber = 1;
		for(int i=0;i<45;i++) {
			balls.add(new LottoBall(i+1));
			//ballNumber = ballNumber + 1;
		}
		return balls;
	}

}

package lesson.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
//로직 처리
public class LottoMachineV3 {
	// 6개의 공을 선택하는 것
	private ArrayList<LottoBall> balls;
	public LottoMachineV3() { /*기본 생성자와 동일하나 명시적으로 나타내었음*/	}
	public void setBalls(ArrayList<LottoBall> balls) {
		this.balls = balls;
	}
	
	public void startMachine() {
		List<LottoBall> balls = null;
		try {
			balls = this.selectBalls();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//balls를 오름차순으로 정렬하여 코딩(정렬 로직)
		for(int i=0;i<balls.size()-1;i++) { //비교 위치의 값을 가르킴(해당 위치에 값을 결정)		
			for(int j=i+1;j<balls.size();j++) { // 비교대상의 위치 값을 가르킴
				LottoBall temp1 = balls.get(i); //매번 갱신함 (아래 교환 때문)
				LottoBall temp2 = balls.get(j);
				if(temp1.getNumber() > temp2.getNumber()) { //오름 차순 비교
					// 교환
					LottoBall temp = temp1;
					balls.set(i, temp2);
					balls.set(j, temp);
				}
			}
		}
		
		//출력
		System.out.println("이번주 로또 당첨번호는 >>> ");
		for(LottoBall ball : balls) {
			System.out.print(ball+" ");
		}
		System.out.println(" 입니다.");
	}
	
	/////////////////////////////// shuffle ///////////////////////
	public void testShuffle() {
		this.shufflueBalls();
	}
	
	private void shufflueBalls() {
		//볼을 섞는 코드 (교환 로직)
		Random r = new Random();
		for(int i=0;i<balls.size();i++) {
			int index1 = r.nextInt(balls.size());
			int index2 = r.nextInt(balls.size());
			LottoBall temp = balls.get(index1);
			balls.set(index1, balls.get(index2));
			balls.set(index2, temp);
		}
		//this.printBalls();
	}
	
	
	private void printBalls() {
		for(LottoBall ball : balls) {
			System.out.println(ball);
		}
	}
	////////////////////////////////////////////////////////////////////////////
	
	
	private List<LottoBall> selectBalls() throws InterruptedException {
		// 선택된 6개의 볼을 출력한다.
		List<LottoBall> selectedBalls = new ArrayList<LottoBall>();
		for(int i=0;i<6;i++) {
			this.shufflueBalls();
			selectedBalls.add(this.getBall());
			Thread.sleep(1000);
		}
				
		return selectedBalls;
	}
	
	private LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		int index = r.nextInt(balls.size());
		ball = balls.remove(index);
		System.out.println(ball+"번 공이 뽑혔습니다.");
		return ball;
	}
}

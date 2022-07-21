package lesson.day9;

public class Umpire {
	private int hiddenNumber;
	public Umpire() {}
	
	//코드 설계상 불가능
//	public Umpire(int hn) {
//		this.hiddenNumber = hn;
//	}
	
	public void setHiddenNumber(int hn) {
		this.hiddenNumber = hn;
	}
	public int[] changeArray(int number) {
		int[] result = new int[4];
		int index = -3;
		for(int i=0;i<result.length;i++) {
			int splitNumber = number % 10;
			result[index++] = splitNumber;
			number = number / 10;	
		}
		
		return result;
	}
	

	// 4자리 정수로 스트라이크와 볼을 판정하겠다.
	public int[]/*처리 결과는 어떤식으로 리턴되는가?*/ judgeNumber(int tryNumber/*요청은 어떤식으로 들어오는 가?*/) {
		int[] result = new int[2]; //0->스트라이크 1->볼
		// 실제 생성된 숫자는 어떻게 확보할 수 있는가?
		
		// 요청숫자와 생성숫자를 비교하여 결과를 리턴해야 하는데
		// hiddenNumber와 tryNumber를 비교하는 로직 생성
		int[] hiddenNumbers = this.changeArray(hiddenNumber);
		int[] tryNumbers = this.changeArray(tryNumber);
		int strike = 0;
		int ball = 0;
		for(int i=0;i<hiddenNumbers.length;i++) {
			for(int j=0;j<tryNumbers.length;j++) {
				if(hiddenNumbers[i]==tryNumbers[j]) {
					if(i==j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		
		result[0] = strike;
		result[1] = ball;
		// 종료조건이 4Strike가 종료조건이어서 4strike정보 전달
		// 그리고 ball정보도 리턴해서 사용자가 사용할 수 있도록 해야 한다.
		return result;
	}
}

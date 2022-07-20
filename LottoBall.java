package lesson.day8;
//데이터 표현
public class LottoBall {
	//ball의 정보를 갖고 있는것
	private int number;
	
	public LottoBall(int number) {
		this.number = number;
	}
	//getter,setter 생성하시오
	public int getNumber() {
		return this.number;
	}
	
//	public void setNumber(int number) {
//		this.number = number;
//	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.number);
	}
}

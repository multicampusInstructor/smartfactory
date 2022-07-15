package lesson.day5;

public class LottoBall {
	//ball의 정보를 갖고 있는것
	private int number;
	private boolean selected;
	
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
	
	public boolean isSelected() {
		return this.selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}

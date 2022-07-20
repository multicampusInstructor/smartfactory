package lesson.day8;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain tm = new TestMain();
		tm.test4();
	}
	public void test4() {
		DateTimeService dts = new DateTimeService();
		String now = dts.getDateTime(DateTimeService.DATE_ONLY);
		System.out.println(now);
	}
	public void test3() {
		TestCode tc = new TestCode();
		tc.testDate();
	}
	public void test1(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(IndexOutOfBoundsException io) {
			System.out.println("인덱스 에러 "+io.getMessage());
			io.printStackTrace();
		}
	}
	
	public void test2(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}

}

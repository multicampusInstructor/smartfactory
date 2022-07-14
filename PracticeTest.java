package lesson.day4;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		PracticeTest pt = new PracticeTest();
		// test1() 호출코드 작성
		pt.test4();
	}
	public void test4() {
		BasicCode bc = new BasicCode();
		bc.testAPI2();
	}
	public void test3() {
		BasicCode bc = new BasicCode();
		boolean result = bc.isPrimeNumber(12);
		if(result) {
			System.out.println("소수");
		} else {
			System.out.println("일반수");
		}
	}
	public void test2() {
		BasicCode bc = new BasicCode();
		bc.testWhile2();
	}
	public void test1() {
		PracticeCode pc = new PracticeCode();
		pc.viewMonth();
		pc.printDan(2);
		pc.printSum();
		pc.printSum(100);
		int var1 = pc.returnSum();
		int var2 = pc.returnSum(100);
	}

}

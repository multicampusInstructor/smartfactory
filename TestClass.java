package lesson.day10;

import java.io.IOException;

public class TestClass {
	// 문제를 푸는 장소
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass tc = new TestClass();
		tc.startSolvingQuiz();
	}
	
	public void startSolvingQuiz() {
		QuizSolution solution = new QuizSolution();
		try {
			solution.readyTestData();
			solution.solveQuiz2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

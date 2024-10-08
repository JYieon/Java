package quiz01;

public class QuizMain02 {
	// 3개의 이름을 입력받아 출력(배열 활용) (입,출력, main기능)
	public static void main(String[] args) {
		QuizTest02 t = new QuizTest02();
		String[] arr = t.myInput();
		t.print( arr );
	}
}

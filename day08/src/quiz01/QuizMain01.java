package quiz01;

public class QuizMain01 {
public static void main(String[] args) {
	// 이름을 입력받아 출력하는 프로그램( 입력기능, 출력기능, main)
		QuizTest01 t = new QuizTest01();
		String name = t.myInput();
		t.print(name);
	}
}

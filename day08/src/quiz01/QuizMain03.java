package quiz01;

public class QuizMain03 {
// 두수의 합를 입,출,연산, 메인 기능으로 만들기(배열 활용)
public static void main(String[] args) {
	System.out.println("--- array 이용 ---");
	QuizTest03 t = new QuizTest03();
	int[] arr = t.myInput();
	int result = t.op( arr );
	t.print( result, arr[0], arr[1] );
}
}

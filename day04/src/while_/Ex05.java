package while_;
//do while 
public class Ex05 {
	public static void main(String[] args) {
		//조건을 확인하는 식이 마지막에 있어서 무조건 한번은 실행된다.
		
		int su = 5, i = 10;
		do { //무조건 한번은 실행 -> 조건문 -> false -> do while문 종료
			System.out.println("do while : " + i);
			i++;
		}while( i < su );
		
		System.out.println("-----------------------");
		
		while( i < su ) { //실행 X
			System.out.println("do while : " + i);
			i++;
		}
	}
}

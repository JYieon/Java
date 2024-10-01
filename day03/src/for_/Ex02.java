package for_;

public class Ex02 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			System.out.print(i+", ");
		}
		System.out.println();
		
		int i = 0;
		for(; i <= 10; i++) {
			System.out.print(i+", ");
		}
		System.out.println();
		
		i = 0;
		for(; i <= 10;) {
			System.out.print(i+", ");
			i++;//증감식은 맨 마지막에 실행
		}
		System.out.println();
		
		
		for(; ;) {
			System.out.println(i+", ");
			i++;//증감식은 맨 마지막에 실행
		}
		
//		while(true) {
//			System.out.println(i+", ");
//			i++;
//		}
	}
}

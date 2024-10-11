package etc;

public class Ex03 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); //잠시동안 멈춤. 1/1000초 단위
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("시작");
		long start = System.currentTimeMillis(); //시작시간 얻어오기
		
		try {
			Thread.sleep(3000); //잠시동안 멈춤. 1/1000초 단위
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis(); //종료 시간
		System.out.println("종료");
		System.out.println((end - start)/1000);
		
	}
}

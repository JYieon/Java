package if_;
//런타임에러 해결
import java.util.Scanner;

public class MorningCall {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		int H = Input.nextInt(); 
		int M = Input.nextInt();
		
		if(H >= 0 && H <= 23) {
			
			if(M < 45) {
				M += 15;
				if(H == 0)
					H = 23;
				else H--;
					
			}
			else {
				M -= 45;
			}
		} 
		System.out.println(H + " " + M);
		
		return;
	}
}

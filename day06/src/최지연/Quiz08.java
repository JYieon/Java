package 최지연;

public class Quiz08 {
	public static void main(String[] args) {
		int rice = 100 * 1000;
		int g = 2;
		int day = 0;
		
		while(true) {
			if(rice <= 0)
				break;
			day++;
			rice -= (g * 20);
			if(day % 10 == 0)
				g *= 2;
		}
		System.out.println(day + "일 " + g + "마리");
	}
}

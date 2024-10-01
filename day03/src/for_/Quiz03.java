package for_;
//1~25 5X5 형식으로 출력.
//아직 for문까지 배웠기때문에 다중반복 안쓰고 for문과 if문으로 출력해봄
public class Quiz03 {
	public static void main(String[] args) {
		for(int i = 1; i <= 25; i++) {
			System.out.print(i+"\t");
			if (i%5==0)
				System.out.println("\n");
		}
	}
}

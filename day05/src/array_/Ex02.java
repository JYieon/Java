package array_;

public class Ex02 {
	public static void main(String[] args) {
		//int[] arr = new int[5];
		
		int[] arr = {100, 200, 300};
		double[] dou = {1.11, 2.22};
		String[] str = {"aaa", "bbb", "ccc"};
		
		//for(int i = 0; i < arr.length; i++)
		for( int a : arr ) { //arr의 값이 순차적으로 앞의 변수에 저장
			System.out.println(a);
		}
		for( double b : dou) {System.out.println(b);}
		for( String c : str) {System.out.println(c);}
		
		
	}
}

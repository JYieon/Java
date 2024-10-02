package array_;

public class Ex04 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3},{10,20,30},{100,200,300}};
		int[][] arr2 = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k]);
			}
			System.out.println("");
		}
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 3; k++) {
				System.out.println(i + ", "+ k);
				System.out.println(arr[i][k]);
			}
		}
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr[].length : "+arr[0].length);
	}
}

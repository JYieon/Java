package array_;

public class Ex05 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int[][][] arr3 = {
				{{1,2,3}, {10, 20, 30}},
				{{4,5,6}, {40, 50, 60}},
				{{7,8,9}, {70, 80, 90}},
		};
		System.out.println(arr3[0][0][1]);
		System.out.println(arr3[1][1][2]);
		System.out.println(arr3[2][1][1]);
		
		for(int i = 0; i < arr3.length; i++) {
			for(int k = 0; k < arr3[i].length; k++) {
				for(int j = 0; j < arr3[i][k].length; j++) {
					System.out.print(arr3[i][k][j] + " ");
				}
			}
			System.out.println("");
		}
		
		
		int[] a = {1, 1, 1, 1};
	}
	
}

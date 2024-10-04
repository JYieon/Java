package 최지연;

public class Quiz10 {
	public static void main(String[] args) { 
		int[] arr = new int[] { 4 , 8 , 2 , 7 , 6 };
		int j = arr.length - 1;
		
		while(j > 0) {
			for(int i = 0; i < j; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
			j--;
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}

package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3}, {4,5,6}};
		
		System.out.println(arr.length);     //행의 갯수 출력
		System.out.println(arr[0].length);  //첫 번째 행의 열 갯수 출력
		System.out.println(arr[1].length);  //두 번째 행의 열 갯수 출력
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
	}

}

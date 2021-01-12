import java.util.Arrays;

public class test21 {
	public static void main(String[] args) {

		// 문제
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		// 서로에 거리를 저장할 배열 생성
		int[][] point_length = new int[point.length][point.length];

		// 행과 렬을 기준으로 서로에 거리값을 기록
		for (int i = 0; i < point.length; i++) {
			for (int j = i; j < point.length; j++) {
				if (i == j) {
					point_length[i][j] = 100;
				} else {
					point_length[i][j] = Math.abs(point[i] - point[j]);

				}

			}

		}//end for

		int[] min_index = new int[2];
		int min = 100;
		for (int i = 0; i < point_length.length; i++) {
			for (int j = i; j < point_length.length; j++) {
				if (min > point_length[i][j]) {
					min = point_length[i][j];
					min_index[0] = i;
					min_index[1] = j;
				}

			}
		}//end for
		System.out.print("result : " + Arrays.toString(min_index));

	}
}

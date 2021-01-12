import java.util.Scanner;

public class test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 입력
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		int[][] num_list = new int[num][num];

		// 증가값 저장 변수
		int count = 1;

		// 배열에 저장
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				//짝수번째 행은 앞에서 부터 증가
				for (int j = 0; j < num_list[i].length; j++) {
					num_list[i][j] = count++;
				}
			} else {
				//홀수번째 행은 뒤에서 부터 증가
				for (int j = num_list[i].length - 1; j >= 0; j--) {
					num_list[i][j] = count++;
				}
			} // end if
		} // end for i

		//배열 출력
		for (int i = 0; i < num_list.length; i++) {
			for (int j = 0; j < num_list[i].length; j++) {
				System.out.print(num_list[i][j] + "\t");

			}//end for j
			System.out.println();
		}//end for i
	}
}

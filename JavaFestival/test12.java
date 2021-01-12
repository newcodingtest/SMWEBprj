import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 정하는 정수를 입력하시오 : ");
		int num = sc.nextInt();

		// 대입값
		int count = 1;

		// 2차원 배열 생성
		int[][] array = new int[num][num];

		// 배열에 집어 넣는 for문
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = count++;
			}
		}

		// 출력하는 for문
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
}

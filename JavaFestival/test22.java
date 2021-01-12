import java.util.Scanner;

public class test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 입력
		int num_list[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 수 입력 :");
			num_list[i] = sc.nextInt();
		}

		// 행과 렬을 기준으로 서로에 거리값을 기록
		for (int i = 0; i < num_list.length; i++) {
			for (int j = i; j < num_list.length; j++) {
				if (num_list[i] > num_list[j]) {
					int val = num_list[i];
					num_list[i] = num_list[j];
					num_list[j] = val;
				}
			} // end for
			System.out.print(num_list[i] + "\t");
		} // end for
		sc.close();
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 입력
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");

		// 2진수 저장할 배열 생성
		ArrayList<Integer> num_array = new ArrayList<Integer>();

		// while 조건 변수
		boolean set = true;

		// 2진수 변환하여 배열에 저장
		while (set) {
			// 2로 나눈 나머지를 배열에 입력
			if (num % 2 == 0) {
				num_array.add(0);
			} else {
				num_array.add(1);
			}

			// 더이상 2로 나눠지지 않는 조건
			if (num / 2 == 1) {
				num_array.add(1);
				set = false;
			} else if (num / 2 == 0) {
				num_array.add(0);
				set = false;
			}
			num /= 2;
		} // end for

		// 2진수 출력
		for (int i = num_array.size() - 1; i >= 0; i--) {
			System.out.print(num_array.get(i) + " ");
		}
		sc.close();
	}
}


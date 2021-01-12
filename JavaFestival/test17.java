import java.util.Scanner;

public class test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// 정수 입력
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		System.out.println("반복 횟수 : " + collatzNumber(num));

		sc.close();
	}

	public static int collatzNumber(int num) {
// while 조건 검사용
		boolean set = true;

// 횟수 측정용
		int count = 0;

// 조건문 반복 검사
		while (set) {

// System.out.print(num + " \t");
			if (num == 1) {
				break;
			} else if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			count++;
		}
// 횟수 출력
		return count;

	}
}

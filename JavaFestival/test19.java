import java.util.Scanner;

public class test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 입력
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");

		// 약수
		int count = 2;

		// while조건
		boolean while_set = true;

		while (while_set) {

			if (num % count == 0) {
				num = num / count;
				System.out.print(count);

				if (num <= 1) {
					while_set = false;
				} else {
					System.out.print(" * ");
				}
				
			} else {
				count++;
			}
		}//end while
		
	}
}

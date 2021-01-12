import java.util.Scanner;

public class test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		// 피보나치 수열 합
		int back = 0;
		int front = 1;
		
		// num까지 반복
		for (int i = 0; i < num; i++) {
			if (i == 1 ) {
				front = 1;
			}else {
				front += back;
				back = front - back;
			}
			System.out.println(front);
		}
	}
}

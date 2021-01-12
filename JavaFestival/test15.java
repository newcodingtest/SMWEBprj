import java.util.Scanner;

public class test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		// 출력값
		int sum = 1;
		
		// 증가값 저장
		int count = 0;
		
		// num까지 반복
		for (int i = 0; i < num; i++) {
			System.out.print((sum += count++) + " ");
		}
	}
}

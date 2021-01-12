import java.util.Scanner;

public class test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열에 각 숫자마다 필요한 대시'_'문자의 개수 저장
		// 0부터 9까지 순서대로 저장됨
		int[] num_count = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		// 숫자 문열로 입력
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String key_input = sc.next();

		// 출력값
		int sum = 0;

		// for문과 swich문을 이용하여 카운트
		for (int i = 0; i < key_input.length(); i++) {
			// charAt(index) > 문자열에서 인덱스에 해당하는 문자를 char형으로 반환
			// char를 아스키코드로 바꾸게 되면 0 = 48 이니 수정해줌
			int val = key_input.charAt(i) - 48;
			for (int j = 0; j < 10; j++) {
				if (val == j) {
					sum += num_count[j];
				}
			} // end for
		} // end for
		System.out.println("대시'_'의 총 합 >> " + sum);
		
		sc.close();
	}
}


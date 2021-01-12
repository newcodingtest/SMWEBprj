import java.util.Scanner;

public class test26 {
	static StringBuilder SB = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열에 각 숫자마다 필요한 대시'_'문자의 개수 저장
		// 0부터 9까지 순서대로 저장됨
		System.out.print("함호화할 문장을 입력 : ");
		String string = sc.next();
		System.out.print("문자 거리을 입력 : ");
		int num = sc.nextInt();

		System.out.println(ceasar(string, num));

		sc.close();
	}

	public static StringBuilder ceasar(String string, int num) {
		// 받은
		for (int i = 0; i < string.length(); i++) {
			int string_char = string.charAt(i);
			string_char += num;
			if (string_char > 90 || string_char > 122) {
				string_char -= 26;
			}
			SB.append((char) string_char);
		}
		return SB;
	}
}

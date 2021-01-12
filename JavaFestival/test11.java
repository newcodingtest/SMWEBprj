
public class test11 {
	public static void main(String[] args) {
		// 주어진 문제
		String score = "A,A,B,C,D,A,C,D,D,D,F";

		// 배열로 생성헤서 A부터 F까지 카운트 숫자 기록
		int[] count = new int[6];
		char[] fine_char = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// charAt()를 이용해서 배열을 하나씩 검사
		for (int i = 0; i < score.length(); i++) {
			for (int j = 0; j < fine_char.length; j++) {
				if (fine_char[j] == score.charAt(i)) {
					count[j]++;
				}

			}
		}
		for (int t = 0; t < fine_char.length; t++) {
			System.out.println(fine_char[t] + " : " + count[t] + "명");
		}
	}

}

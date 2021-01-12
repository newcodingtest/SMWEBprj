import java.util.Scanner;

public class test16 {
	static StringBuilder result = new StringBuilder(); 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문자열 입력
		System.out.print("문자열 입력 : ");
		String key_input = sc.next();

		// 정령된 숫자를 이용하여 다시 byte(아스키코드) > char(문자)로 변환하여 출력

		System.out.print(reverseStr(key_input));
		
		sc.close();
	}

	public static StringBuilder reverseStr(String key_input) {

		// 입력받을 문자열을 하나씩 저장할 byte 배열생성
		byte[] key_input_list = new byte[key_input.length()];

		// charAt()를 이용해서 입력받은 문자열을 char형으로 변환
		// char를 byte로 변환하면 아스키코드 번호를 얻을수 있음 대문자(65 ~ 90), 소문자 (97 ~ 122)
		for (int i = 0; i < key_input.length(); i++) {
			key_input_list[i] = (byte) key_input.charAt(i);
		}

		// 이를 이용하여 배열에 숫자 정렬 코드 작성
		for (int t = 0; t < key_input.length() - 1; t++) {
			for (int i = t + 1; i < key_input_list.length; i++) {
				if (key_input_list[t] > key_input_list[i]) {
					byte val = key_input_list[i];
					key_input_list[i] = key_input_list[t];
					key_input_list[t] = val;
				}
			} // end for
		} // end for

		//StringBuilder인 result에 차근차근 저장하여 리턴
		for (int i = 0; i < key_input_list.length; i++) {
			result.append((char)key_input_list[i]);
		}
		return result;
	}
	
}

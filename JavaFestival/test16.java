import java.util.Scanner;

public class test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ڿ� �Է�
		System.out.print("������ �Է� : ");
		String key_input = sc.next();

		// �Է¹��� ���ڿ��� �ϳ��� ������ byte �迭����
		byte[] key_input_list = new byte[key_input.length()];

		// charAt()�� �̿��ؼ� �Է¹��� ���ڿ��� char������ ��ȯ
		// char�� byte�� ��ȯ�ϸ� �ƽ�Ű�ڵ� ��ȣ�� ������ ���� �빮��(65 ~ 90), �ҹ��� (97 ~ 122)
		for (int i = 0; i < key_input.length(); i++) {
			key_input_list[i] = (byte) key_input.charAt(i);
		}

		// �̸� �̿��Ͽ� �迭�� ���� ���� �ڵ� �ۼ�
		for (int t = 0; t < key_input.length() - 1; t++) {
			for (int i = t + 1; i < key_input_list.length; i++) {
				if (key_input_list[t] > key_input_list[i]) {
					byte val = key_input_list[i];
					key_input_list[i] = key_input_list[t];
					key_input_list[t] = val;
				}
			} // end for
		} // end for

		// ���ɵ� ���ڸ� �̿��Ͽ� �ٽ� byte(�ƽ�Ű�ڵ�) > char(����)�� ��ȯ�Ͽ� ���
		for (int i = 0; i < key_input.length(); i++) {
			System.out.print((char) key_input_list[i]);
		}
	}
}
